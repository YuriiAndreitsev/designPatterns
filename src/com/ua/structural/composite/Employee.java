package com.ua.structural.composite;

public interface Employee {
    void showEmployeeDetails();
}

class Developer implements Employee {
    private String name;
    private long employeeId;
    private String position;

    public Developer(String name, long employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                '}';
    }
}

class Manager implements Employee {
    private String name;
    private long employeeId;
    private String position;

    public Manager(String name, long employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                '}';
    }
}


