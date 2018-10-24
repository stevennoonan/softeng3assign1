package ct417.snoonan.softeng3assign1;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
/**
 *
 * @author Steven
 */
public class CourseProgramme {
    private String courseName;
    private List<Module> modulesList;
    private List<Student> studentsList;
    private LocalDate startDate;
    private LocalDate endDate;
    
    public CourseProgramme(String name, List modList, List stuList, LocalDate sDate, LocalDate eDate){
        this.courseName = name;
        this.modulesList = modList;
        this.studentsList = stuList;
        this.startDate = sDate;
        this.endDate = eDate;
        this.modulesList = modList;
        this.studentsList = stuList;
    }
    
    public CourseProgramme(String name, LocalDate sDate, LocalDate eDate){
        this.courseName = name;
        this.startDate = sDate;
        this.endDate = eDate;
        this.modulesList = new ArrayList<>();
        this.studentsList = new ArrayList<>();
    }
    
    public void addModule(Module mod){
        if(!modulesList.contains(mod)){
            modulesList.add(mod);
        }
    }
    
    public void addStudent(Student stu){
        if(!studentsList.contains(stu)){
            studentsList.add(stu);
        }
    }

    public List<Module> getModulesList() {
        return modulesList;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
    
    @Override
    public String toString(){
      return this.getCourseName();
    }
}
