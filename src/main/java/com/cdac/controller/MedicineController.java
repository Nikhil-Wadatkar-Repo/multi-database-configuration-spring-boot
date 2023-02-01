package com.cdac.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.beans.FeedbackDetails;
import com.cdac.beans.MedicineDetails;
import com.cdac.beans.RaiseRequest;
import com.cdac.beans.UpdateRaiseRequestBean;
import com.cdac.beans.UserDetails;
import com.cdac.repo.FeedbackRepository;
import com.cdac.repo.MedicineRepository;
import com.cdac.repo.RaiseRequestRepository;
import com.cdac.repo.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MedicineController {
	@Autowired
	private RaiseRequestRepository repo;
	@Autowired
	private FeedbackRepository feedbackRepo;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private MedicineRepository medRepo;

	@GetMapping("/medDetails/{medId}")
	public MedicineDetails get(@PathVariable("medId") Integer medId) {

		System.out.println("hitted");
		List<MedicineDetails> allMedicines = getAllMedicines();
		MedicineDetails medicine = null;
		for (MedicineDetails obj : allMedicines) {
			if (obj.getMedId() == medId)
				medicine = obj;
		}
		System.out.println(medicine);
		return medicine;
	}

	@GetMapping("/getAllMedicines")
	public List<MedicineDetails> getAllMedicines() {
		return medRepo.findAll();

	}

	@GetMapping("/getAllRaiseRequest")
	public List<RaiseRequest> getAllRaiseRequest() {
		System.out.println("getAllRaiseRequest");
		return repo.findAll();
	}

	@GetMapping("/getAllApprovedRequest")
	public List<RaiseRequest> getAllApprovedRequest() {
		System.out.println("getAllApprovedRequest");
		return repo.findAll().stream().filter(obj -> obj.getStatus().equalsIgnoreCase("approved"))
				.collect(Collectors.toList());
	}

	@GetMapping("/getAllPendingRequest")
	public List<RaiseRequest> getAllPendingRequest() {
		System.out.println("getAllPendingRequest");
		return repo.findAll().stream().filter(obj -> obj.getStatus().equalsIgnoreCase("pending"))
				.collect(Collectors.toList());
	}

	@GetMapping("/getAllCreatedRequest")
	public List<RaiseRequest> getAllCreatedRequest() {
		System.out.println("getAllCreatedRequest");
		return repo.findAll().stream().filter(obj -> obj.getStatus().equalsIgnoreCase("created"))
				.collect(Collectors.toList());
	}

	@GetMapping("/getAllDeclinedRequest")
	public List<RaiseRequest> getAllDeclinedRequest() {
		System.out.println("getAllDeclinedRequest");
		return repo.findAll().stream().filter(obj -> obj.getStatus().equalsIgnoreCase("declined"))
				.collect(Collectors.toList());
	}

	@PostMapping("/raiseRequest")
	public String raiseRequest(@RequestBody RaiseRequest details) {
		details.setStatus("Created");
		RaiseRequest response = null;
		System.out.println(details.toString());
		if (!details.getRole().equalsIgnoreCase("User") && !details.getRole().equalsIgnoreCase("Admin")
				&& !details.getRole().equalsIgnoreCase("Hospital") && !details.getRole().equalsIgnoreCase("NGO"))
			details.setRole("User");
		else if (details.getRole().isEmpty())
			details.setRole("User");
		String message = "created";

		if (!details.getMedicineName().isEmpty() || !details.getMedicineName().isEmpty()) {
			response = repo.save(details);
			System.out.println("saved");
		} else {
			System.out.println("not saved");
		}

		return message;
	}

	@PutMapping("/updateRaiseRequest")
	public String updateRaiseRequest(@RequestBody UpdateRaiseRequestBean updateRaiseRequest) {
		System.out.println("updateRaiseRequest " + updateRaiseRequest);
		RaiseRequest req = repo.findById(updateRaiseRequest.getId()).get();
		req.setStatus(updateRaiseRequest.getChangedStatus());
		repo.save(req);
		return "updates";
	}

	@PostMapping("/login")
	public LoginResponse authenticate(@RequestBody LoginRequest loginRequest) {
		LoginResponse reponse = new LoginResponse();
		reponse = new LoginResponse("", "", "", "Invalide Credentials", 0);
		System.out.println("authenticate " + loginRequest);
		List<UserDetails> allUsers = userRepo.findAll();
		for (UserDetails obj : allUsers) {
			if (obj.getMail().equals(loginRequest.getMail()) && obj.getPassword().equals(loginRequest.getPassword())) {
				reponse = new LoginResponse(obj.getMail(), obj.getPassword(), obj.getRole(), "success",
						obj.getUserID());
				break;
			}
		}
		System.out.println("response :" + reponse);
		return reponse;
	}
	
	@PostMapping("/createUser")
	public UserDetails createUser(@RequestBody UserDetails user) {
		System.out.println("user created");
		System.out.println(user);
		return userRepo.save(user);
	}
	@PostMapping("/createFeedback")
	public FeedbackDetails createFeedback(@RequestBody FeedbackDetails feedbackDetails) {
		System.out.println(feedbackDetails);
		return feedbackRepo.save(feedbackDetails);
	}
	@GetMapping("/getAllFeedbacks")
	public List<FeedbackDetails> getAllFeedbacks() {
		return feedbackRepo.findAll();
	}

}
