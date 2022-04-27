package LabExercise11;

import java.util.ArrayList;

public class Course {

    private final String courseName;
    ArrayList<String> students = new ArrayList<String>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void dropStudent(String student) {
        students.remove(student);
    }


    public ArrayList<String> getStudents() {
        return students;
    }

    public void clear() {
        students.clear();
    }

    public static void main(String[] args) {
        Course course = new Course("Java");
        course.addStudent("Mike");
        course.addStudent("John");
        course.addStudent("Mary");
        course.dropStudent("John");
        String[] students = course.getStudents().toArray(new String[0]);
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}
