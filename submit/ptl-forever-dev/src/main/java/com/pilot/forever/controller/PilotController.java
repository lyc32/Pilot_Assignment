package com.pilot.forever.controller;

import com.pilot.forever.domain.*;
import com.pilot.forever.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class PilotController {

    @Autowired
    ClientService clientService;
    @Autowired
    OfferService offerService;
    @Autowired
    TestimonyService testimonyService;
    @Autowired
    JobService jobService;
    @Autowired
    ContactService contactService;

    //HOME PAGE
    @GetMapping(value={"", "/", "home", "index"})
    public ModelAndView home() throws Exception{
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    //PROGRAM
    @GetMapping("/program")
    public ModelAndView service() throws Exception{
        ModelAndView modelAndView = new ModelAndView("program");
        return modelAndView;
    }

    @GetMapping("/bzservice")
    public ModelAndView bzservice() throws Exception{
        ModelAndView modelAndView = new ModelAndView("bzservice");
        return modelAndView;
    }


    //MILESTONE - RESOURCES
    @GetMapping("/service")
    public ModelAndView serviceCopy() throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("service");
        List<Client> clients = clientService.getClients();
        modelAndView.addObject("clients", clients);
        return modelAndView;
    }

    //MILESTONE - OFFERBOARD
    @GetMapping("/offerboard")
    public ModelAndView offerBoard() throws Exception {
        ModelAndView modelAndView = new ModelAndView("offer/offerBoard");
        List<Offer> offers = offerService.getOffers();
        modelAndView.addObject("offers", offers);
        return modelAndView;
    }

    //MILESTONE - TESTIMONY
    @GetMapping(value = "/testimony")
    public ModelAndView testimony() throws Exception {
        ModelAndView modelAndView = new ModelAndView("testimony");
        List<Testimony> testimonies = testimonyService.getTestimonies();
        modelAndView.addObject("testimonies", testimonies);
        return modelAndView;
    }

    //Job Posting
    @GetMapping("/career")
    public ModelAndView career() throws Exception{
        ModelAndView modelAndView = new ModelAndView("career");
        List<Job> jobs = jobService.getJobs();
        modelAndView.addObject("jobs", jobs);
        return modelAndView;
    }

    //EPORTAL login
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView login() throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    //contact page
    @GetMapping("/contact")
    public ModelAndView contact() throws Exception{
        ModelAndView modelAndView = new ModelAndView("contact");
        modelAndView.addObject("contact", new Contact());
        return modelAndView;
    }

    //apply for job - contact
    @PostMapping("/applyforjob")
    public ModelAndView createJobApplication(@ModelAttribute Contact contact){
        String status = contactService.handleContactApplication(contact);
        ModelAndView modelAndView = new ModelAndView(new RedirectView(contact.getSource())); //source should contain initial page name
        modelAndView.addObject("status", status); //status will become request param in url after redirect
        return modelAndView;
    }


    //ERROR
    @RequestMapping(value = "/errorpage", method = RequestMethod.GET)
    public ModelAndView generalError(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return modelAndView;
    }

}
