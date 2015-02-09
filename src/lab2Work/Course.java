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
public interface Course {
    
    public void setCourseName(String courseName);
    
    public void setCourseNumber(String courseNumber);
    
    public void setCredits(double credits);
    
    public double getCredits();
     
    public String getCourseNumber();
    
    public String getCourseName(); 
    
}
