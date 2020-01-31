package com.company.hw;

import com.company.hw.lectors.Assistant;
import com.company.hw.lectors.AssociateProfesor;
import com.company.hw.lectors.Professor;
import java.util.*;

public class University {

    private List<Department> employee;
    University() {
        employee = new ArrayList<>();
        employee.add(new Assistant("N. Pidmogylnuy", "Math", 2000, false));
        employee.add(new Assistant("M. Zerov", "Math", 5000, false));
        employee.add(new Assistant("B. Voronnuy", "Math", 11000, false));
        employee.add(new Assistant("E. Bronte", "Foreign Language", 12000, false));
        employee.add(new Assistant("E. Bronte", "Math", 9600, false));
        employee.add(new Assistant("W. Shakespeare", "Informatics", 5300, false));
        employee.add(new Assistant("T. Shevchenko", "Informatics", 4500, false));
        employee.add(new Assistant("T. Shevchenko", "Math", 8500, false));
        employee.add(new Assistant("T. Shevchenko", "Philosophy", 9560, false));

        employee.add(new AssociateProfesor("O. Bilyk", "Biology", 12000, true));
        employee.add(new AssociateProfesor("P. Ivanov", "Math", 10000, false));
        employee.add(new AssociateProfesor("M. Orlyk", "Informatics", 9000, false));

        employee.add(new Professor("A. Chornuy", "Informatics", 13200, true));
        employee.add(new Professor("K. Dankovych", "Math", 14450, true));
        employee.add(new Professor("H. Nazarov", "Foreigh Language", 10500, true));
        employee.add(new Professor("L. Poznyak", "Philosophy", 10500, true));

    }


    //1
    void printHeadOfDepartments() {
        employee.stream()
                .filter(element -> element.isHead)
                .forEach(element -> System.out.println(String.format("Head of %s department is %s", element.getDepartmentName(), element.getLectorName())));
    }

    //2
    void showDepartmentStatistics(String departmentName) {
        List<Department> tempList = new ArrayList<>();
        employee.stream()
                .filter(element -> element.toString().contains(departmentName))
                .forEach(tempList::add);
        System.out.println("Count of employee:" + tempList.size());
        System.out.println(tempList);


        List<Department> assistantList = new ArrayList<>();
        List<Department> assocProfessorList = new ArrayList<>();
        List<Department> professorList = new ArrayList<>();
        tempList.stream()
                .filter(element -> element.getClass().toString().contains("Assistant"))
                .forEach(assistantList::add);
        System.out.println("assistans - " + assistantList.size());

        tempList.stream()
                .filter(element -> element.getClass().toString().contains("AssociateProfesor"))
                .forEach(assocProfessorList::add);
        System.out.println("associate professors - " + assocProfessorList.size());

        tempList.stream()
                .filter(element -> element.getClass().toString().contains("Professor"))
                .forEach(professorList::add);
        System.out.println("professor - " + professorList.size());

        if (tempList.isEmpty()) {
            System.out.println("Sorry, we don't have any employees in this department");
        }
    }


    //3
    void showAverageSalary(String departmentName) {
        List<Integer> salaryList = new ArrayList<>();
        employee.stream()
                .filter(element -> element.getDepartmentName().contains(departmentName))
                .forEach(el -> salaryList.add(el.getSalary()));
        int sum = 0;
        double average = 1;
        for (Integer element: salaryList) {
            sum += element;
            average = (sum / salaryList.size());
        }
        System.out.println(String.format("The average salary of %s department is %g", departmentName, average));
    }

    //4
    void countEmployee(String departmentName) {
        List<Department> tempList = new ArrayList<>();
        int count = 0;
        for(Department el: employee){
            for (int i = 0; i < 1; i++) {
                if(el.getDepartmentName().equals(departmentName)){
                    tempList.add(el);
                    count++;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(String.format("Show count of employee for %s: %d", departmentName, count));
    }

    //5
    void globalSearch (String template){
        List<Department> tempList = new ArrayList<>();
        employee.stream()
                .filter(element -> element.getLectorName().contains(template))
                .forEach(tempList::add);
        System.out.println(tempList);
    }
}



