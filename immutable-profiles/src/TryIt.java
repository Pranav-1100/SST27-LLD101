import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Profile: " + p.getEmail());
        System.out.println("ID: " + p.getId());
        System.out.println("=> Object is now immutable - no setters available!");
        
        UserProfile fullProfile = new UserProfile.Builder("u2", "test@example.com")
            .phone("123-456-7890")
            .displayName("Test User")
            .marketingOptIn(true)
            .twitter("@testuser")
            .build();
        System.out.println("Full profile: " + fullProfile.getDisplayName());
    }
}
