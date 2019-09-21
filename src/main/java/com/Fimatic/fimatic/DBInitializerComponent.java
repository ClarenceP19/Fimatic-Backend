package com.Fimatic.fimatic;


import com.Fimatic.fimatic.model.Scenario;
import com.Fimatic.fimatic.model.User;
import com.Fimatic.fimatic.repository.ScenarioRepository;
import com.Fimatic.fimatic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    ScenarioRepository scenarioRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... strings){
        // add stuff to initialise
        initialisePersonas();
    }
    private List<Scenario> readScenariosFromCSV(String fileName) throws ParseException {
        List<Scenario> scenarios = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)){
            // read the data into the file
            String line = br.readLine();
            String[] columns = line.split(",");
            while(columns!= null){

            }
        }catch(IOException ioe){
            System.out.println("unable to read data from CSV");
        }

        return scenarios;
    }
    private List<User> readPersonasFromCSV(String fileName) throws ParseException {
        List<User> users = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)){
            // read the data into the file
            String line = br.readLine();
            String[] columns = line.split(",");
            while(line!= null){
                columns = line.split(",");
                boolean insurance[] = new boolean[4];
                insurance[0] = Boolean.parseBoolean(columns[10]);
                insurance[1] = Boolean.parseBoolean(columns[11]);
                insurance[2] = Boolean.parseBoolean(columns[12]);
                insurance[3] = Boolean.parseBoolean(columns[13]);
                System.out.println(insurance[1]);

                User user = new User(Long.parseLong(columns[0]),columns[1],columns[2],
                        Long.parseLong(columns[3]),Long.parseLong(columns[4]),Long.parseLong(columns[5]),
                        Long.parseLong(columns[6]),Long.parseLong(columns[7]),Long.parseLong(columns[8]),Long.parseLong(columns[9]),insurance);
                userRepository.save(user);
                line = br.readLine();

            }
        }catch(IOException ioe){
            System.out.println("unable to read data from CSV");
        }

        return users;
    }

    private boolean initialiseScenarios(){
        try{
            this.scenarioRepository.deleteAll();
            ArrayList<Scenario> scenarioArrayList = (ArrayList<Scenario>) readScenariosFromCSV("testpersonas.csv");
            scenarioRepository.saveAll(scenarioArrayList);

        }catch(Exception e){
            System.out.println("==== Unable to intialised Scenarios into Database");
            return false;
        }
        return true;
    }

    private boolean initialisePersonas(){
        try{
            userRepository.deleteAll();
            ArrayList<User> userArrayList = (ArrayList<User>) readPersonasFromCSV("testpersonas.csv");
            userRepository.saveAll(userArrayList);
        }catch(Exception e){
            System.out.println("==== Unable to intialised Personas into Database");
            return false;
        }
        return true;
    }

}
