package basic2._1;
import java.util.List;
public class Course {
    String courseName;
    int maxStudents;
    List<Student> students;

    public Course(String courseName, int maxStudents, List<Student> students) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.students = students;
    }

    public double getAverageAge() {
        int sum = 0;
        for (Student student : students) {
            sum += student.age;
        }
        return (double) sum / students.size();
    }
}
