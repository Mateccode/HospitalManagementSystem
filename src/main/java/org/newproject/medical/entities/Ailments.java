package org.newproject.medical.entities;

public class Ailments {

    private String name;
    private String treatment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "Name of Allergies: " + name +
                ", Treatment: " + treatment;
    }
}
