package com.pilot.humanresource.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Date;

public class Employee
{
    @Id
    private Integer empid;
    @Column(name = "name")
    private String name;
    @Column(name = "job")
    private String job;
    @Column(name = "manager")
    private Integer manager;
    @Column(name = "hiredate")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date hiredate;
    @Column(name = "salary")
    private Double salary;
    @Column(name = "deptid")
    private Integer deptid;

    public Employee()
    {

    }
    public Employee(Integer empid, String name, String job, Integer manager, Date hiredate, Double salary, Integer deptid)
    {
        this.empid = empid;
        this.name = name;
        this.job = job;
        this.manager = manager;
        this.hiredate = hiredate;
        this.salary = salary;
        this.deptid = deptid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String toString()
    {
        return empid + name + job;
    }
}
