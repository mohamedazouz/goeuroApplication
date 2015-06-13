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
            if (args.length > 1) {
                String query = args[0];
                logger.info("Query: " + query);
                List<CityLocation> cities = GoeuroService.cityLocation(query);
                System.out.println(cities);
                CSVWriter.writeCSV("output", cities);
                logger.info("Application Finished Sucessfully");
            } else {
                logger.error("Invalid input: Please check your inputs");
            }
        } catch (IOException e) {
            logger.error("Error encountered: " + e.getMessage());
            logger.error("Application finished with errors");
        }
    }
}
