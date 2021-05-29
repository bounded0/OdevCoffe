package com.company.Entities;

import java.time.LocalDate;

public class Customer {
    int Id;
    String firstName;
    public Customer(){

    }

    public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        DateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    String lastName;
    LocalDate DateOfBirth;
    String nationalityId;

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }





}
