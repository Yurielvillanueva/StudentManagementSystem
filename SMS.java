import Package.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMS {
    private List<Student> students;

    public SMS() {
        students = new ArrayList<>();
    }

    public static void main(String[] args) {
        SMS sms = new SMS();
        Scanner scanner = new Scanner(System.in);

            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Update student");
            System.out.println("4. Display all students");
            System.out.println("5. Search student by name");
            System.out.println("6. Search student by ID");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student email: ");
                    String email = scanner.nextLine();
                    Student student = new Student(id, name, email);
                    sms.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    sms.deleteStudent(deleteId);
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("Enter new student name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new student email: ");
                    String updateEmail = scanner.nextLine();
                    sms.updateStudent(updateId, updateName, updateEmail);
                    break;
                case 4:
                    sms.displayAllStudents();
                    break;
                case 5:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    sms.searchStudentByName(searchName);
                    break;
                case 6:
                    System.out.print("Enter student ID to search: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    sms.searchStudentById(searchId);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void deleteStudent(int studentId) {
    }
    public void updateStudent(int studentId, String newName, String newEmail) {
    }
    public void displayAllStudents() {
    }
    public void searchStudentByName(String name) {
    }
    public void searchStudentById(int id) {
    }
}