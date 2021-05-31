package com.codeclan.example.employee.models;

import javax.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="employeeNumber")
    private String employeeNumber;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="email")
    private String email;

    public Employee(String employeeNumber, String name, int age, String email) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
