package com.training.demoorganisation.dto;

public class EmployeeDTO {
    private int id;
    private String name;
    private String firstName;
    private String lastName;
    private int age;
    private Double salary;
    private long departmentIdentifier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public long getDepartmentIdentifier() {
        return departmentIdentifier;
    }

    public void setDepartmentIdentifier(long departmentIdentifier) {
        this.departmentIdentifier = departmentIdentifier;
    }
}
