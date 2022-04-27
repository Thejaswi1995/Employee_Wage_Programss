package com.bridgelabz.employeewage;
public class EmployeeWagePrograms
{
    public static void main(String[] args) {
        double x = Math.random();
        int isPresent = (int) (x*10) % 2;
        if(isPresent==0) {
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is Absent");
        }

    }
}

