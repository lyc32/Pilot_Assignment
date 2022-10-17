package com.pilot.humanresource.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;

public class Department
{
    @Id
    private int deptid;
    @Column(name = "name")
    private String name;
    @Column(name = "loc")
    private String loc;

    public Department()
    {

    }
    public Department(int deptid, String name, String loc)
    {
        this.deptid = deptid;
        this.name = name;
        this.loc = loc;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
