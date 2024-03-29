package com.Fimatic.fimatic.repository;

import com.Fimatic.fimatic.model.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScenarioRepository extends JpaRepository<Scenario,Long> {
    List<Scenario> findAllByStagenum(int stageNum);


}
