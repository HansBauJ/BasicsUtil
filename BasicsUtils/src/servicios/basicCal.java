package servicios;


import java.util.Scanner;

public class basicCal {
    static Scanner scanner = new Scanner(System.in);
    static int a = 0;
    static int b = 0;
    public static void basicCal() {
        System.out.println("Please Chose an option\n1.- Sum ( a + b )\n2.- Subtract ( a - b)\n3.- Multiply ( a x b )\n4.- Divide ( a / b )\n");
        int val = scanner.nextInt();
        switch (val) {
            case 1:
                System.out.println("Please enter the value for a:\n");
                a=scanner.nextInt();
                System.out.println("Please enter the value for b:\n");
                b=scanner.nextInt();
                sum(a,b);//we pass the two values as parameter
                break;
            case 2:
                System.out.println("Please enter the value for a:\n");
                a=scanner.nextInt();
                System.out.println("Please enter the value for b:\n");
                b=scanner.nextInt();
                substract(a,b);
                break;
            case 3:
                System.out.println("Please enter the value for a:\n");
                a=scanner.nextInt();
                System.out.println("Please enter the value for b:\n");
                b=scanner.nextInt();
                multiply(a,b);
                break;
            case 4:
                System.out.println("Please enter the value for a ( not 0 ):\n");
                a=scanner.nextInt();
                System.out.println("Please enter the value for b ( not 0 ):\n");
                b=scanner.nextInt();
                divide(a,b);
                break;
            default:
                System.out.println("Wrong selection, please enter a valid number.");
                select.selectd();
        }
    }

    private static void divide(int a, int b) {
        double d = a;
        double e = b;
        if (a == 0 || b == 0){

            System.out.println("Please enter a different number than 0");
            select.selectd();
        }else{
            double c = (d / e);
            System.out.format("%.2f", c);
            System.exit(0);
        }
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
        System.exit(0);
    }

    private static void substract(int a, int b) {
        System.out.println(a - b);
        System.exit(0);
    }

    private static void sum(int a, int b){
        System.out.println(a + b);
        System.exit(0);
    }
}

