/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
public class cgpa {
    double cgpa1=3.56;
    double gpa[]={3.56,3.33,3.32,3.40};
    double sum=0;
    double finalcgpa=0;
    
  
    
public void printCGPA(){
    System.out.println("CGPA : "+cgpa1);
}
public void printGPA(){
    
    System.out.println("Sem1: "+gpa[0]);
    System.out.println("Sem2: "+gpa[1]);
    System.out.println("Sem3: "+gpa[2]);
    System.out.println("Sem4: "+gpa[3]);
}

public double calculateCGPA(){
    for (int i=0; i<gpa.length;i++){
    sum+=gpa[i];  
}
    finalcgpa = sum/gpa.length;
return finalcgpa;
}
}


