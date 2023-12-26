package com.krishvmehta;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Class created by Krish
 */

public class InternshipReader {

    public List<Internship> parseJSONFile() throws IOException {
        List<Internship> internships = new ArrayList<>();

        Path path = Paths.get(".github/scripts/listings.json");
        String json = Files.readString(path);
        JSONArray jsonArray = new JSONArray(json);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String company = jsonObject.getString("company_name");
            String title = jsonObject.getString("title");
            List<String> locations = new ArrayList<>();
            JSONArray locationsArray = jsonObject.getJSONArray("locations");
            for (int j = 0; j < locationsArray.length(); j++) {
                locations.add(locationsArray.getString(j));
            }
            String url = jsonObject.getString("url");
            String companyURL = jsonObject.getString("company_url");
            boolean active = jsonObject.getBoolean("active");
            boolean visible = jsonObject.getBoolean("is_visible");
            Internship internship = new Internship(company, title, locations, url, companyURL, active, visible);
            internships.add(internship);
        }

        return internships;
    }

}
