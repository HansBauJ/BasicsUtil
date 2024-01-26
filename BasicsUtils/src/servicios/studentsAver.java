package servicios;

import java.lang.String;
import java.util.Scanner;

public class studentsAver {
    static Scanner scanner = new Scanner(System.in);
    static String name = " ";
    static String grade = " ";
    static int numSing = 0;
    static String signName = " ";
    static  int score = 0;
    public static void studAv(){
        System.out.println("Please enter your full name: \n");
        name = scanner.nextLine();
        System.out.println("Please enter your Grade: \n");
        grade = scanner.nextLine();
        System.out.println("Please enter the number of signatures to enroll: \n");
        numSing = scanner.nextInt();

        for (; numSing > 0; numSing--) {
            System.out.println("Please enter the Name of the signature: ");
            signName = scanner.nextLine(); //I'm Stuck here, at 1:02 AM
            System.out.println("Please enter the score for " + signName + " ");
            score = scanner.nextInt();
        }
    }
}
