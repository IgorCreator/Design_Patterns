package com.prog.pattern.example.correct.impl.v3.employ.adapter;

import com.prog.pattern.example.correct.impl.v3.employ.Employee;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return "ID: " + instance.getId()
                + " First Name: " + instance.getFirstname()
                + " Last Name: " + instance.getLastname()
                + " Email: " + instance.getEmailAddress();
    }
}
