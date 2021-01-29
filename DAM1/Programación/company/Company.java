package org.iesfm.company;

import java.util.Arrays;
import java.util.Objects;

public class Company implements ICompany {
    private String name;
    private String cif;
    private Department[] departments;

    public Company(String name, String cif, Department[] departments) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
    }

    @Override
    public Employee[] getEmployeesOfDepartment(String departmentName) {
        Department department = findDepartment(departmentName);
        if (department != null) {
            return department.getEmployees();
        } else {
            return null;
        }
    }

    private Department findDepartment(String departmentName) {
        Department result = null;
        for (int i = 0; i < departments.length; i++) {
            Department department = departments[i];
            if (department.getName().equals(departmentName)) {
                result = department;
            }
        }
        return result;
    }

    @Override
    public void showEmployees(String departmentName) {
        Department department = findDepartment(departmentName);
        if (department != null) {
            department.showEmployees();
        } else {
            System.out.println("No hay empleados que mostrar...");
        }
    }

    @Override
    public void showAllEMployees() {
        for (Department department : departments) {
            department.showEmployees();
        }
    }

    @Override
    public void showDepartments() {
        for (int i = 0; i < departments.length; i++) {
            Department department = departments[i];
            System.out.println(department.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartaments() {
        return departments;
    }

    public void setDepartaments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(cif, company.cif) && Arrays.equals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, cif);
        result = 31 * result + Arrays.hashCode(departments);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", departaments=" + Arrays.toString(departments) +
                '}';
    }
}
