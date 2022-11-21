package com.pilot.forever.repository;

import com.pilot.forever.data.JobData;
import com.pilot.forever.domain.Job;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class JobRepository {

    public List<Job> findAll() {
        return JobData.openings;
    }

    //my code
    public int createJob(Job job)
    {
        JobData.openings.add(job);
        return 0;
    }

    public Job getJobById(String jobId)
    {
        Iterator jobIterator = JobData.openings.iterator();

        while (jobIterator.hasNext())
        {
            Job job = (Job)jobIterator.next();
            if(job.getJobId().equals(jobId))
            {
                return job;
            }
        }
        return null;
    }

    public int updateob(Job job)
    {
        Iterator jobIterator = JobData.openings.iterator();
        while (jobIterator.hasNext())
        {
            Job tmpJob = (Job)jobIterator.next();
            if(tmpJob.getJobId().equals(job.getJobId()))
            {
                tmpJob.setTitle(job.getTitle());
                tmpJob.setLocation(job.getLocation());
                tmpJob.setField(job.getField());
                tmpJob.setPostStartDate(job.getPostStartDate());
                tmpJob.setPostEndDate(job.getPostEndDate());
                tmpJob.setStatus(job.getStatus());
                tmpJob.setDescription(job.getDescription());
                tmpJob.setQualifications(job.getQualifications());
                tmpJob.setAuthor(job.getAuthor());
                tmpJob.setLastModifiedDate(job.getLastModifiedDate());
                tmpJob.setRequirements(job.getRequirements());
                return 0;
            }
        }
        System.out.println("not found" + job.getJobId());
        return 1;
    }

    public int deleteJobById(String jobId)
    {
        Iterator jobIterator = JobData.openings.iterator();
        while (jobIterator.hasNext())
        {
            Job job = (Job)jobIterator.next();
            if(job.getJobId().equals(jobId))
            {
                jobIterator.remove();
                return 0;
            }
        }
        return 1;
    }
}
