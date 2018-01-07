/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

class Student extends Person implements changeable{
    //Each student has a class status (freshman, sophomore, junior, or senior and make these constant).
    final static int FRESHMAN = 1;
    final static int SOPHOMORE = 2; 
    final static int JUNIOR = 3;
    final static int SENIOR = 4;
    int status = Student.FRESHMAN;
   
    public Student(String f, String l, int status) {
        super(f, l);
        this.status = status;
    }
    //Setter and Getter method
    //For the Student Class Status
    public void setStatus(int status) {
        this.status = status;
    }
    
    public int getStatus() {
        return status;
    }
    
    //Method to get the current class name
    public String getClassName() {
        String className = this.getClass().getSimpleName();
        return className;
    }
    
    @Override
    public String toString(){
        return "Class Name: " + getClassName() + "\t Name: " + getFirstName() + " " + getLastName() + "\t Status: " + getStatus() ;
    }

    @Override
    public String changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        return firstName + lastName;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
