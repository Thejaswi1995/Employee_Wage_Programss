package com.bridgelabz.employeewage;
public class EmployeeWagePrograms {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;

    public static void main(String[] args) {
        int dailyWage = 0;
        double x = Math.random();
        int empStatus = (int) (x * 10) % 3;
        if (empStatus == 1) {
            System.out.println("Employee worked full time");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        }
            else if (empStatus == 2) {
                System.out.println("Employee worked part time");
                dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
        } else {
            System.out.println("Employee is Absent");
        }

        System.out.println("Employee Daily Wage :" + dailyWage);
    }
}

