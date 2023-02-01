package com.cdac.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.beans.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {
// custom methods

//	findByAge()
}
