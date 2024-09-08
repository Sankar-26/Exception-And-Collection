import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4 {


    static HashMap<String, Double> studentDetail = new HashMap<>();

    //Method to add student
    public static void addStudent(String name, double grade) {
        studentDetail.put(name, grade);
        System.out.println("Student detail is added.");
    }

    //Method to remove a student
    public static void removeStudent(String name) {
        if (studentDetail.containsKey(name)) {
            studentDetail.remove(name);
            System.out.println("Student details is removed.");
        } else {
            System.out.println("Invalid Name");
        }
    }

    //Method to display student
    public static void displayStudent() {

        System.out.println('\n' + "Displaying the Student Details");
        System.out.println(studentDetail);
    }


    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int x = 0;

        //Using do while to iterate
        do {
            System.out.println('\n' + "Enter from the below Input");
            System.out.println("1. Add a new student" + '\n' +
                    "2. Remove a Student" + '\n' +
                    "3. Display details of all students" + '\n' +
                    "4. Exit");
            System.out.print("Enter the input: ");
            x = obj.nextInt();
            System.out.println();

            switch (x) {

                case 1:
                    System.out.print("Enter the Name: ");
                    String name = obj.next();
                    System.out.print("Enter the Grade: ");
                    double grade = obj.nextDouble();
                    //calling addStudent Method
                    addStudent(name, grade);
                    break;

                case 2:
                    System.out.print("Enter the Name to be removed: ");
                    String removeName = obj.next();
                    //Calling removeStudent Method
                    removeStudent(removeName);
                    break;

                case 3:
                    //Calling displayStudent Method
                    displayStudent();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("invalid Input");
                    break;

            }

        } while (x != 4);
    }
}
