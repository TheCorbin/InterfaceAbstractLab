/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1Work;

import javax.swing.JOptionPane;
/**
 *
 * @author ryancorbin
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public Course(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits); 
        this.setPrerequisites(prerequisites);
    }
    
    private final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    private final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    private final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    private void setPrerequisites(String prerequisites) {
       if (prerequisites == null) {
            prerequisites = "";
       }

        this.prerequisites = prerequisites;
    }
    
    public final double getCredits() {
        return credits;
    }
     
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final String getPrerequisites() {
        return prerequisites;
    }
    
    public final String getCourseName() {
        return courseName;
    }

    
    
}
