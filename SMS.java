import Pacakge.Student;
import java.util.Scanner;
public class SMS {
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
                    Student student = new Student(id, name, email);
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
}