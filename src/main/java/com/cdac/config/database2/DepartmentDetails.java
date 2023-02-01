package com.cdac.config.database2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept-details")
public class DepartmentDetails {
    @Id
    private Integer deptID;
    @Column
    private String status;

    public DepartmentDetails(Integer deptID, String status) {
        this.deptID = deptID;
        this.status = status;
    }

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        this.deptID = deptID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DepartmentDetails{" +
                "deptID=" + deptID +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("new DepartmentDetails("+i+","+true+"),");
        }
    }
}
