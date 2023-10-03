package Configuration;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties properties;
    public void loadProperties(){

        properties = new Properties();

        try {
            properties.load(ConfigReader.class.getResourceAsStream("/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String getUrl(){
        return properties.getProperty("url");
    }
    public String getBrowser(){
        System.out.println(properties.getProperty("browser"));
        return properties.getProperty("browser");
    }
}
