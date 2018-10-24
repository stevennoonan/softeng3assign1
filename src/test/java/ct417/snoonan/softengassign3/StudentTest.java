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
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Steven
 */
public class StudentTest {
    private final Student student1 = new Student("john", new LocalDate(1990, 2, 10), 10001);
    
    @Test
    public void testUsername(){
        Assert.assertEquals(student1.getName() + student1.getAge(), student1.getUsername());
    }
    
    @Test
    public void testGetandAddModList(){
        ArrayList<Module> modList = new ArrayList<>();
        Module mod1 = new Module("Soft Eng", "CT417");
        Module mod2 = new Module("Systems Modelling", "CT561");
        modList.add(mod1);
        modList.add(mod2);
        student1.setModulesList(modList);
        
        Assert.assertEquals(modList, student1.getModulesList());
    }
    
    @Test
    public void testGetandAddCourseList(){
        ArrayList<CourseProgramme> courseList = new ArrayList<>();
        CourseProgramme csIT = new CourseProgramme("CompSci", new LocalDate(2015,9,1), new LocalDate(2019,5,1));
        courseList.add(csIT);
        student1.setCoursesList(courseList);
        
        Assert.assertEquals(courseList, student1.getCoursesList());
    }
    
    @Test
    public void testGetName(){
        Assert.assertEquals("john", student1.getName());
    }
    
    @Test
    public void testGetId(){
        Assert.assertEquals(10001, student1.getId());
    }
    
    @Test
    public void testGetAge(){
        Assert.assertEquals(28, student1.getAge());
    }
    
    @Test
    public void testGetDateOfBirth(){
        Assert.assertEquals(new LocalDate(1990, 2, 10), student1.getDateOfBirth());
    }
}
