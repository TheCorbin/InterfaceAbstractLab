package Lab1Work;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{
    
    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites){
        super(courseName,courseNumber, credits, prerequisites);
    }
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }    
    
}
