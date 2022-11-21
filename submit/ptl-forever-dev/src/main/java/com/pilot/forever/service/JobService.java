package com.pilot.forever.service;

import com.pilot.forever.domain.Job;
import com.pilot.forever.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public List<Job> getJobs()
    {
        List<Job> openings = jobRepository.findAll();
        Collections.sort(openings,(a, b)-> b.getPostStartDate().compareTo(a.getPostStartDate())==0?
                a.getTitle().compareTo(b.getTitle()) : b.getPostStartDate().compareTo(a.getPostStartDate()) );
        return openings;
    }

    // my code
    public int createJob(Job job)
    {
        return jobRepository.createJob(job);
    }

    public int updateJob(Job job)
    {
        return jobRepository.updateob(job);
    }
    public Job getJobById(String jobId)
    {
        return jobRepository.getJobById(jobId);
    }

    public int deleteJobById(String jobId)
    {
        return jobRepository.deleteJobById(jobId);
    }
}
