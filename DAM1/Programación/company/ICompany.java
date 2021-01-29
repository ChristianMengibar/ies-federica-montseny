package org.iesfm.company;

public interface ICompany {
    void showDepartments();

    Employee[] getEmployeesOfDepartment(String departmentName);

    void showEmployees(String departmentName);

    void showAllEMployees();
}
