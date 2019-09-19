package com.Fimatic.fimatic.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="type")
    private String type;

    @Column(name="description")
    private String description;

    @Column(name="insuranceTypes")
    private String[] insuranceTypes;

    public Product(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public Product(String type, String description, String[] insuranceTypes) {
        this.type = type;
        this.description = description;
        this.insuranceTypes = insuranceTypes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
