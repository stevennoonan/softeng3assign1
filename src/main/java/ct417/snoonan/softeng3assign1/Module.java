/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417.snoonan.softeng3assign1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Noonan
 */
public class Module {
    private String modName;
    private String modId;
    private final List<Student> studentsList;
    private final List<CourseProgramme> coursesList;
    
    public Module(String name, String id){
        this.modName = name;
        this.modId = id;
        studentsList = new ArrayList<>();
        coursesList = new ArrayList<>();
    }
    
    public void addStudent(Student student){
        if(!studentsList.contains(student)){
            studentsList.add(student);
        }
    }
    public void addCourse(CourseProgramme course){
        if(!coursesList.contains(course)){
            coursesList.add(course);
        }
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId;
    }
    
    public List<Student> getStudents(){
        return studentsList;
    }
    
    public List getCourses(){
        return coursesList;
    }
}
