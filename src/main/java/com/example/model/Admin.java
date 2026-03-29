package com.example.model;

public class Admin extends Employee {
    private int accessLevel;
    private boolean superAdmin;

    public Admin() {}

    public Admin(String firstName, String lastName, String email, int accessLevel) {
        super(firstName, lastName, email, "Administration", "Admin");
        this.accessLevel = accessLevel;
        this.superAdmin = false;
    }

    public int getAccessLevel() { return accessLevel; }
    public void setAccessLevel(int accessLevel) { this.accessLevel = accessLevel; }
    public boolean isSuperAdmin() { return superAdmin; }
    public void setSuperAdmin(boolean superAdmin) { this.superAdmin = superAdmin; }

    public boolean canAccess(int requiredLevel) {
        return this.accessLevel >= requiredLevel;
    }
}
