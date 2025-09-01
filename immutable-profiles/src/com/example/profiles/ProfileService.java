package com.example.profiles;

/**
 * Updated ProfileService to work with immutable UserProfile
 */
public class ProfileService {
    
    public UserProfile createMinimal(String id, String email) {
        return new UserProfile.Builder(id, email).build();
    }
    
    public UserProfile withDisplayName(UserProfile original, String displayName) {
        return new UserProfile.Builder(original.getId(), original.getEmail())
            .phone(original.getPhone())
            .displayName(displayName)
            .address(original.getAddress())
            .marketingOptIn(original.isMarketingOptIn())
            .twitter(original.getTwitter())
            .github(original.getGithub())
            .build();
    }
    
    public UserProfile createFullProfile(String id, String email, String phone, 
                                       String displayName, String address, 
                                       boolean marketingOptIn, String twitter, String github) {
        return new UserProfile.Builder(id, email)
            .phone(phone)
            .displayName(displayName)
            .address(address)
            .marketingOptIn(marketingOptIn)
            .twitter(twitter)
            .github(github)
            .build();
    }
}
