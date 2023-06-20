package bt15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class StudentManagement {
    private List<Student> studentList;

    public StudentManagement() {
        studentList = new ArrayList<>();
    }

    public void showAll() {
        for (Student student : studentList) {
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Name: " + student.getName());
            System.out.println("Average Score: " + student.getAverageScore());
            System.out.println();
        }
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(int studentId) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == studentId) {
                studentList.remove(i);
                return;
            }
        }
    }

    public Student findStudentById(int studentId) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        System.out.println("Không tìm thấy sinh viên");
        return null;
    }

    public double getAverageScore() {
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getAverageScore();
        }
        return totalScore / studentList.size();
    }

    public void sortByScore() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getAverageScore(), s2.getAverageScore());
            }
        });
    }
}
