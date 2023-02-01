package com.cdac.config.database2;

import com.cdac.config.database1.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentDetails,Integer> {
}
