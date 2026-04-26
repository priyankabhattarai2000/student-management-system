public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        service.addStudent(new Student(1, "Priyanka", 26));
        service.addStudent(new Student(2, "John", 22));

        service.displayStudents();
    }
}