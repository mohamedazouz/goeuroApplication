/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azouz.goeuro;

import com.azouz.goeuro.model.CityLocation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author azouz
 */
public class CSVWriter {

    private static Logger logger = Logger.getLogger(CSVWriter.class);

    public static void writeCSV(String outputDir, List<CityLocation> cities) throws FileNotFoundException {
        String filePath = outputDir + "/" + getTimeStamp() + ".csv";
        logger.info("Write CSV file on this path: " + filePath);
        PrintWriter printWriter = new PrintWriter(new File(filePath));
        // Print Header
        printWriter.println("_id,name,type,latitude,longitude");
        for (CityLocation cityLocation : cities) {
            printWriter.println(cityLocation);
        }
        logger.info("Finish Writing file");
        logger.info("Check output csv on file: " + filePath);
        printWriter.close();
    }

    private static String getTimeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }
}
