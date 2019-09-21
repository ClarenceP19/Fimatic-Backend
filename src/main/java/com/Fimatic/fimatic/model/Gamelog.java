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

    @Column(name = "savings")
    private Long savings;

    @Column(name = "stocks")
    private Long stocks;

    @Column(name = "bonds")
    private Long bonds;

    @Column(name = "insurances")
    private Boolean[] insurance;

    @Column(name = "networth")
    private Long networth;

    public Gamelog(User user, Scenario scenario, Long savings, Long stocks, Long bonds, Boolean[] insurance, Long networth) {
        this.user = user;
        this.scenario = scenario;
        this.savings = savings;
        this.stocks = stocks;
        this.bonds = bonds;
        this.insurance = insurance;
        this.networth = networth;
    }
}
