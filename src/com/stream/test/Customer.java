package com.stream.test;

import java.util.List;

public class Customer {
    private  int id;
    private String name;
    private  String location;
    private  String emailID;
    private String contactNo;
    private List<Address> addresse;

    public Customer() {
    }

    public Customer(int id, String name, String location, String emailID, String contactNo, List<Address> addresse) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.emailID = emailID;
        this.contactNo = contactNo;
        this.addresse = addresse;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public List<Address> getAddresse() {
        return addresse;
    }

    public void setAddresse(List<Address> addresse) {
        this.addresse = addresse;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", emailID='" + emailID + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", addresse=" + addresse +
                '}';
    }
}
