package com.cdac.config.database1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee-details")
public class EmployeeDetails {
    @Id
    private Integer empID;
    @Column
    private String empName;
    @Column
    private Integer deptEmpID;

    public EmployeeDetails(Integer empID, String empName, Integer deptEmpID) {
        this.empID = empID;
        this.empName = empName;
        this.deptEmpID = deptEmpID;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getDeptEmpID() {
        return deptEmpID;
    }

    public void setDeptEmpID(Integer deptEmpID) {
        this.deptEmpID = deptEmpID;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", deptEmpID=" + deptEmpID +
                '}';
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("new EmployeeDetails("+i+",\"a"+i+"\","+(i*10)+"),");
        }
    }
}
