package com.cdac.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.beans.HospitalDetails;
import com.cdac.beans.UserDetails;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalDetails, Integer> {
// custom methods

//	findByAge()
}
