package LabExercise10;

public class Course {

    private final String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents < students.length) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            String[] newStudents = new String[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents;
            students[numberOfStudents] = student;
            numberOfStudents++;
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                students[i] = null;
                numberOfStudents--;
                for (int j = i; j < numberOfStudents; j++) {
                    students[j] = students[j + 1];
                }
                break;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }

    public static void main(String[] args) {
        Course course = new Course("Java");
        course.addStudent("Mike");
        course.addStudent("John");
        course.addStudent("Mary");
        course.dropStudent("John");
        String[] students = course.getStudents();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }
}
