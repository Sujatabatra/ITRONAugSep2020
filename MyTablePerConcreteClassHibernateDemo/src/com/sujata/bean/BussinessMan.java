package com.sujata.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class BussinessMan extends Person {
    private String bussinessType;
    private int annualTurnOver;

    public BussinessMan() {
    }

    public BussinessMan(String personId, String personName, String bussinessType, int annualTurnOver) {
        super(personId, personName);
        this.bussinessType = bussinessType;
        this.annualTurnOver = annualTurnOver;
    }

    public String getBussinessType() {
        return bussinessType;
    }

    public void setBussinessType(String bussinessType) {
        this.bussinessType = bussinessType;
    }

    public int getAnnualTurnOver() {
        return annualTurnOver;
    }

    public void setAnnualTurnOver(int annualTurnOver) {
        this.annualTurnOver = annualTurnOver;
    }
}
