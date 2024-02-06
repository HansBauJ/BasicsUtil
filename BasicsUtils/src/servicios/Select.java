package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToIntFunction;


public class Select implements studentsAver, basicCal {
    int a = 0;
    int b = 0;
    List<Double> scoreVal = new ArrayList<>();
    static int val = 0;

    private void selectd() { //Here i´m doing the selection of the 3 main option validating the value
        Scanner scanner = new Scanner(System.in);
        while(val != -1) { //is not fancy, can be better.
            try{
                val = scanner.nextInt();
                if (val != ((int) val)){ //here i´m validating tha the value that we enter is a Integer and is not something different
                    System.out.println("please enter a number: ");
                }else{
                    System.out.println("the value that you choose is :" + val);
                    break;
                }
            }catch (Exception e){
                System.out.println("please enter a number: ");
                selectd(); //is calling itself in order to keep the possibility to select an option
            }
        }

        switch(val){
            case 1:
                basicCal();
                break;
            case 2 :
                encoder.encoderM();
                break;
            case 3 :
                studAv();
                break;
            default:
                System.out.println("Wrong selection, the selection is outside of the scope, please enter a valid number: ");
        }
    }

    @Override
    public void studAv() {
        double score = 0.0;
        String signName = " ";
        String name = " ";
        String grade = " ";
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
            score = scanner.nextInt();
            doct(signName, score);
        }
    }
    @Override
    public void doct(String sing, double valu){
        List<String> data = new ArrayList<>();
        data.add(sing);
        double temp1 = valu;
        scoreVal.add(temp1);
    }

    @Override
    public void evalu(){
        int i = scoreVal.size();
        for(; i > 0; i--){
            ToIntFunction sumatory = (ToIntFunction) value -> 0;
        }
    }
    @Override
    public void basicCal(){
        System.out.println("Please Chose an option\n1.- Sum ( a + b )\n2.- Subtract ( a - b)\n3.- Multiply ( a x b )\n4.- Divide ( a / b )\n");
        int val = scanner.nextInt();
        System.out.println("Please enter the value for a:\n");
        a=scanner.nextInt();
        System.out.println("Please enter the value for b:\n");
        b=scanner.nextInt();
        switch (val) {
            case 1:
                add(a,b);//we pass the two values as parameter
                break;
            case 2:
                substract(a,b);
                break;
            case 3:
                multiply(a,b);
                break;
            case 4:
                divide(a,b);
                break;
            default:
                System.out.println("Wrong selection, please enter a valid number.");
                basicCal();
        }
    }
    @Override
    public void divide(int a, int b){
        double d = a;
        double e = b;
        if (a == 0 || b == 0){

            System.out.println("Please enter a different number than 0");
            selectd();
        }else{
            double c = (d / e);
            System.out.format("%.2f", c);
            System.exit(0);
        }
    }
    @Override
    public void multiply(int a, int b){
        System.out.println(a * b);
        System.exit(0);
    }
    @Override
    public void substract(int a, int b){
        System.out.println(a - b);
        System.exit(0);
    }
    @Override
    public void add(int a, int b){
        System.out.println(a + b);
        System.exit(0);
    }

}
