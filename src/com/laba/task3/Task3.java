package com.laba.task3;

import java.util.Random;

public class Task3 {
    private static String[] subArr = {"Фізика","Математика","Англійська мова"};
    public static void main(String[] args){

        Student student = new Student("Иванов");
        Random random = new Random();
        for(String sub:subArr){
            student.addSubject(sub);
            student.setRate(sub,random.nextInt(6));
        }
        System.out.println(student);

    }
}
