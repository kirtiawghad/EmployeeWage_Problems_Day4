package com.bl;

public class EmployeeTotalWorkingHrs {

    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HRS = 20;
    public static final int NUM_OF_WORKING_DAYS= 20;
    public static final int Mux_HRS_IN_MONTH = 100;

    public static void main(String [] args){

        int emphrs = 0;
        int totalemphrs = 0;
        int totalworkingdays = 0;

        while(totalemphrs <= Mux_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS )
        {
            totalworkingdays++;
            double empcheck = Math.floor(Math.random()*10)%3;

            switch((int)empcheck){
                case IS_PART_TIME:
                    emphrs = 4;
                    break;

                case IS_FULL_TIME:
                    emphrs = 8;
                    break;

                default:
                    emphrs = 0;

            }
            totalemphrs +=emphrs;
            System.out.println("Day# :" + " " + totalworkingdays +" " + "EMP Hr :" +  " " +emphrs);
        }
        int totalempwage = totalemphrs * EMP_RATE_PER_HRS;
        System.out.println("Total emplyee wage" + " "+ totalempwage);
    }


}
