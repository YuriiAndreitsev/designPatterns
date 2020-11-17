package com.ua.structural.composite;

public class Company {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Yura", 100, "pro-developer");
        Employee developer2 = new Developer("Fedor", 101, "entry-level-developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(developer1);
        engDirectory.addEmployee(developer2);

        Employee manager1 = new Manager("George", 102, "pro-manager");
        Employee manager2 = new Manager("Julia", 103, "another-manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(manager1);
        accDirectory.addEmployee(manager2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
