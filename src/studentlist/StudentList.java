package studentlist;

import java.util.Scanner;

/**
 * This class is simple example for arrays of Object
 *
 * @author Paul Bonenfant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Student[] students = new Student[3];
        
        for (int i = 0; i < students.length; i++) {
        
            System.out.println("Enter the name");
            String name = input.nextLine();
            Student student = new Student(name);  
            
            students[i] = student;
        }
        
        String format = "Student's name is %s\n";
        
        for (Student student: students) {
           
            System.out.printf(format, student.getName());
        }
        
        int[] ints = {1, 3, 5, 7, 9};
        
        for (int myInt: ints) {
            System.out.println(myInt);
        }
        
    }

}

