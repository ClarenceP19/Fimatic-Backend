package com.Fimatic.fimatic.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;

@Entity
public class Scenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "episodeNum")
    private int episodeNum;

    @Column(name = "episodeName")
    private String episodeName;

    @Column(name = "pivotNum")
    private int pivotNum;

    @Column(name = "title")
    private String title;

    @Column(name = "headlineStart")
    private String headlineStart;

    @Column(name = "descriptionStart",length = 1024)
    private String descriptionStart;

    @Column(name = "scenarioProduct")
    private String scenarioProduct;

    @Column(name = "scenarioEffect")
    private double scenarioEffect;

    @Column(name = "stageNum")
    private int stagenum;

    @Column(name = "products")
    private String[] products;

    @Column(name = "effects")
    private double[] effects;

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

    @Column(name = "optimalDecision")
    private int optimalDecision;

    @Column(name = "outcomeProbability")
    private double outcomeProbability;

    @Column(name = "headlineOne")
    private String headlineOne;

    @Column(name = "descriptionOne",length = 1024)
    private String descriptionOne;

    @Column(name = "outcomeProductOne")
    private String outcomeProductOne;

    @Column(name = "outcomeEffectOne")
    private double outcomeEffectOne;

    @Column(name = "headlineTwo")
    private String headlineTwo;

    @Column(name = "descriptionTwo",length = 1024)
    private String descriptionTwo;

    @Column(name = "outcomeProductTwo")
    private String outcomeProductTwo;

    @Column(name = "outcomeEffectTwo")
    private double outcomeEffectTwo;

    public Scenario() {
    }

    public Scenario(int episodeNum, String episodeName, int pivotNum, String title, String headlineStart, String descriptionStart, String scenarioProduct, double scenarioEffect, int stagenum, String[] products, double[] effects, String optionOne, String optionTwo, String optionThree, String optionFour, String optionFive, int optimalDecision, double outcomeProbability, String headlineOne, String descriptionOne, String outcomeProductOne, double outcomeEffectOne, String headlineTwo, String descriptionTwo, String outcomeProductTwo, double outcomeEffectTwo) {
        this.episodeNum = episodeNum;
        this.episodeName = episodeName;
        this.pivotNum = pivotNum;
        this.title = title;
        this.headlineStart = headlineStart;
        this.descriptionStart = descriptionStart;
        this.scenarioProduct = scenarioProduct;
        this.scenarioEffect = scenarioEffect;
        this.stagenum = stagenum;
        this.products = products;
        this.effects = effects;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.optionFive = optionFive;
        this.optimalDecision = optimalDecision;
        this.outcomeProbability = outcomeProbability;
        this.headlineOne = headlineOne;
        this.descriptionOne = descriptionOne;
        this.outcomeProductOne = outcomeProductOne;
        this.outcomeEffectOne = outcomeEffectOne;
        this.headlineTwo = headlineTwo;
        this.descriptionTwo = descriptionTwo;
        this.outcomeProductTwo = outcomeProductTwo;
        this.outcomeEffectTwo = outcomeEffectTwo;
    }

    public Scenario(int episodeNum, String episodeName, int pivotNum, String title, String headlineStart, String descriptionStart, int stagenum) {
        this.episodeNum = episodeNum;
        this.episodeName = episodeName;
        this.pivotNum = pivotNum;
        this.title = title;
        this.headlineStart = headlineStart;
        this.descriptionStart = descriptionStart;
        this.stagenum = stagenum;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public int getPivotNum() {
        return pivotNum;
    }

    public void setPivotNum(int pivotNum) {
        this.pivotNum = pivotNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadlineStart() {
        return headlineStart;
    }

    public void setHeadlineStart(String headlineStart) {
        this.headlineStart = headlineStart;
    }

    public String getDescriptionStart() {
        return descriptionStart;
    }

    public void setDescriptionStart(String descriptionStart) {
        this.descriptionStart = descriptionStart;
    }

    public String getScenarioProduct() {
        return scenarioProduct;
    }

    public void setScenarioProduct(String scenarioProduct) {
        this.scenarioProduct = scenarioProduct;
    }

    public double getScenarioEffect() {
        return scenarioEffect;
    }

    public void setScenarioEffect(double scenarioEffect) {
        this.scenarioEffect = scenarioEffect;
    }

    public int getStagenum() {
        return stagenum;
    }

    public void setStagenum(int stagenum) {
        this.stagenum = stagenum;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public double[] getEffects() {
        return effects;
    }

    public void setEffects(double[] effects) {
        this.effects = effects;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }

    public String getOptionFive() {
        return optionFive;
    }

    public void setOptionFive(String optionFive) {
        this.optionFive = optionFive;
    }

    public int getOptimalDecision() {
        return optimalDecision;
    }

    public void setOptimalDecision(int optimalDecision) {
        this.optimalDecision = optimalDecision;
    }


    public void setOutcomeProbability(double outcomeProbability) {
        this.outcomeProbability = outcomeProbability;
    }

    public String getHeadlineOne() {
        return headlineOne;
    }

    public void setHeadlineOne(String headlineOne) {
        this.headlineOne = headlineOne;
    }

    public String getDescriptionOne() {
        return descriptionOne;
    }

    public void setDescriptionOne(String descriptionOne) {
        this.descriptionOne = descriptionOne;
    }

    public String getOutcomeProductOne() {
        return outcomeProductOne;
    }

    public void setOutcomeProductOne(String outcomeProductOne) {
        this.outcomeProductOne = outcomeProductOne;
    }

    public double getOutcomeEffectOne() {
        return outcomeEffectOne;
    }

    public void setOutcomeEffectOne(double outcomeEffectOne) {
        this.outcomeEffectOne = outcomeEffectOne;
    }

    public String getHeadlineTwo() {
        return headlineTwo;
    }

    public void setHeadlineTwo(String headlineTwo) {
        this.headlineTwo = headlineTwo;
    }

    public String getDescriptionTwo() {
        return descriptionTwo;
    }

    public void setDescriptionTwo(String descriptionTwo) {
        this.descriptionTwo = descriptionTwo;
    }

    public String getOutcomeProductTwo() {
        return outcomeProductTwo;
    }

    public void setOutcomeProductTwo(String outcomeProductTwo) {
        this.outcomeProductTwo = outcomeProductTwo;
    }

    public double getOutcomeEffectTwo() {
        return outcomeEffectTwo;
    }

    public void setOutcomeEffectTwo(double outcomeEffectTwo) {
        this.outcomeEffectTwo = outcomeEffectTwo;
    }


}
