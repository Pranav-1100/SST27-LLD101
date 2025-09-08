package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader reader;
    private final ProfileService service;

    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = reader;
        this.service = service;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = reader.read(csvFile);
        int count = 0;
        
        for (int i = 1; i < rows.size(); i++) { // skip header
            String[] row = rows.get(i);
            
            if (row.length < 3) {
                System.out.println("Skipping row " + i + ": insufficient columns");
                continue;
            }
            
            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row[2].trim();
            
            if (id.isEmpty() || email.isEmpty()) {
                System.out.println("Skipping row " + i + ": missing id or email");
                continue;
            }
            
            try {
                service.createProfile(id, email, displayName);
                count++;
            } catch (IllegalArgumentException e) {
                System.out.println("Skipping row " + i + ": " + e.getMessage());
            }
        }
        
        return count;
    }
}