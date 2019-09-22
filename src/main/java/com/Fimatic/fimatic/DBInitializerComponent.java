package com.Fimatic.fimatic;


import com.Fimatic.fimatic.helper.ParseData;
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
@ConditionalOnProperty(name = "app.db-init", havingValue = "true")
public class DBInitializerComponent implements CommandLineRunner {

    @Autowired
    ScenarioRepository scenarioRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private ParseData parseData;

    @Override
    public void run(String... strings) {
        // add stuff to initialise
        initialisePersonas();
        initialiseScenarios();
    }

    private List<Scenario> readScenariosFromCSV(String fileName) throws ParseException {
        List<Scenario> scenarios = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {
            // read the data into the file
            String line = br.readLine();
            System.out.println(line);
            //load the overview
            if (line != null) {
                String[] columns = line.split(",");
                Scenario scenario = (new Scenario(Integer.parseInt(columns[0]), columns[1], Integer.parseInt(columns[2]), columns[3], columns[4],
                        columns[5], Integer.parseInt(columns[8])
                ));
                System.out.println(scenario.toString());
                scenarioRepository.save(scenario);
            }

            line = br.readLine();
            System.out.println(line);
            while (line != null) {
                String[] columns = line.split(",(?=([^\"]|\"[^\"]*\")*$)");
                System.out.println("+=====================+");
                System.out.println(Integer.parseInt(columns[0]));
                System.out.println(columns[1]);
                System.out.println(Integer.parseInt(columns[2]));
                System.out.println(columns[3]);
                System.out.println(columns[4]);
                System.out.println(columns[5]);
                System.out.println(columns[6]);
                System.out.println(Double.parseDouble(columns[7]));
                System.out.println(Integer.parseInt(columns[8]));
                System.out.println(parseData.parseProducts(columns[9]).toString());
                System.out.println(parseData.parseEffects(columns[10]).toString());
                System.out.println(columns[11]);
                System.out.println(columns[12]);
                System.out.println(columns[13]);
                System.out.println(columns[14]);
                System.out.println(columns[15]);
//                System.out.println(columns[16]);
                System.out.println(Integer.parseInt(columns[16]));
                System.out.println(Double.parseDouble(columns[17]));
                System.out.println(columns[18]);
                System.out.println(columns[19]);
                System.out.println(columns[20]);
                System.out.println(Double.parseDouble(columns[21]));
                System.out.println(columns[22]);
                System.out.println(columns[23]);
                System.out.println(columns[24]);
                System.out.println(Double.parseDouble(columns[25]));
//
//                System.out.println("-=====================-");
//                    Scenario scenario = new Scenario(Integer.parseInt(columns[0]),columns[1],Integer.parseInt(columns[2]),columns[3], columns[4],
//                            columns[5], columns[6], Double.parseDouble(columns[7]),Integer.parseInt(columns[8]), parseData.parseProducts(columns[9]), parseData.parseEffects(columns[10]),)
                Scenario scenario = (new Scenario(Integer.parseInt(columns[0]), columns[1], Integer.parseInt(columns[2]), columns[3], columns[4],
                        columns[5], columns[6], Double.parseDouble(columns[7]),
                        Integer.parseInt(columns[8]), parseData.parseProducts(columns[9]), parseData.parseEffects(columns[10]), columns[11], columns[12], columns[13],
                        columns[14], columns[15],  Integer.parseInt(columns[16]), Double.parseDouble(columns[17]), columns[18], columns[19],
                        columns[20], Double.parseDouble(columns[21]), columns[22], columns[23], columns[24], Double.parseDouble(columns[25])));


                System.out.println(scenario.toString());
                scenarioRepository.save(scenario);


                line = br.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("unable to read data from CSV");
        } catch(Exception e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }

        return scenarios;
    }

    private List<User> readPersonasFromCSV(String fileName) throws ParseException {
        List<User> users = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {
            // read the data into the file
            String line = br.readLine();
            while (line != null) {
                String[] columns = line.split(",");
                boolean insurance[] = new boolean[4];
                insurance[0] = Boolean.parseBoolean(columns[10]);
                insurance[1] = Boolean.parseBoolean(columns[11]);
                insurance[2] = Boolean.parseBoolean(columns[12]);
                insurance[3] = Boolean.parseBoolean(columns[13]);
                System.out.println(insurance[1]);

                User user = new User(Long.parseLong(columns[0]), columns[1], columns[2],
                        Long.parseLong(columns[3]), Long.parseLong(columns[4]), Long.parseLong(columns[5]),
                        Long.parseLong(columns[6]), Long.parseLong(columns[7]), Long.parseLong(columns[8]), Long.parseLong(columns[9]), insurance);
                userRepository.save(user);
                line = br.readLine();

            }
        } catch (IOException ioe) {
            System.out.println("unable to read data from CSV");
        }

        return users;
    }

    private boolean initialiseScenarios() {
        try {
            this.scenarioRepository.deleteAll();
            System.out.println("hello");
            ArrayList<Scenario> scenarioArrayList = (ArrayList<Scenario>) readScenariosFromCSV("scenariodata.csv");
            scenarioRepository.saveAll(scenarioArrayList);

        } catch (Exception e) {
            System.out.println("==== Unable to intialised Scenarios into Database");
            return false;
        }
        return true;
    }

    private boolean initialisePersonas() {
        try {
            userRepository.deleteAll();
            ArrayList<User> userArrayList = (ArrayList<User>) readPersonasFromCSV("testpersonas.csv");
            userRepository.saveAll(userArrayList);
        } catch (Exception e) {
            System.out.println("==== Unable to intialised Personas into Database");
            return false;
        }
        return true;
    }

}
