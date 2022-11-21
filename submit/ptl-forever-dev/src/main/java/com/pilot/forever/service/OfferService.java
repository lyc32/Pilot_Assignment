package com.pilot.forever.service;

import com.pilot.forever.domain.Client;
import com.pilot.forever.domain.Offer;
import com.pilot.forever.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OfferService {

    @Autowired
    OfferRepository offerRepository;

    public List<Offer> getOffers() throws Exception{
        List<Offer> clients = offerRepository.findAll();
        Collections.sort(clients, (a, b) -> {
            if (a.getOfferDate().equals(b.getOfferDate())) {
                return a.getName().compareTo(b.getName());
            }
            return b.getOfferDate().compareTo(a.getOfferDate());
        });
        return clients;
    }
}
