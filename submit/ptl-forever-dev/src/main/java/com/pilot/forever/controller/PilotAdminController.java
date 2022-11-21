package com.pilot.forever.controller;

import com.pilot.forever.domain.*;
import com.pilot.forever.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class PilotAdminController
{
    @Autowired
    JobService jobService;

    @Autowired
    TestimonyService testimonyService;

    // admin home page
    @GetMapping("/admin/mainpage")
    public ModelAndView admin_mainpage() throws Exception
    {
        ModelAndView modelAndView = new ModelAndView("admin_mainpage");
        return modelAndView;
    }

    /***********************************/
    /* career                          */
    /***********************************/
    @GetMapping("/admin/career")
    public ModelAndView admin_listAllJob() throws Exception
    {
        ModelAndView modelAndView = new ModelAndView("admin_career");
        List<Job> jobs = jobService.getJobs();
        modelAndView.addObject("jobs", jobs);
        return modelAndView;
    }

    @GetMapping("/admin/jobview")
    public ModelAndView admin_jobview(@RequestParam("jobId") String jobId) throws Exception
    {
        if(jobId.equals("new"))
        {
            ModelAndView modelAndView = new ModelAndView("admin_career_jobview");
            modelAndView.addObject("type", "new");
            modelAndView.addObject("job", new Job());
            return modelAndView;
        }
        else
        {
            ModelAndView modelAndView = new ModelAndView("admin_career_jobview");
            modelAndView.addObject("type", "edit");
            modelAndView.addObject("job", jobService.getJobById(jobId));
            return modelAndView;
        }
    }

    @PostMapping("/admin/create_job")
    public int admin_createJob(@RequestBody Job job) throws Exception
    {
        return jobService.createJob(job);
    }

    @PostMapping("/admin/update_job")
    public int admin_updateJob(@RequestBody Job job) throws Exception
    {
        return jobService.updateJob(job);
    }

    @PostMapping("/admin/delete_job")
    public int admin_deleteJobByJob(@RequestBody Job job) throws Exception
    {
        return jobService.deleteJobById(job.getJobId());
    }


    /***********************************/
    /* We're Liked! part               */
    /***********************************/
    @GetMapping("/admin/we_re_liked")
    public ModelAndView admin_listAllTestimony() throws Exception
    {
        ModelAndView modelAndView = new ModelAndView("admin_milestone_weReLiked");
        List<Testimony> testimonies = testimonyService.getTestimonies();
        modelAndView.addObject("testimonies", testimonies);
        return modelAndView;
    }

    @GetMapping("/admin/testimonyview")
    public ModelAndView admin_testimonyView(@RequestParam("id") String id) throws Exception
    {
        if(id.equals("new"))
        {
            ModelAndView modelAndView = new ModelAndView("admin_milestone_testimonyview");
            modelAndView.addObject("type", "new");
            modelAndView.addObject("Testimony", new Testimony());
            return modelAndView;
        }
        else
        {
            ModelAndView modelAndView = new ModelAndView("admin_milestone_testimonyview");
            modelAndView.addObject("type", "edit");
            //modelAndView.addObject("Testimony", testimonyService.getJobById(id));
            //return modelAndView;
            return null;
        }
    }
}
