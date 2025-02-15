package com.krishvmehta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Record created by Krish
 */

public record Internship(String company, String title, List<String> locations, String url, String companyURL,
                         List<String> terms, LocalDateTime datePosted, LocalDateTime dateUpdated,
                         boolean active, boolean visible, String sponsorship) {

    @Override
    public String toString() {
        return "Internship: " + System.lineSeparator() +
                "- Company: " + company + System.lineSeparator() +
                "- Title: " + title + System.lineSeparator() +
                "- Locations: " + locations + System.lineSeparator() +
                "- URL: " + url + System.lineSeparator() +
                "- Company URL: " + companyURL + System.lineSeparator() +
                "- Date Posted: " + datePosted.format(DateTimeFormatter.ISO_DATE) + System.lineSeparator() +
                System.lineSeparator();
    }
}
