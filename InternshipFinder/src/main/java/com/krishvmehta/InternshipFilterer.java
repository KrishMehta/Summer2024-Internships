package com.krishvmehta;

import java.util.Comparator;
import java.util.List;

/**
 * Class created by Krish
 */

public class InternshipFilterer {

    public List<Internship> filterInternships(List<Internship> internships) {
        return internships.stream()
                .filter(Internship::active)
                .filter(Internship::visible)
                .filter(internship -> internship.title().contains("Intern"))
                .filter(internship -> internship.title().contains("Software Engineer"))
                .filter(internship -> internship.terms().contains("Summer 2024"))
                .toList();
    }

    public List<Internship> sortInternships(List<Internship> internships) {
        return internships.stream()
                .sorted(Comparator.comparing(Internship::datePosted).reversed())
                .toList();
    }

}
