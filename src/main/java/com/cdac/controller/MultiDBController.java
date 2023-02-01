package com.cdac.controller;

import com.cdac.config.database1.EmployeeDetails;
import com.cdac.config.database1.EmployeeRepo;
import com.cdac.config.database2.DepartmentDetails;
import com.cdac.config.database2.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/multipleDB")
@RestController

public class MultiDBController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private DepartmentRepo departmentRepo;

    public void saveDBValues() {
        List<EmployeeDetails> employees = Arrays.asList(new EmployeeDetails(1, "a1", 10),
                new EmployeeDetails(2, "a2", 20),
                new EmployeeDetails(3, "a3", 30),
                new EmployeeDetails(4, "a4", 40),
                new EmployeeDetails(5, "a5", 50),
                new EmployeeDetails(6, "a6", 60),
                new EmployeeDetails(7, "a7", 70),
                new EmployeeDetails(8, "a8", 80),
                new EmployeeDetails(9, "a9", 90),
                new EmployeeDetails(10, "a10", 100));
        employeeRepo.saveAll(employees);
        System.out.println("Employee saved");

        List<DepartmentDetails> depts = Arrays.asList(new DepartmentDetails(1, "false"),
                new DepartmentDetails(2, "true"),
                new DepartmentDetails(3, "false"),
                new DepartmentDetails(4, "true"),
                new DepartmentDetails(5, "false"),
                new DepartmentDetails(6, "true"),
                new DepartmentDetails(7, "false"),
                new DepartmentDetails(8, "true"),
                new DepartmentDetails(9, "false"),
                new DepartmentDetails(10, "true"));
        departmentRepo.saveAll(depts);
        System.out.println("Department saved");
    }

    @GetMapping("/emps")
    public List<EmployeeDetails> getEmployees() {
        return employeeRepo.findAll();
    }

    @GetMapping("/depts")
    public List<DepartmentDetails> getDepartment() {
        return departmentRepo.findAll();
    }
}
