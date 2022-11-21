package com.pilot.forever.domain;

public class Client {

    private String name;
    private String industry; //Technology, HealthCare, E-commerce, Telecom, Auto, Finance etc
    private String type;
    private String location;
    private int headcount;


    public Client() {}


    public Client(String name, String industry, String type,  String location, int headcount) {
        this.name = name;
        this.industry = industry;
        this.type = type;

        this.location = location;
        this.headcount = headcount;
    }

    public void setName(String name) { this.name = name; }
    public String getName() {return this.name; }
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeadcount() {
        return headcount;
    }

    public void setHeadcount(int headcount) {
        this.headcount = headcount;
    }
}
