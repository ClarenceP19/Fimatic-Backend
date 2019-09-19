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

    @ManyToOne
    @JoinColumn(name="scenarioProduct",referencedColumnName = "id")
    private Product scenarioProduct;

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

    @ManyToOne
    @JoinColumn(name="outcomeProductOne",referencedColumnName = "id")
    private Product outcomeProductOne;

    @Column(name = "outcomeEffectOne")
    private double outcomeEffectOne;

    @ManyToOne
    @JoinColumn(name="outcomeProductTwo",referencedColumnName = "id")
    private Product outcomeProductTwo;

    @Column(name = "outcomeEffectTwo")
    private double outcomeEffectTwo;

    @Column(name = "productOffering")
    private String productOffering;

    public Scenario() {
    }

    public Scenario(String descriptionStart, String descriptionEnd, Product envProduct, double envEffect, int pivotNum, Product scenarioProduct, double scenarioEffect, int[] nextPivot, String headline) {
        this.descriptionStart = descriptionStart;
        this.descriptionEnd = descriptionEnd;
        this.pivotNum = pivotNum;
        this.scenarioProduct = scenarioProduct;
        this.scenarioEffect = scenarioEffect;
        this.nextPivot = nextPivot;
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

    public Product getScenarioProduct() {
        return scenarioProduct;
    }

    public void setScenarioProduct(Product scenarioProduct) {
        this.scenarioProduct = scenarioProduct;
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
