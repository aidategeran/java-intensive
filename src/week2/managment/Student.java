package week2.managment;

import week2.school.Person;

import java.util.List;

public class Student extends Person {

      private int studentID;
      private List<String> enrolledCourses;
      private double tuition;


      public Student(String name, int age, int studentID) {
          super(name, age);
          this.studentID = studentID;
      }

    public void enrollCourses(List<String> course){
        this.enrolledCourses = course;

    }

    public void enrollCourses(String course){
          this.enrolledCourses.add(course);
    }

      public int getStudentID() {
        return studentID;
     }

      public void setStudentID(int studentID) {
        this.studentID = studentID;
     }

      public double getTuition() {
        return tuition;
     }

    public void setTuition(double tuition) {
        this.tuition = enrolledCourses.size() * tuition;
     }


    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
