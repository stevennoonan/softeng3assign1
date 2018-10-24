/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417.snoonan.softengassign3;

import ct417.snoonan.softeng3assign1.CourseProgramme;
import ct417.snoonan.softeng3assign1.Module;
import ct417.snoonan.softeng3assign1.Student;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Steven
 */
public class ModuleTest {
    private final Module module1 = new Module("Software Engineering III", "CT417");
    private final Student student1 = new Student("john", new LocalDate(1990, 2, 10), 10001);
    private final CourseProgramme cs = new CourseProgramme("CompSci", new LocalDate(2015,9,1), new LocalDate(2019,5,1));
    
    @Test
    public void testGetandAddStudent(){
        module1.addStudent(student1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
       
        Assert.assertEquals(students, module1.getStudents());
    }
    
    @Test
    public void testStudentAlreadyInModule(){
        module1.addStudent(student1);
        module1.addStudent(student1);
        
        Assert.assertEquals(1, module1.getStudents().size());
        
    }
    
    @Test
    public void testGetandAddCourse(){
        module1.addCourse(cs);
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(cs);
        
        Assert.assertEquals(courses, module1.getCourses());
    }
    
    @Test
    public void testCourseAlreadyInModule(){
        module1.addCourse(cs);
        module1.addCourse(cs);
        
        Assert.assertEquals(1, module1.getCourses().size());
    }
    
    @Test
    public void testGetName(){
        Assert.assertEquals("Software Engineering III", module1.getModName());
    }
    
    @Test
    public void testGetModId(){
        Assert.assertEquals("CT417", module1.getModId());
    }

}

