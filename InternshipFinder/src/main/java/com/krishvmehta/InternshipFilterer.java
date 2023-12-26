package com.krishvmehta;

import java.util.List;

/**
 * Class created by Krish
 */

public class InternshipFilterer {

    public List<Internship> filterInternships(List<Internship> internships) {
        return internships.stream()
                .filter(Internship::active)
                .filter(Internship::visible)
                .filter(internship -> internship.terms().contains("Summer 2024"))
                .filter(internship -> internship.sponsorship().equals("Offers Sponsorship"))
                .toList();
    }

}
