package com.pilot.humanresource.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "salary_report")
@NamedStoredProcedureQuery(name = "spGenerateReport",
                                    procedureName = "spGenerateReport",
                parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "job_in",type=String.class)})

public class SalaryReport implements Serializable
{
    @Id
    //@Column(name = "job")
    private String job;
    @Column(name = "department")
    private String department;
    @Column(name = "salmin")
    private double salmin;
    @Column(name = "salmax")
    private double salmax;
    @Column(name = "salavg")
    private double salavg;
    @Column(name = "saltotal")
    private double saltotal;
    @Column(name = "empcount")
    private int empcount;
    @Column(name = "data")
    private String data;

    public SalaryReport(String job, String department, double salmin, double salmax, double salavg, double saltotal, int empcount, String data) {
        this.job = job;
        this.department = department;
        this.salmin = salmin;
        this.salmax = salmax;
        this.salavg = salavg;
        this.saltotal = saltotal;
        this.empcount = empcount;
        this.data = data;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalmin() {
        return salmin;
    }

    public void setSalmin(double salmin) {
        this.salmin = salmin;
    }

    public double getSalmax() {
        return salmax;
    }

    public void setSalmax(double salmax) {
        this.salmax = salmax;
    }

    public double getSalavg() {
        return salavg;
    }

    public void setSalavg(double salavg) {
        this.salavg = salavg;
    }

    public double getSaltotal() {
        return saltotal;
    }

    public void setSaltotal(double saltotal) {
        this.saltotal = saltotal;
    }

    public int getEmpcount() {
        return empcount;
    }

    public void setEmpcount(int empcount) {
        this.empcount = empcount;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
