package com.bridgelabz.employeewage;
public class EmployeeWagePrograms {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        int dailyWage = 0;
        double x = Math.random();
        int isPresent = (int) (x * 10) % 2;
        if (isPresent == 0) {
            System.out.println("Employee is present");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        } else {
            System.out.println("Employee is Absent");
        }

        System.out.println("Employee Daily Wage :" + dailyWage);
    }
}

