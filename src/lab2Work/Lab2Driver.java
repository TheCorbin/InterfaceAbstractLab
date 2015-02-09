/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2Work;

/**
 *
 * @author ryancorbin
 */
public class Lab2Driver {
    
    public static void main(String[] args) {
        IntroJavaCourse IntroJava = new IntroJavaCourse("IntroJava", "1135", 3.0, "IntroToProgramming");
        System.out.println(IntroJava.getCourseName());
        System.out.println(IntroJava.getPrerequisites());
    }
    
}
