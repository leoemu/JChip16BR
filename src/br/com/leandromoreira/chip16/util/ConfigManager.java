package br.com.leandromoreira.chip16.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author leandro-rm
 */
public class ConfigManager {
    private static final ConfigManager config = new ConfigManager();
    private Properties properties;
    public static ConfigManager getConfig() {
        return config;
    }
    private ConfigManager(){
        File file = new File("config/config.properties");
        properties = new Properties();
        try {
            properties.load(new FileInputStream(file));
        } catch (IOException ex) {
            throw new IllegalStateException("The config/config.properties raise a io or wasn't found!",ex);
        }
    }

    public String getTitle() {
        return properties.getProperty("name") + " - " + properties.getProperty("version");
    }
}
