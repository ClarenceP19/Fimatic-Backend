package com.Fimatic.fimatic;


import com.Fimatic.fimatic.model.Scenario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Component
@ConditionalOnProperty(name ="app.db-init",havingValue = "true")
public class DBInitializerComponent implements CommandLineRunner {

    @Override
    public void run(String... strings){
        // add stuff to initialise
    }
    private List<Scenario> readScenariosFromCSV(String fileName) throws ParseException {
        List<Scenario> scenarios = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)){
            // read the data into the file
        }catch(IOException ioe){
            System.out.println("unable to read data from CSV");
        }

        return scenarios;
    }
    private boolean initialiseUsers(){
        try{
            //
        }catch(Exception e){

        }
        return false;
    }

}
