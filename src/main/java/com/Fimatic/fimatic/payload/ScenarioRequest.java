package com.Fimatic.fimatic.payload;

import javax.validation.constraints.NotBlank;

public class ScenarioRequest {

//    @NotBlank
    private Long savings;

//    @NotBlank
    private Long stocks;

//    @NotBlank
    private Long bonds;

//    @NotBlank
    private Long userId;

//    @NotBlank
    private Long scenarioId;

//    @NotBlank
    private Boolean[] insurance;

//    @NotBlank
    private Long networth;

    public Long getSavings() {
        return savings;
    }

    public Long getStocks() {
        return stocks;
    }

    public Long getBonds() {
        return bonds;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getScenarioId() {
        return scenarioId;
    }

    public Boolean[] getInsurance() {
        return insurance;
    }

    public Long getNetworth() {
        return networth;
    }

    public void setNetworth(Long networth) {
        this.networth = networth;
    }
}
