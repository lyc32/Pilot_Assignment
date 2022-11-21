package com.pilot.forever.service;

import com.pilot.forever.domain.Offer;
import com.pilot.forever.domain.Testimony;
import com.pilot.forever.repository.OfferRepository;
import com.pilot.forever.repository.TestimonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TestimonyService {

    @Autowired
    TestimonyRepository testimonyRepository;

    public List<Testimony> getTestimonies() throws Exception{
        List<Testimony> clients = testimonyRepository.findAll();
        return clients;
    }
}
