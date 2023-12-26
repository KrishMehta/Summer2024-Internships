package com.krishvmehta;

import java.io.IOException;
import java.util.List;

/**
 * Class created by Krish
 */

public class InternshipFinder {

    public static void main(String[] args) throws IOException {
        List<Internship> internships;

        InternshipReader internshipReader = new InternshipReader();
        InternshipFilterer internshipFilterer = new InternshipFilterer();

        internships = internshipReader.parseJSONFile();
        internships = internshipFilterer.filterInternships(internships);

        internships.forEach(System.out::println);
    }

}
