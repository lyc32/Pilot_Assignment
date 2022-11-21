package com.pilot.forever.service;

import com.pilot.forever.domain.Contact;
import com.pilot.forever.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    //RETURN success only if contact info is written to database and sent by email
    public String handleContactApplication(Contact contact) {
        return "SUCCESS";
    }

}
