package com.cdac.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.beans.HospitalDetails;
import com.cdac.beans.MedicineDetails;
import com.cdac.beans.UserDetails;

@Repository
public interface MedicineRepository extends JpaRepository<MedicineDetails, Integer> {
// custom methods

//	findByAge()
}
