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
public class CourseProgrammeTest {
    private final Student student1 = new Student("john", new LocalDate(1990, 2, 10), 10001);
    private final Student student2 = new Student("jane", new LocalDate(1990, 2, 10), 10002);
    private final Module module1 = new Module("Software Engineering III", "CT417");
    private final Module module2 = new Module("Systems Modelling", "CT506");

    private final CourseProgramme cs = new CourseProgramme("CompSci", new LocalDate(2015,9,1), new LocalDate(2019,5,1));
    
    @Test
    public void testGetandAddStudents(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        
        cs.addStudent(student1);
        cs.addStudent(student2);
        
        Assert.assertEquals(students, cs.getStudentsList());
    }
    
    @Test
    public void testGetandAddModules(){
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module1);
        modules.add(module2);
        
        cs.addModule(module1);
        cs.addModule(module2);
        
        Assert.assertEquals(modules, cs.getModulesList());
    }
    
    @Test
    public void testModAlreadyInCourse(){
        cs.addModule(module1);
        cs.addModule(module1);
        
        Assert.assertEquals(1, cs.getModulesList().size());
    }
    
    @Test
    public void testStudentAlreadyInCourse(){
        cs.addStudent(student1);
        cs.addStudent(student1);
        
        Assert.assertEquals(1, cs.getStudentsList().size());
    }
    
    @Test
    public void testGetCourseName(){
        Assert.assertEquals("CompSci", cs.getCourseName());
    }
    
    @Test
    public void testGetStartDate(){
        Assert.assertEquals(new LocalDate(2015,9,1), cs.getStartDate());
    }
    
    @Test
    public void testGetEndDate(){
        Assert.assertEquals(new LocalDate(2019,5,1), cs.getEndDate());
    }
}

