package servicios;
import java.util.List;
import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;

public class studentsAver {
    static Scanner scanner = new Scanner(System.in);
    static String name = " ";
    static String grade = " ";
    static int numSing = 0;
    static String signName = " ";
    static  double score = 0.0;
    static List<String> data = new ArrayList<>();
    static List<String> scoreVal = new ArrayList<>();
    public static void studAv(){
        System.out.println("Please enter your full name: \n");
        name = scanner.nextLine();
        System.out.println("Please enter your Grade: \n");
        grade = scanner.nextLine();
        System.out.println("Please enter the number of signatures to enroll: \n");
        String numSing = scanner.nextLine();


        for (int numTemp = Integer.valueOf(numSing); numTemp > 0; numTemp--) {
            System.out.println("Please enter the Name of the signature: ");
            signName = scanner.nextLine();
            System.out.println("Please enter the score for " + signName + " ");
            String score = scanner.nextLine();
            doct(signName, score);
        }
    }
    private static void doct( String sing, List<String> valu){
            data.add(sing);
            int temp1 = valu.size();
            scoreVal.add();
    }
    private static void evalu(){
        int i = scoreVal.size();
        for(; i > 0; i--){
             int sumatory = scoreVal.get(i);
        }
    }
}
