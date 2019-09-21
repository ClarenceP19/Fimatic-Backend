package com.Fimatic.fimatic.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="clusterID",nullable = false)
    private Long clusterID;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "bonds_value")
    private Long bonds_value;

    @Column(name = "stocks_value")
    private Long stocks_value;

    @Column(name = "savings_value")
    private Long savings_value;

    @Column(name = "total_value")
    private Long total_value;

    @Column(name = "average_spendm")
    private Long average_spendm;

    @Column(name = "average_earnm")
    private Long average_earnm;

    @Column(name = "average_savingsm")
    private Long average_savingsm;

    @Column(name = "insurance")
    private boolean[] insurance;

    public User(Long clusterID, String username, String password, Long bonds_value, Long stocks_value, Long savings_value, Long total_value, Long average_spendm, Long average_earnm, Long average_savingsm, boolean[] insurance) {
        this.clusterID = clusterID;
        this.username = username;
        this.password = password;
        this.bonds_value = bonds_value;
        this.stocks_value = stocks_value;
        this.savings_value = savings_value;
        this.total_value = total_value;
        this.average_spendm = average_spendm;
        this.average_earnm = average_earnm;
        this.average_savingsm = average_savingsm;
        this.insurance = insurance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
