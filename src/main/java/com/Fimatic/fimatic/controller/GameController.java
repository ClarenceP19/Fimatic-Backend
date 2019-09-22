package com.Fimatic.fimatic.controller;


import com.Fimatic.fimatic.exception.DataNotFoundException;
import com.Fimatic.fimatic.model.Gamelog;
import com.Fimatic.fimatic.model.Scenario;
import com.Fimatic.fimatic.model.User;
import com.Fimatic.fimatic.payload.ApiResponse;
import com.Fimatic.fimatic.payload.LoginRequest;
import com.Fimatic.fimatic.payload.ScenarioRequest;
import com.Fimatic.fimatic.repository.GamelogRepository;
import com.Fimatic.fimatic.repository.ScenarioRepository;
import com.Fimatic.fimatic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.crypto.Data;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/game")
public class GameController {

    //game start that gets initial scenario

    @Autowired
    ScenarioRepository scenarioRepository;

    @Autowired
    GamelogRepository gamelogRepository;

    @Autowired
    UserRepository userRepository;

    @CrossOrigin
    @RequestMapping("/getOverview")
    public ResponseEntity<?> getOverview() throws DataNotFoundException{
        List<Scenario> scenarios = scenarioRepository.findAllByStagenum(1);
        //the first step is the overview page
        return ResponseEntity.ok(scenarios.get(0));
    }
    @CrossOrigin
    @RequestMapping("/getScenario")
    public ResponseEntity<?> getScenario(@RequestBody ScenarioRequest scenarioRequest ) throws DataNotFoundException {


        scenarioRequest.getBonds();

        User user = userRepository.findById(scenarioRequest.getUserId()).orElseThrow(()->new DataNotFoundException("User not found"));

        //compute score
        Scenario currentScenario = scenarioRepository.findById(scenarioRequest.getScenarioId()).orElseThrow(()-> new DataNotFoundException("Scenario not found"));
//        Long score = currentScenario.
        //store in gamelog
        Gamelog gamelog = new Gamelog(user,currentScenario,scenarioRequest.getSavings(),scenarioRequest.getStocks(),scenarioRequest.getBonds(),scenarioRequest.getInsurance(),scenarioRequest.getNetworth());
        gamelogRepository.save(gamelog);


        //return another scenario
        List<Scenario> scenarios = scenarioRepository.findAllByStagenum(6);
        Random rand = new Random();
        int index = rand.nextInt(scenarios.size());


        return ResponseEntity.ok(scenarios.get(index));


    }


}
