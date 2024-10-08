import Package.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMS {
    private List<Student> students; // Use a list to manage multiple students

    // Constructor to initialize the students list
    public SMS() {
        students = new ArrayList<>();
    }

    public static void main(String[] args) {
        SMS sms = new SMS();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Update student");
            System.out.println("4. Display all students");
            System.out.println("5. Search student by name");
            System.out.println("6. Search student by ID");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student email: ");
                    String email = scanner.next();
                    Student student = new Student(id, name, email); // Assuming the Student class has a constructor that takes these parameters
                    sms.addStudent(student);
                    break;
                case 2:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    sms.deleteStudent(deleteId);
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new student name: ");
                    String updateName = scanner.next();
                    System.out.print("Enter new student email: ");
                    String updateEmail = scanner.next();
                    sms.updateStudent(updateId, updateName, updateEmail);
                    break;
                case 4:
                    sms.displayAllStudents();
                    break;
                case 5:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.next();
                    sms.searchStudentByName(searchName);
                    break;
                case 6:
                    System.out.print("Enter student ID to search: ");
                    int searchId = scanner.nextInt();
                    sms.searchStudentById(searchId);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Sample implementation of methods you need to define
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void deleteStudent(int studentId) {
        // Implement the delete logic
        // Loop through the list and remove the student with the matching ID
    }

    public void updateStudent(int studentId, String newName, String newEmail) {
        // Implement the update logic
        // Find the student by ID and update their details
    }

    public void displayAllStudents() {
        // Implement the logic to display all students
        // Loop through the students list and print details
    }

    public void searchStudentByName(String name) {
        // Implement the search logic by name
    }

    public void searchStudentById(int id) {
        // Implement the search logic by ID
    }
}
