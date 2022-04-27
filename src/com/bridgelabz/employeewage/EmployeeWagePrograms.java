package com.bridgelabz.employeewage;
public class EmployeeWagePrograms {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;
    private static final int IS_FULLTIME = 1;
    private static final int IS_HALFTIME = 2;
    private static final int TOTAL_WORKING_DAYS = 20;


    public static void main(String[] args) {
        int dailyWage = 0;
        int dayCount = 1;
        while (dayCount <= TOTAL_WORKING_DAYS) {

            double x = Math.random();
            int empStatus = (int) (x * 10) % 3;
            switch (empStatus) {
                case IS_FULLTIME:
                    System.out.println("Employee worked full time");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                case IS_HALFTIME:
                    System.out.println("Employee worked part time");
                    dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }

            System.out.println("Daily Wage for day : " + dayCount + " is " + dailyWage);
            dayCount++;
        }
    }
    }


