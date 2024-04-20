package org.example;

public class Student {
    public String name;
    public int age;
    public double gpa;

    Student() {
        System.out.println("Student object created!");
    }

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public void printData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    int getAge() {
        return age;
    }
}
