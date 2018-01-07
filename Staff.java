/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

class Staff extends Employee {
    String title;
    
    public Staff(String f, String l, String title) {
        super(f, l);
        this.title = title;
    }
    
    //Setter and Getter method
    //For the Staff Title
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    //Method to get the current class name
    public String getClassName() {
        String className = this.getClass().getSimpleName();
        return className;
    }
    
    @Override
    public String toString(){
        return "Class Name: " + getClassName() + "\t Name: " + getFirstName() + " " + getLastName() + "\t Title: " + getTitle() ;
    }
}