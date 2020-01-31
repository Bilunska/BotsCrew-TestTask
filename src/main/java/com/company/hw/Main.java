package com.company.hw;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        University olyaUser = new University();

        Scanner myInput = new Scanner(System.in);
        System.out.println("[1] Who is head of department? ");
        System.out.println("[2] SHOW {department_name} statistic and COUNT of employees:");
        System.out.println("[3] Show the average salary for department {department_name}.\n ENTER department from this list{Math, Biology, Philosophy, Foreigh Language, Informatics} -> ");
        System.out.println("[4] Search of lectors:");
        System.out.println("Here are 1-4 commands. \tEnter 0 to EXIT \nEnter Number of task:");
        while (myInput.hasNextInt()) {
            int task = myInput.nextInt();
                switch (task) {
                    case 1:
                        System.out.print("[1]\n");
                        olyaUser.printHeadOfDepartments();
                        System.out.println("Please, choose next 1-5 ->");
                        break;
                    case 2:
                        System.out.print("[2] ENTER department from this list{Math, Biology, Philosophy, Foreigh Language, Informatics} ->\n");
                        Scanner input2 = new Scanner(System.in);
                        String inpGenre = input2.next();
                        olyaUser.showDepartmentStatistics(inpGenre);
                        System.out.println("Please, choose next 1-5 ->");
                        break;
                    case 3:
                        System.out.print("[3] ENTER department from this list{Math, Biology, Philosophy, Foreigh Language, Informatics} ->\n");
                        Scanner input3 = new Scanner(System.in);
                        String inp = input3.next();
                        olyaUser.showAverageSalary(inp);
                        System.out.println("Please, choose next 1-5 ->");
                        break;

                    case 4:
                        System.out.print("[4] ENTER department from this list{Math, Biology, Philosophy, Foreigh Language, Informatics} ->\n");
                        Scanner input4 = new Scanner(System.in);
                        String inp4 = input4.next();
                        olyaUser.countEmployee(inp4);
                        System.out.println("Please, choose next 1-5 ->");
                        break;

                        case 5:
                        System.out.print("[5] ENTER search template: (You can try `enko`, `hakes`, `te`) -> \n");
                        Scanner input5 = new Scanner(System.in);
                        String template = input5.next();
                        olyaUser.globalSearch(template);
                        System.out.println("Please, choose next 1-5 ->");
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Woops. Hyston we have a problems. Try again with menu");
                        System.out.println("Enter 0 to EXIT");
                }
        }
    }
}