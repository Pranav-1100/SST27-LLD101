package com.example.config;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Proper Thread-Safe Singleton using Holder Idiom
 * Protected against reflection and serialization attacks
 */
public class AppSettings implements Serializable {
    private final Properties props = new Properties();
    private static boolean instanceCreated = false;

    private AppSettings() {
        synchronized (AppSettings.class) {
            if (instanceCreated) {
                throw new IllegalStateException("Singleton instance already exists!");
            }
            instanceCreated = true;
        }
    }

    private static class Holder {
        private static final AppSettings INSTANCE = new AppSettings();
    }

    public static AppSettings getInstance() {
        return Holder.INSTANCE;
    }

    private Object readResolve() {
        return getInstance();
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
