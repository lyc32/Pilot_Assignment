package com.pilot.forever.repository;

import com.pilot.forever.data.ClientData;
import com.pilot.forever.domain.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {

    public List<Client> findAll() {
        List<Client> result = new ArrayList<>();
        String clientList = ClientData.data.toString();
        String[] clients = clientList.split("&&");
        for(String client : clients){
            if(client != null && client.length() > 1) {
                String[] clientDetails = client.split("/");
                String industry = clientDetails[0];
                String name = clientDetails[1];
                String type = clientDetails[2];
                String locations = clientDetails[3];
                String headCount = clientDetails[4];
                Client processedClient = new Client(name, industry, type, locations, Integer.valueOf(headCount));
                result.add(processedClient);
            }
        }
        return result;
    }
}
