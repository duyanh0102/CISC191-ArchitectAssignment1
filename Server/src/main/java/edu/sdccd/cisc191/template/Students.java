package edu.sdccd.cisc191.template;

// Abstract class student source for creating object
public abstract class Students {
    // Private fields for students
    private String id;
    private String lastName;
    private String firstName;
    private double gpa;
//Constructor that takes 4 fields
    public Students(int id, String lastName, String firstName, double gpa) {
        this.id = String.valueOf(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;

    }

    //Abstract method that uses abstract keyword to make sure each class contains method
    public abstract String sport();
    // Get ID from field returns private id
    public String getId() {
        return id;
    }
// Sets ID from field into private id variable
    public void setId(String id) {
        this.id = id;
    }
    // Get firstname and returns firstname
    public String getFirstName() {
        return firstName;
    }
    // Sets firstname from field into private firstname
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // Get lastName and returns private lastName
    public String getLastName() {
        return lastName;
    }
    // Sets lastName from field into private lastname
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // gets gpa and returns private
    public double getGpa() {
        return gpa;
    }
    // Sets gpa from field into private gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
