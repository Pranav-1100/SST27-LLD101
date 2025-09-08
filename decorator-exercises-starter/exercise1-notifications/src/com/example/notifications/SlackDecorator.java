package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {
    private String channel;

    public SlackDecorator(Notifier notifier, String channel) {
        super(notifier);
        this.channel = channel;
    }

    @Override
    public void notify(String text) {
        System.out.println("[SLACK -> #" + channel + "]: " + text);
        super.notify(text);
    }
}