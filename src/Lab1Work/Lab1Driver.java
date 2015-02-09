/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1Work;

/**
 *
 * @author ryancorbin
 */
public class Lab1Driver {
    
    public static void main(String[] args) {
        Course IntroJava = new IntroJavaCourse("IntroJava", "1135", 3.0, "IntroToProgramming");
        System.out.println(IntroJava.getCourseName());
        System.out.println(IntroJava.getPrerequisites());
    }
}
