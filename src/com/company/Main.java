package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loopInt = 1;
        while (loopInt == 1) {
            System.out.println("To Break Enter X");
            System.out.println("Employee Name:");
            String employeeName = input.next();
            if (employeeName.equals("X")) {
                break;
            }
            System.out.println("Hours Worked:");
            double hoursWorked = input.nextInt();
            System.out.println("Wage");
            int wage = input.nextInt();

            //the maths
            if (hoursWorked > 45){
                hoursWorked = hoursWorked + ((hoursWorked-45)*1.5);
            }
            double pay = (hoursWorked*wage);
            System.out.println(employeeName + " gets " + pay + " this week");
        }
    }
}
