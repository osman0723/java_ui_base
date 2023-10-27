package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
        private static Properties properties;

        static {
            try {
                String path = "config/baseConfig.properties";
                FileInputStream input = new FileInputStream(path);
                properties = new Properties();
                properties.load(input);

                input.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        public static String getProperty(String keyword){
            return properties.getProperty(keyword);
        }

}
