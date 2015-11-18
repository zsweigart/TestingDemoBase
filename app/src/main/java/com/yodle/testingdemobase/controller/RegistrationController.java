package com.yodle.testingdemobase.controller;

import com.yodle.testingdemobase.model.Student;
import com.yodle.testingdemobase.persistence.Datastore;
import com.yodle.testingdemobase.view.RegistrationView;

public class RegistrationController {
    private RegistrationView registrationView;
    private RegistrationActivityNavigator registrationActivityNavigator;
    private Datastore datastore;

    public RegistrationController(RegistrationView registrationView, RegistrationActivityNavigator registrationActivityNavigator) {
        this.registrationView = registrationView;
        this.registrationActivityNavigator = registrationActivityNavigator;
        this.datastore = registrationActivityNavigator.getDatastore();
    }

    public void registerNewStudent(Student student) {
        if(student != null && student.isValid()) {
            registrationActivityNavigator.closeAndLogin(student);
        }
    }

    public interface RegistrationActivityNavigator {
        Datastore getDatastore();
        void closeAndLogin(Student student);
    }
}
