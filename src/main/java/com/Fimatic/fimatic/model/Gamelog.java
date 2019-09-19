package com.Fimatic.fimatic.model;

import com.Fimatic.fimatic.model.audit.DateAudit;

import javax.persistence.*;

@Entity
@Table(name = "gamelog")
public class Gamelog extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "scenarioId", referencedColumnName = "id")
    private Scenario scenario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "savingId", referencedColumnName = "id")
    private Product saving;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "investmentId", referencedColumnName = "id")
    private Product investment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insuranceId", referencedColumnName = "id")
    private Product insurance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bondId", referencedColumnName = "id")
    private Product bond;

//    @JoinColumn(name = "bondId", referencedColumnName = "id")
//    private Product bond;



}
