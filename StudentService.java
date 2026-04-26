import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayStudents() {
        for (Student s : students) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }
}
