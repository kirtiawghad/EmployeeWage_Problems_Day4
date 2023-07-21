package com.bl;

public class PartTimeEmployeeWage {

    public static void main(String[] args) {

        int is_part_time = 1;
        int is_full_time = 2;
        int emp_rate_per_hrs =20;
        int emphrs =0;
        int empwage =0;

        double empcheck = Math.floor(Math.random()*10)%3;

        if (empcheck == is_part_time){
            emphrs = 4;
        } else if (empcheck == is_full_time) {

            emphrs = 8;

        }
        empwage = emphrs * emp_rate_per_hrs;
        System.out.println(empwage);
    }

}