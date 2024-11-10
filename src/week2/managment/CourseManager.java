package week2.managment;

import java.util.List;

public class CourseManager {
    private List<Student> students;

    public CourseManager() {}

    public CourseManager(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void displayAllStudents(){
        int i = 0;
        while (i < this.students.size()) {
            System.out.println(this.students.get(i));
            i++;
        }

    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
