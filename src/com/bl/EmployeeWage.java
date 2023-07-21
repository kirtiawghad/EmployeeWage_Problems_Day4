package com.bl;

public class EmployeeWage {
    public static void main(String[] args) {
        int is_fill_time = 1;
        int emp_per_hrs_rate = 20;
        int emphrs = 0;
        int empwage = 0;

        double empcheck = Math.floor(Math.random()*10)%2;
        if (empcheck == is_fill_time){
            emphrs=8;
        }else {
            emphrs =0;
        }
        empwage = emphrs * emp_per_hrs_rate;
        System.out.println("EMployee Dealy Wage is :"+empwage);
    }
}
