package servicios;

import java.util.Scanner;


public class select {
    static int val = 0;
    public static void selectd(){ //Here i´m doing the selection of the 3 main option validating the value
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
                select.selectd(); //is calling itself in order to keep the possibility to select an option
            }
        }

        switch(val){
            case 1:
                basicCal.basicCal();
                break;
            case 2 :
                encoder.encoderM();
                break;
            case 3 :
                studentsAver.studAv();
                break;
            default:
                System.out.println("Wrong selection, the selection is outside of the scope, please enter a valid number: ");
        }
    }
}
