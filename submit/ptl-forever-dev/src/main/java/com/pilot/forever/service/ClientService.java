package com.pilot.forever.service;

import com.pilot.forever.domain.Client;
import com.pilot.forever.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getClients() throws Exception {
        List<Client> clients = clientRepository.findAll();
        Collections.sort(clients, (a, b) -> {
            if (a.getIndustry().equals(b.getIndustry())) {
                return a.getName().compareTo(b.getName());
            }
            return a.getIndustry().compareTo(b.getIndustry());
        });
        return clients;
    }
}
