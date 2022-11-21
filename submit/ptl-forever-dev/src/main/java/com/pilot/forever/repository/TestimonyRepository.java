package com.pilot.forever.repository;

import com.pilot.forever.data.OfferData;
import com.pilot.forever.data.TestimonyData;
import com.pilot.forever.domain.Offer;
import com.pilot.forever.domain.Testimony;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TestimonyRepository {

    public List<Testimony> findAll() throws ParseException {
        List<Testimony> result = new ArrayList<>();

        String list = TestimonyData.testimonies.toString();
        String[] testimonies = list.split("\n");
        for(String entry : testimonies){
            if(entry != null && entry.length() > 1) {
                String[] details = entry.split(";");
                String id = details[0];
                String text = details[1];
                String name = details[2];
                String title = details[3];
                String client = details[4];
                String createdDate = details[5];

                Testimony processed = new Testimony();
                processed.setId(Integer.valueOf(id));
                processed.setText(text);
                processed.setAuthorName(name);
                processed.setAuthorTitle(title);
                processed.setAuthorClient(client);
                processed.setCreateDate(createdDate);

                result.add(processed);
            }
        }
        return result;
    }
}
