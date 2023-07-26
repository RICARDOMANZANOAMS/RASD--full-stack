package com.cistech.rasd.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="parametersrasd")
public class ParameterRASD {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String nameParameter;
    @Column(name="value")
    private double valueParameter;

    public ParameterRASD() {
    }

    public ParameterRASD(String nameParameter, double valueParameter) {
        this.nameParameter = nameParameter;
        this.valueParameter = valueParameter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameParameter() {
        return nameParameter;
    }

    public void setNameParameter(String nameParameter) {
        this.nameParameter = nameParameter;
    }

    public double getValueParameter() {
        return valueParameter;
    }

    public void setValueParameter(double valueParameter) {
        this.valueParameter = valueParameter;
    }

    @Override
    public String toString() {
        return "ParameterRASD{" +
                "id=" + id +
                ", nameParameter='" + nameParameter + '\'' +
                ", valueParameter=" + valueParameter +
                '}';
    }
}
