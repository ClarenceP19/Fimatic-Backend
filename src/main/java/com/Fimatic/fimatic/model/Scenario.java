package com.Fimatic.fimatic.model;

import javax.persistence.*;

@Entity
public class Scenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "episodeName")
    private String episodeName;

    @Column(name = "pivotNum")
    private int pivotNum;

    @Column(name="title")
    private String title;

    @Column(name = "headlineStart")
    private String headlineStart;

    @Column(name = "descriptionStart")
    private String descriptionStart;

    @Column(name = "objective")
    private String objective;

    @Column(name="scenarioProduct")
    private String scenarioProduct;

    @Column(name = "scenarioEffect")
    private double scenarioEffect;

    @Column(name = "stageNum")
    private int stagenum;

    @Column(name = "nextPivot")
    private int[] nextPivot;

    @Column(name = "descriptionEnd")
    private String descriptionEnd;

    @Column(name = "optionOne")
    private String optionOne;

    @Column(name = "optionTwo")
    private String optionTwo;

    @Column(name = "optionThree")
    private String optionThree;

    @Column(name = "optionFour")
    private String optionFour;

    @Column(name = "optionFive")
    private String optionFive;

    @Column(name = "outcomeProbability")
    private int outcomeProbability;

    @Column(name="headlineOne")
    private String headlineOne;

    @Column(name="descriptionOne")
    private String descriptionOne;

    @Column(name="outcomeProductOne")
    private String outcomeProductOne;

    @Column(name = "outcomeEffectOne")
    private double outcomeEffectOne;

    @Column(name="outcomeProductTwo")
    private String outcomeProductTwo;

    @Column(name = "outcomeEffectTwo")
    private double outcomeEffectTwo;

    @Column(name = "productOffering")
    private String productOffering;

    public Scenario() {
    }

    public Scenario(String episodeName, int pivotNum, String title, String headlineStart, String descriptionStart, String objective, String scenarioProduct, double scenarioEffect, int stagenum, int[] nextPivot, String descriptionEnd, String optionOne, String optionTwo, String optionThree, String optionFour, String optionFive, int outcomeProbability, String headlineOne, String descriptionOne, String outcomeProductOne, double outcomeEffectOne, String outcomeProductTwo, double outcomeEffectTwo, String productOffering) {
        this.episodeName = episodeName;
        this.pivotNum = pivotNum;
        this.title = title;
        this.headlineStart = headlineStart;
        this.descriptionStart = descriptionStart;
        this.objective = objective;
        this.scenarioProduct = scenarioProduct;
        this.scenarioEffect = scenarioEffect;
        this.stagenum = stagenum;
        this.nextPivot = nextPivot;
        this.descriptionEnd = descriptionEnd;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.optionFive = optionFive;
        this.outcomeProbability = outcomeProbability;
        this.headlineOne = headlineOne;
        this.descriptionOne = descriptionOne;
        this.outcomeProductOne = outcomeProductOne;
        this.outcomeEffectOne = outcomeEffectOne;
        this.outcomeProductTwo = outcomeProductTwo;
        this.outcomeEffectTwo = outcomeEffectTwo;
        this.productOffering = productOffering;
    }

    public String getDescriptionStart() {
        return descriptionStart;
    }

    public void setDescriptionStart(String descriptionStart) {
        this.descriptionStart = descriptionStart;
    }

    public String getDescriptionEnd() {
        return descriptionEnd;
    }

    public void setDescriptionEnd(String descriptionEnd) {
        this.descriptionEnd = descriptionEnd;
    }

    public int getPivotNum() {
        return pivotNum;
    }

    public void setPivotNum(int pivotNum) {
        this.pivotNum = pivotNum;
    }


    public double getScenarioEffect() {
        return scenarioEffect;
    }

    public void setScenarioEffect(double scenarioEffect) {
        this.scenarioEffect = scenarioEffect;
    }

    public int[] getNextPivot() {
        return nextPivot;
    }

    public void setNextPivot(int[] nextPivot) {
        this.nextPivot = nextPivot;
    }

}
