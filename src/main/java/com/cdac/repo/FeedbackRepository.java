package com.cdac.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<com.cdac.beans.FeedbackDetails, Integer> {
// custom methods

//	findByAge()
}
