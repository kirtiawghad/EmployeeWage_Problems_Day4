package com.bl;

public class WageForMonth {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_PER_HRS_RATE = 20;
    public static final int NUM_OF_DAY_MONTH = 20;
    public static void main(String[] args) {
        int empwage = 0;
        int emphrs = 0;
        int totalwage = 0;

        for (int i=0; i<=NUM_OF_DAY_MONTH; i++){

            double empcheck = Math.floor(Math.random()*10)%3;

            switch ((int)empcheck){
                case IS_FULL_TIME:
                    emphrs = 8;
                    break;
                case IS_PART_TIME:
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
            }
            empwage = emphrs * EMP_PER_HRS_RATE;
            System.out.println(empwage);
        }
        totalwage = totalwage + empwage;
        System.out.println(totalwage);
    }
}