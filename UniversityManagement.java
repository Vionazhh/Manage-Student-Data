package ManageStudentData;
import java.util.ArrayList;
/**
 *
 * @author Viona
 */
public class UniversityManagement {
    ArrayList<Student> students = new ArrayList<>();

    void registerStudent(Student student) {
        students.add(student);
        student.register();
    }

    void displayStudentsInfo() {
        for (Student student : students) {
            student.displayInfo();
        }
    }
}

