package com.krishvmehta;

import java.util.List;

/**
 * Record created by Krish
 */

public record Internship(String company, String title, List<String> locations, String url, String companyURL,
                         List<String> terms, boolean active, boolean visible, String sponsorship) {

    @Override
    public String toString() {
        return "Internship: " + System.lineSeparator() +
                "- Company: " + company + System.lineSeparator() +
                "- Title: " + title + System.lineSeparator() +
                "- Locations: " + locations + System.lineSeparator() +
                "- URL: " + url + System.lineSeparator() +
                "- Company URL: " + companyURL + System.lineSeparator() +
                System.lineSeparator();
    }
}
