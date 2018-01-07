/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

class Employee extends Person {
    //Variable Declaration
    String office, dateOfEmployement;
    int officePhone;
    
    //Constructor to make sure user must enter employee's first and last name
    //uses inheritance for first and last name from Person class (because it is super class)
    public Employee(String f, String l) {
        super(f, l);
//        this.firstName = f;
//        this.lastName = l;

    }
    
    //Methods: Set of Setters and Getters for each Variable declarared 
    //For Office
    public void setOffice(String office) {
        this.office = office;
    }
    
    public String getOffice() {
        return office;
    }
    
    //For Date of Employement
    public void setDate(String dateOfEmployement) {
        this.dateOfEmployement = dateOfEmployement;
    }
    
    public String getDate() {
        return dateOfEmployement;
    }
    
    //For Office Phone Number
    public void setOfficePhone(int officePhone) {
        this.officePhone = officePhone;
    }
    
    public int getOfficePhone() {
        return officePhone;
    }
}
