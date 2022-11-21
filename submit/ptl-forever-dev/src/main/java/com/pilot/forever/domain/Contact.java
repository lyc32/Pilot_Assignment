package com.pilot.forever.domain;

public class Contact {

    private int id;
    //Primary Key: name, email, JobInfo
    private String name;
    private String email;
    private String phone;
    private String message;
    private String submissionTimeStamp;
    private String jobInfo;
    private boolean isResponded;
    private String source;

    public Contact() {}

    public Contact(int id, String name, String email, String phone, String message, String submissionTimeStamp, String jobInfo, boolean isResponded, String source) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.message = message;
        this.submissionTimeStamp = submissionTimeStamp;
        this.jobInfo = jobInfo;
        this.isResponded = isResponded;
        this.source = source;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubmissionTimeStamp() {
        return submissionTimeStamp;
    }

    public void setSubmissionTimeStamp(String submissionTimeStamp) {
        this.submissionTimeStamp = submissionTimeStamp;
    }


    public String getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
    }

    public boolean isResponded() {
        return isResponded;
    }

    public void setResponded(boolean responded) {
        isResponded = responded;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
