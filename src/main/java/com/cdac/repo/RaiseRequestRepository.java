package com.cdac.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.beans.RaiseRequest;

@Repository
public interface RaiseRequestRepository extends JpaRepository<RaiseRequest, Integer> {
// custom methods

//	findByAge()
}
