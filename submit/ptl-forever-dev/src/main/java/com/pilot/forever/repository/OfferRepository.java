package com.pilot.forever.repository;

import com.pilot.forever.data.ClientData;
import com.pilot.forever.data.OfferData;
import com.pilot.forever.domain.Client;
import com.pilot.forever.domain.Offer;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OfferRepository {


    public List<Offer> findAll() throws ParseException {
        List<Offer> result = new ArrayList<>();

        String offerList = OfferData.offers.toString();
        String[] offers = offerList.split("\n");
        for(String offer : offers){
            if(offer != null && offer.length() > 1) {
                String[] offerDetails = offer.split(";");
                String name = offerDetails[0];
                String client = offerDetails[1];
                String offerDate = offerDetails[2];
                String programId = offerDetails[3];
                String offerState = offerDetails[4];

                Offer processedOffer = new Offer();
                processedOffer.setName(name);
                processedOffer.setClient(client);

                SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                java.util.Date utilDate = dateFormat.parse(offerDate);
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                processedOffer.setOfferDate(sqlDate);

                processedOffer.setProgram(OfferData.program.get(Integer.valueOf(programId)));
                processedOffer.setState(offerState);
                result.add(processedOffer);
            }
        }
        return result;
    }

}
