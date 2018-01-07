/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

abstract class Person {
    //Variable Declaration
    String firstName, lastName, email;
    int phoneNumber;
    
    //Empty constructor, commented out to make sure user does add minimum required values
//    Person() {
//        
//    }
    
    //Constructor to make sure all entries must have first name and last name
    Person(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    //Setters and Getters
    //For First Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    //For Last Name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    //For Email
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    //For Phone Number
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
}
