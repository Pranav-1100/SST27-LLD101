package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        // Email + SMS
        System.out.println("\n=== Email + SMS ===");
        Notifier emailAndSms = new SmsDecorator(base, "+91-99999-11111");
        emailAndSms.notify("Build green ✅");

        // Email + WhatsApp
        System.out.println("\n=== Email + WhatsApp ===");
        Notifier emailAndWhatsApp = new WhatsAppDecorator(base, "user_wa");
        emailAndWhatsApp.notify("Build green ✅");

        // Email + Slack
        System.out.println("\n=== Email + Slack ===");
        Notifier emailAndSlack = new SlackDecorator(base, "deployments");
        emailAndSlack.notify("Build green ✅");

        // Email + WhatsApp + Slack
        System.out.println("\n=== Email + WhatsApp + Slack ===");
        Notifier fullNotifier = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
        fullNotifier.notify("Deployment completed 🚀");
    }
}
