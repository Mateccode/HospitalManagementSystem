package org.newproject.medical.entities;

import org.newproject.medical.entities.enums.BloodGroup;
import org.newproject.medical.entities.enums.Gender;
import org.newproject.medical.entities.enums.Genotype;

import java.time.LocalDate;

public abstract class User {
    private String name;
    private LocalDate DOB;
    private String phoneNumber;
    private String address;
    private String email;
    private Enum<Gender> gender;
    private Enum<BloodGroup> bloodGroup;
    private Enum<Genotype> genotype;


    //Getters and Setter for all the Fields of User

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum<Gender> getGender() {
        return gender;
    }

    public void setGender(Enum<Gender> gender) {
        this.gender = gender;
    }

    public Enum<BloodGroup> getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(Enum<BloodGroup> bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Enum<Genotype> getGenotype() {
        return genotype;
    }

    public void setGenotype(Enum<Genotype> genotype) {
        this.genotype = genotype;
    }
}
