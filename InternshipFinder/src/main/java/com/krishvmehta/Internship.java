package com.krishvmehta;

import java.util.List;

/**
 * Record created by Krish
 */

public record Internship(String company, String title, List<String> locations, String url, String companyURL,
                         boolean active, boolean visible) {
}
