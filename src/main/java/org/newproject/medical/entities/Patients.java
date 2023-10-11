package org.newproject.medical.entities;

import java.util.List;

public class Patients extends User{

    private  String lastPrescription;
    private String diagonostic;
    private double weight;
    private double height;
    private List<Ailments> ailments;
    private String disability;
    private List<Allegies> allegies;
    private String occupation;


    //Getters and Setter for all the Fields of Patients


    public String getLastPrescription() {
        return lastPrescription;
    }

    public void setLastPrescription(String lastPrescription) {
        this.lastPrescription = lastPrescription;
    }

    public String getDiagonostic() {
        return diagonostic;
    }

    public void setDiagonostic(String diagonostic) {
        this.diagonostic = diagonostic;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<Allegies> getAllegies() {
        return allegies;
    }

    public void setAllegies(List<Allegies> allegies) {
        this.allegies = allegies;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public List<Ailments> getAilments() {
        return ailments;
    }

    public void setAilments(List<Ailments> ailments) {
        this.ailments = ailments;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
