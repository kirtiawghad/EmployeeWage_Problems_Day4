package com.bl;

public class EmployeeWage {
    public static void main(String[] args) {
        int is_full_time = 1;
        double emp_check = Math.floor(Math.random()*10)%2;
        //System.out.println(emp_check);
        if (emp_check == is_full_time){
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee not Present");
        }
    }
}
