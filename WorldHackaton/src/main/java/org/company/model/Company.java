package org.company.model;

public class Company {
    private String name;
    private String production;
    private String direction;

    public Company() {
    }

    public Company(String name, String production, String direction) {
        this.name = name;
        this.production = production;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", production='" + production + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
