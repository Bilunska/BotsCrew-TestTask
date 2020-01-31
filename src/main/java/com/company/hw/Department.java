package com.company.hw;

public abstract class Department {
    private String lectorName;
    private int lectorSalary;
    private String departmentName;
    boolean isHead;

    public Department(String lector, String name, int salary, boolean manage) {
        lectorName = lector;
        departmentName = name;
        lectorSalary = salary;
        isHead = manage;
    }

    public String getLectorName() {
        return lectorName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getSalary() {
        return lectorSalary;
    }


    public String toString(){
        return String.format("%s <%s> |%d|", lectorName, departmentName, lectorSalary);
    }

}
