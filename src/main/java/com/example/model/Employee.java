package com.example.model;

import java.math.BigDecimal;

public class Employee extends Person {
    private String department;
    private String role;
    private BigDecimal salary;

    public Employee() {}

    public Employee(String firstName, String lastName, String email, String department, String role) {
        super(firstName, lastName, email);
        this.department = department;
        this.role = role;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public BigDecimal getSalary() { return salary; }
    public void setSalary(BigDecimal salary) { this.salary = salary; }
}
