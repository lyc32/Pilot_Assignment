package com.pilot.forever.domain;

import java.sql.Date;

public class Offer {

    private int id;
    private String name;
    private String client;
    private String experience;
    private Date offerDate;
    private String program;
    private int candidateId;
    private String state;

    public Offer() {}

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Offer(int id, String name, String client, String experience, Date date, int pid, int cid) {
        this.id = id;
        this.name = name;
        this.client = client;
        this.experience = experience;
        this.offerDate = date;
        this.candidateId = cid;
    }

    public Offer(int id, String name, String client, String experience, Date date, int pid, int cid, String state) {
        this.id = id;
        this.name = name;
        this.client = client;
        this.experience = experience;
        this.offerDate = date;
        this.candidateId = cid;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Date getOfferDate() { return offerDate; }

    public void setOfferDate(Date offerDate) { this.offerDate = offerDate; }

    public int getCandidateId() { return candidateId; }

    public void setCandidateId(int candidateId) { this.candidateId = candidateId; }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format(
                "Offer[id=%d, name='%s', client='%s']",
                id, name, client);
    }
}
