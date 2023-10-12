package org.newproject.medical.services;

import org.newproject.medical.entities.Patients;

public interface MedicalServices {

    void discharge();
    void admit(Patients patients);

}
