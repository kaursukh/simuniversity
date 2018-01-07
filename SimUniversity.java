

package simuniversity;

import java.util.ArrayList;

public class SimUniversity {
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        
        //Student information
        Student s1 = new Student("Sukh", "Kaur", Student.SENIOR);
        Student s2 = new Student("Buck","Johnson",Student.JUNIOR);
        Student s3 = new Student("Steph","Smith",Student.SOPHOMORE);
        Student s4 = new Student("Amine","Johnson",Student.FRESHMAN);
        
        //Staff
        Staff st1 = new Staff("Elliot", "Winfred", "Engineer");
        Staff st2 = new Staff("Jason", "Tich", "Financial Aid Advisor");
        Staff st3 = new Staff("Mary", "Burns", "Director");
        
        //Faculty
        Faculty fac1 = new Faculty("Martin", "Yeh", "Assistant Professor, IST");
        Faculty fac2 = new Faculty("Andrew", "Landmesser", "Spanish Professor");
        Faculty fac3 = new Faculty("Sandra", "Lawrence", "Assistant Teaching Professor, IST");
                
        //Add student staff and faculty to the arraylist created
        list.add(s1);   list.add(s2);   list.add(s3);   list.add(s4);
        list.add(st1);  list.add(st2);  list.add(st3);
        list.add(fac1); list.add(fac2); list.add(fac3);
        
        //interate through the array list, print the values using toString() method
        for(int i = 0; i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    
    }    
}
