package org.newproject;

import org.newproject.medical.entities.Ailments;
import org.newproject.medical.entities.MedicalStaff;
import org.newproject.medical.entities.Patients;
import org.newproject.medical.entities.enums.BloodGroup;
import org.newproject.medical.entities.enums.Gender;
import org.newproject.medical.serviceimpl.MedicalServiceImplements;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    public static List<Patients> listOfPatients = new ArrayList<>();
    public static void main(String[] args) {

        Logger log = Logger.getGlobal();
        MedicalStaff medicalStaff = new MedicalStaff();


       //To use BigDecimal for collecting currency, create an object of BigDecimal and set the
        //constructor value as the currency amount, then put the object name into the setter method
        BigDecimal fee = new BigDecimal(65);
        medicalStaff.setConsultingFee(fee);

        //Enums will be called by the Enum name followed by . and the value you want
        medicalStaff.setGender(Gender.MALE);

        // to be able to fill in the list Of Ailments, we need to create the object of Ailments that holds
        // all properties and methods of Ailments, then we set the value of the property in Ailments
        //then we create a List object with listOfAilments which will collect all Ailments that added into it
        Ailments illness = new Ailments();
        illness.setName("Rashes");
        illness.setTreatment("Meet the doctor");

        List<Ailments> listOfAilments = new ArrayList<>();
        listOfAilments.add(illness);

        //In the Patients constructor, we just put the listOfAilments as value for the List<Ailments>
        Patients patients = new Patients("Emma", listOfAilments);
        System.out.println(patients);
    }
}