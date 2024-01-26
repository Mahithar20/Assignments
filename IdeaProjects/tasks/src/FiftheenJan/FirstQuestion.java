package FiftheenJan;

import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Bio Data
        String name =  " Mahitha Kambalapally";
        int age = 25;
        char gender = 'F';
        double gpa = 4.0;
        boolean isStudent = true ;

        //print the biodata using primitive datatypes
        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("gender " + gender);
        System.out.println("GPA "+ gpa);
        System.out.println("Is a Student "+ isStudent);

        // Creating an array to store student names
        String[] studentNames = new String[10];
        // Assigning names to the array
        studentNames[0] = "Alice Johnson";
        studentNames[1] = "Bob Smith";
        studentNames[2] = "Charlie Brown";
        studentNames[3] = "David Lee";
        studentNames[4] = "Emma White";
        studentNames[5] = "Frank Miller";
        studentNames[6] = "Grace Davis";
        studentNames[7] = "Harry Wilson";
        studentNames[8] = "Ivy Thomas";
        studentNames[9] = "Jack Robinson";

        // Printing the first and last names of the students
        for(int i = 0 ; i< studentNames.length ; i++) {
            String[] names = studentNames[i].split(" ");
            String firstName = names[0];
            String lastName = names[names.length - 1];
            System.out.println("given name is "+ studentNames[i]);
            System.out.println("\nFirst Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        }

    }

}



