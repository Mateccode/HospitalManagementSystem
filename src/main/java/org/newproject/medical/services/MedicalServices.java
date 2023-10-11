package org.newproject.medical.services;

public abstract class MedicalServices {

    protected abstract void discharge();

    public void admitted(){
        System.out.println("Admitted");
    }

}
