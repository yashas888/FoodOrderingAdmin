package com.foodorder.foodorderadmin.Model;

public class Admins {

    private String Name,phone;

    public Admins(String name, String phone) {
        Name = name;
        this.phone = phone;
    }

    public Admins() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
