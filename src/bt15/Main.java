package bt15;

public class Main {
    public static void main(String[] args) {

        StudentManagement studentManagement = new StudentManagement();

        Student student1 = new Student();
        student1.setStudentId(1);
        student1.setName("Nguyen Van A");
        student1.setAverageScore(8.5);
        studentManagement.addStudent(student1);

        Student student2 = new Student();
        student2.setStudentId(2);
        student2.setName("Tran Thi B");
        student2.setAverageScore(7.9);
        studentManagement.addStudent(student2);

        Student student3 = new Student();
        student3.setStudentId(3);
        student3.setName("Le Van C");
        student3.setAverageScore(9.2);
        studentManagement.addStudent(student3);

        // Hiển thị danh sách sinh viên
        System.out.println("Danh sách sinh viên:");
        studentManagement.showAll();

        // Xóa sinh viên
        int studentIdToRemove = 2;
        studentManagement.removeStudent(studentIdToRemove);
        System.out.println("Sau khi xóa sinh viên có mã số " + studentIdToRemove + ":");
        studentManagement.showAll();

        // Tìm sinh viên
        int studentIdToFind = 3;
        Student foundStudent = studentManagement.findStudentById(studentIdToFind);
        if (foundStudent != null) {
            System.out.println("Sinh viên có mã số " + studentIdToFind + " được tìm thấy:");
            System.out.println("Name: " + foundStudent.getName());
            System.out.println("Average Score: " + foundStudent.getAverageScore());
        }

        // Tính điểm trung bình
        double averageScore = studentManagement.getAverageScore();
        System.out.println("Điểm trung bình của tất cả sinh viên: " + averageScore);

        // Sắp xếp theo điểm
        studentManagement.sortByScore();
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
        studentManagement.showAll();
    }
}
