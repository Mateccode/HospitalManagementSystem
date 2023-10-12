package org.newproject.medical.serviceimpl;

import org.newproject.medical.entities.Patients;
import org.newproject.medical.services.MedicalServices;

public class MedicalServiceImplements implements MedicalServices {

    public void discharge () {
        System.out.println("discharged");
    }

    public void admit(Patients patients) {
        Patients.listOfPatients.add(patients);
    }

}
