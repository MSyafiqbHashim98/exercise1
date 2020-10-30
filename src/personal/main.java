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



    public class main {
    public static void main(String[] args){
        Personal p = new Personal();
        cgpa q = new cgpa();
        exam e = new exam();
        WorkExperience r = new WorkExperience();
        skills s = new skills();
        MultiDimArrayDemo t= new MultiDimArrayDemo();
        
        System.out.println("My name is "+p.name);
        p.printName();
        q.printCGPA();
        e.printExam();
        q.printGPA();
        System.out.println("Final CGPA "+q.calculateCGPA());
        r.printWorkExperience();
        s.printSkills();
        t.DimArr();
      
   }
    
}
