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
public class MultiDimArrayDemo {
    public void DimArr(){
        String[][] names= {
            {"Dr. ","Tuan ","Puan "},
            {"Azman","Syafiq","Shuhada"}
                
    };
    System.out.println(names[0][2] + names[1][2]);
    System.out.println(names[0][0] + names[1][1]);
    System.out.println(names[0][1] + names[1][0]);
    }
}

