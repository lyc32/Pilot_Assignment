package com.pilot.forever.data;

import com.pilot.forever.domain.Job;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JobData {

    public static List<Job> openings = new ArrayList<>();
    static{
        addJob1();
        addJob2();
        addJob3();
        addJob4();
    }

    private static void addJob1(){
        Job job1 = new Job();
        openings.add(job1);

        job1.setJobId("JD-200802");
        job1.setTitle("Java Developer - Entry Level");
        job1.setLocation("NJ/TX/Remote");
        job1.setField("Backend");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String postStartDateString = "2020-08-01";
        java.util.Date utilDate = null;
        try {
            utilDate = dateFormat.parse(postStartDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        job1.setPostStartDate(sqlDate);

        String postEndDateString = "2025-08-01";
        java.util.Date utilDate2 = null;
        try {
            utilDate2 = dateFormat.parse(postEndDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
        job1.setPostEndDate(sqlDate2);

        job1.setStatus("Open");
        job1.setDescription("Pilot Technologies (PTL) is looking for a full time employee as an Entry level Java Developer. The Main duty is to be trained with Java EE technologies and frameworks and to work on current and future client applications");
        job1.setQualifications("This position requires the candidate to have at least a bachelor's degree or equivalent in Computer Science or related STEM majors.");
        job1.setAuthor("Max Chen");
        job1.setCreationDate(null);
        job1.setLastModifiedDate(null);

        List<String> requirements = new ArrayList<>();
        requirements.add("Have US based bachelor degree in computer science or related majors;");
        requirements.add("Willing to learn java industrial level projects;");
        requirements.add("Work with a team to develop a commercial web application;");
        requirements.add("Able to understand business requirement and current legacy code;");
        requirements.add("Willing to communicate with other team members and business team on tasks;");
        requirements.add("Familiar with core java and java collections;");
        requirements.add("Able to learn and work with java frameworks, such as Spring IoC, Web Services and Data JPA;");
        requirements.add("Have knowledge of relational database, MySQL preferred;");
        requirements.add("Willing to learn new skills;");
        requirements.add("Able to finish task according to scheduled plan even doing remote work;");
        job1.setRequirements(requirements);

    }

    private static void addJob2(){
        Job job1 = new Job();
        openings.add(job1);

        job1.setJobId("JD-202109");
        job1.setTitle("Human Resource Specialist");
        job1.setLocation("NJ/TX/Remote");
        job1.setField("Human Resource");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String postStartDateString = "2021-09-06";
        java.util.Date utilDate = null;
        try {
            utilDate = dateFormat.parse(postStartDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        job1.setPostStartDate(sqlDate);

        String postEndDateString = "2025-08-01";
        java.util.Date utilDate2 = null;
        try {
            utilDate2 = dateFormat.parse(postEndDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
        job1.setPostEndDate(sqlDate2);

        job1.setStatus("Open");
        job1.setDescription("Pilot Technologies (PTL) is looking for a full time employee as an Human Resource Specialist. Three types of HR are needed, recruiter, marketer and admin.");
        job1.setQualifications("This position requires the candidate to have at least a bachelor's degree or equivalent in Computer Science or related STEM majors or Human Resource related majors");
        job1.setAuthor("Max Chen");
        job1.setCreationDate(null);
        job1.setLastModifiedDate(null);

        List<String> requirements = new ArrayList<>();
        requirements.add("Have US based bachelor degree in computer science or human resource related majors;");
        requirements.add("Major is not required is related working experience is provided;");
        requirements.add("Willing to actively communicate with future employees;");
        requirements.add("Able to understand business models and apply into HR daily work;");
        requirements.add("Work with company employees to perform task reviewes and administrative work;");
        requirements.add("Familiar with Microsoft office package;");
        requirements.add("Able to handle various queries and be patient in explainning them;");
        requirements.add("Able to finish task according to scheduled plan even doing remote work;");
        job1.setRequirements(requirements);

    }

    private static void addJob3(){
        Job job1 = new Job();
        openings.add(job1);

        job1.setJobId("JD-202202");
        job1.setTitle("Software Developer");
        job1.setLocation("Remote/TBD");
        job1.setField("Backend");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String postStartDateString = "2022-02-01";
        java.util.Date utilDate = null;
        try {
            utilDate = dateFormat.parse(postStartDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        job1.setPostStartDate(sqlDate);

        String postEndDate = "2022-12-31";
        java.util.Date utilDate2 = null;
        try {
            utilDate2 = dateFormat.parse(postStartDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
        job1.setPostStartDate(sqlDate2);

        job1.setStatus("Open");
        job1.setDescription("Pilot Technologies LLC is a rapid growing software development and consulting service company. We are currently looking for professional Software Developers. The candidate will primarily work on the assigned software development projects for our clients.   The candidate will develop on high-quality and fully performing software applications, including gathering user requirements, defining system functionality and writing complex codes using latest technologies.\n" +
                "Summary of Software Developer’s main duties include but not limited to:\n");
        job1.setQualifications("Requirements: at least bachelor’s degree or equivalent in Computer Science, Computer Engineering, Mathematics, Business Analytics, Information Technology, or any related fields. ");
        job1.setAuthor("Max Chen");
        job1.setCreationDate(null);
        job1.setLastModifiedDate(null);

        List<String> requirements = new ArrayList<>();
        requirements.add("Work with Business Analysts to review business system requirements, minimize ambiguity and incomplete requirements, identify technical issues and provide solutions;;");
        requirements.add("Participate in technical discussions with cross functional teams for program level deliverables and software architecture using Agile methodology;");
        requirements.add("Using creative skills to initiate informal reviews of ideas and technical objectives across business units;");
        requirements.add("Design and develop high quality software features and functionality using latest technologies and frameworks, including Spring, Hibernate, NoSQL, SQL etc;");
        requirements.add("Create and modify APIs to update response data from the backend and transfer modified DTO to the frontend;");
        requirements.add("Conduct unit tests, integration tests and E2E tests, utilize Swagger and Postman to test APIs and generate test suits;");
        requirements.add("Work with any security features, authentication and authorization, such as JWT token, Oauth2, basic auth etc.");
        requirements.add("Perform data modeling and design. Familiar with Grafana, Splunk, JMeter, Datadog, CloudWatch etc systme monitoring tools;");
        requirements.add("Improve throughout and performance using queueing and event processing technologies;");
        requirements.add("Optimize software systems and designs to improve performance and scalability;");
        requirements.add("Participate in end to end service implementations, data feeds ingestion, and orchestration.");
        job1.setRequirements(requirements);

    }

    private static void addJob4(){
        Job job1 = new Job();
        openings.add(job1);

        job1.setJobId("JD-202103");
        job1.setTitle("Java Developer");
        job1.setLocation("US");
        job1.setField("Backend");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String postStartDateString = "2021-03-12";
        java.util.Date utilDate = null;
        try {
            utilDate = dateFormat.parse(postStartDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        job1.setPostStartDate(sqlDate);

        String postEndDate = "2024-12-31";
        java.util.Date utilDate2 = null;
        try {
            utilDate2 = dateFormat.parse(postStartDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
        job1.setPostStartDate(sqlDate2);

        job1.setStatus("Open");
        job1.setDescription("Pilot Technologies (PTL) is looking for a full time employee as a Java Developer. The Main duty is to use Java EE based technologies and frameworks to work on current and future web based projects.\n");
        job1.setQualifications("This position requires the candidate to have at least a bachelor’s degree or equivalent in Computer Science or related stem major. master’s degree is highly preferred.");
        job1.setAuthor("Max Chen");
        job1.setCreationDate(null);
        job1.setLastModifiedDate(null);

        List<String> requirements = new ArrayList<>();
        requirements.add("Work with business team to understand the business requirements and convert the requirements to technical logic flows;");
        requirements.add("Implements the business logics with Java EE technologies;");
        requirements.add("Familiar with core java, Java 1.8+ including stream API, lambda, functional interface etc;");
        requirements.add("Able to work with java frameworks, such as Spring IoC, Web Services and Data JPA;");
        requirements.add("Have knowledge of relational database, especially Oracle and SQL Server; able to write SQLs and Stored Procedures;");
        requirements.add("Familiar with modern technologies, such as Spring Boot, MicroService architect framework;");
        requirements.add("Able to understand and work on test cases using Junit, Mockito and Automation tools including Selenium and Cucumber;");
        requirements.add("Able to follow Agile Sprint development methodologies; willing to work with scrum masters and business team;");
        requirements.add("Ability to work with other team members and managers or outsource team and able to work independently as well if needed;");
        requirements.add("Able to understand and work on test cases using Junit, Mockito and Automation tools including Selenium and Cucumber;");
        requirements.add("Able to follow Agile Sprint development methodologies; willing to work with scrum masters and business team;");
        requirements.add("Ability to work with other team members and managers or outsource team and able to work independently as well if needed;");
       job1.setRequirements(requirements);

    }
}
