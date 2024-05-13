package com.CH_12;


enum Department {
    assembly, manufacturing, accounts, stores
}

class Employee {
    private String name;
    private int age;
    private float salary;
    private Department dept;

    public Employee(String n, int a, float s, Department d) {
        name = n;
        age = a;
        salary = s;
        dept = d;
    }

    public void displayData() {
        System.out.println(name + " " + age + " " + " " + salary + " " + dept);
        if (dept == Department.accounts)
            System.out.println(name + "is an announcement\n");
        else
            System.out.println(name + "is not an announcement\n");
    }
}

public class Ex_04 {
    public static void main(String[] args) {
        Employee e = new Employee("Sandeep Shah", 28, 15575.50f, Department.manufacturing);
        e.displayData();
    }
}