package com.prog.pattern.example.correct.impl.v3.employ.adapter;

import com.prog.pattern.example.correct.impl.v3.employ.Employee;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return "ID: " + instance.getCn()
                + " First Name: " + instance.getGivenName()
                + " Last Name: " + instance.getSurname()
                + " Email: " + instance.getMail();
    }
}
