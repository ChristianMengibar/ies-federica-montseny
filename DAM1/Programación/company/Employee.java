package org.iesfm.company;

import java.util.Objects;

public class Employee {
    private String nif;
    private String name;
    private String secondName;
    private String role;

    public Employee(String nif, String name, String secondName, String role) {
        this.nif = nif;
        this.name = name;
        this.secondName = secondName;
        this.role = role;
    }

    public void infoEmployee() {
        System.out.println(nif);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(nif, employee.nif) && Objects.equals(name, employee.name) && Objects.equals(secondName, employee.secondName) && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, secondName, role);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
