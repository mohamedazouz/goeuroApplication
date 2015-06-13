package com.azouz.goeuro.services;

import com.azouz.goeuro.model.CityLocation;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author azouz
 */
public class GoeuroService {

    private static final String SERVICE_URL = "http://api.goeuro.com/api/v2/position/suggest/en/";
    private static Logger logger = Logger.getLogger(GoeuroService.class);

    public static List<CityLocation> cityLocation(String query) throws IOException {
        logger.info("Start hitting query");
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE);
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        logger.info("Call URL: " + SERVICE_URL + query);
        List<CityLocation> citiesJsonResponse = mapper.readValue(new URL(SERVICE_URL + query), new TypeReference<List<CityLocation>>(){});
        logger.info("Response: " + citiesJsonResponse);
        return citiesJsonResponse;
    }
}
