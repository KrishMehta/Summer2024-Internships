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
            Internship internship = getInternshipFromJSONObject(jsonObject);
            internships.add(internship);
        }
        return internships;
    }

    private Internship getInternshipFromJSONObject(JSONObject jsonObject) {
        String company = jsonObject.getString("company_name");
        String title = jsonObject.getString("title");
        List<String> locations = new ArrayList<>();
        JSONArray locationsArray = jsonObject.getJSONArray("locations");
        for (int i = 0; i < locationsArray.length(); i++) {
            locations.add(locationsArray.getString(i));
        }
        String url = jsonObject.getString("url");
        String companyURL = jsonObject.getString("company_url");
        List<String> terms = new ArrayList<>();
        JSONArray termsArray = jsonObject.getJSONArray("terms");
        for (int i = 0; i < termsArray.length(); i++) {
            terms.add(termsArray.getString(i));
        }
        boolean active = jsonObject.getBoolean("active");
        boolean visible = jsonObject.getBoolean("is_visible");
        String sponsorship = jsonObject.getString("sponsorship");
        return new Internship(company, title, locations, url, companyURL, terms, active, visible, sponsorship);
    }

}
