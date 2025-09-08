package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {
    private String username;

    public WhatsAppDecorator(Notifier notifier, String username) {
        super(notifier);
        this.username = username;
    }

    @Override
    public void notify(String text) {
        System.out.println("[WHATSAPP -> " + username + "]: " + text);
        super.notify(text);
    }
}