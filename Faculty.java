/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

class Faculty extends Employee implements changeable {
    //assistant professor, associate professor, or professor
    String rank;
    
    //Constructor to make sure faculty's first and last along with rank is entered while using this class
    //uses inheritance for first and last name from employee class 
    public Faculty(String f, String l, String rank) {
        super(f, l);
        this.rank = rank;
    }
    
    //Setter and Getter method
    //For the Rank of Faculty
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public String getRank() {
        return rank;
    }
    
    //Method to get the current class name
    public String getClassName() {
        String className = this.getClass().getSimpleName();
        return className;
    }
    
    @Override
    public String toString(){
        return "Class Name: " + getClassName()  + "\t Name: " + getFirstName() + " " + getLastName() + "\t Rank: " + getRank() ;
    }

    @Override
    public String changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        return firstName + lastName;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}