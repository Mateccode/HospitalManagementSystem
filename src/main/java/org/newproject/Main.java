package org.newproject;

import org.newproject.medical.entities.MedicalStaff;
import org.newproject.medical.entities.enums.BloodGroup;
import org.newproject.medical.entities.enums.Gender;
import org.newproject.medical.serviceimpl.MedicalServiceImplements;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

       MedicalStaff medicalStaff = new MedicalStaff();

       //To use BigDecimal for collecting currency, create an object of BigDecimal and set the
        //constructor value as the currency amount, then put the object name into the setter method
        BigDecimal fee = new BigDecimal(65);
        medicalStaff.setConsultingFee(fee);


        //Enums will be called by the Enum name followed by . and the value you want
        medicalStaff.setGender(Gender.MALE);


        medicalStaff.setName("Tayo");

        System.out.println(medicalStaff.getName());;

        MedicalServiceImplements medServImple = new MedicalServiceImplements();

        medServImple.admitted();

        medServImple.discharge();


    }
}