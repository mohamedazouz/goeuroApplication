package com.azouz.goeuro;

import com.azouz.goeuro.model.CityLocation;
import com.azouz.goeuro.services.GoeuroService;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * Main Application.
 *
 */
public class App {

    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Hello");
        try {
            List<CityLocation> cities = GoeuroService.cityLocation("hel");
            System.out.println(cities);
            CSVWriter.writeCSV("output", cities);
            logger.info("Application Finished Sucessfully");
        } catch (IOException e) {
            logger.error("Error encountered: " + e.getMessage());
            logger.info("Application Finished with error please check the logs");
        }
    }
}
