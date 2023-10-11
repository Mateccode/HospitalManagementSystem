package org.newproject.medical.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class MedicalStaff extends User{


    private String role;
    private String specialty;
    private LocalDate shiftDate;
    private LocalTime shiftTime;
    //private String schedule;
    private int wardNo;
    private BigDecimal consultingFee;
    private int regNo;
    private double salary;



    //Getters and Setter for all the Fields of Doctor


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setConsultingFee(BigDecimal consultingFee) {
        this.consultingFee = consultingFee;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public LocalDate getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(LocalDate shiftDate) {
        this.shiftDate = shiftDate;
    }

    public LocalTime getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(LocalTime shiftTime) {
        this.shiftTime = shiftTime;
    }

    public int getWardNo() {
        return wardNo;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public BigDecimal getConsultingFee() {
        return consultingFee;
    }
}
