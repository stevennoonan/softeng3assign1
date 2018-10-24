package ct417.snoonan.softeng3assign1;
import org.joda.time.LocalDate;
import java.util.List;
import org.joda.time.Years;
/**
 *
 * @author Steven
 */
public class Student {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int id;
    private final String username;
    private List coursesList;
    private List modulesList;
    
    
    public Student(String name, LocalDate dateOfBirth, int id){
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.age = Years.yearsBetween( dateOfBirth, LocalDate.now()).getYears();
        this.username = name + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return name + age;
    }

    public List getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List coursesList) {
        this.coursesList = coursesList;
    }

    public List getModulesList() {
        return modulesList;
    }

    public void setModulesList(List modulesList) {
        this.modulesList = modulesList;
    }
}
