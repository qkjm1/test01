package org.example;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("물리치료학과", 2019133008);

        System.out.println("학과: "+student.getName()+"\n학번: "+student.getId());
    }
}

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}