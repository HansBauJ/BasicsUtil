package servicios;

import java.lang.String;
import java.util.Scanner;
import java.util.Base64;

public class encoder {
    static Scanner scanner = new Scanner(System.in);
    static String str = " ";
    static String str2 = " ";
    static int val = 0;
    public static void encoderM() {

        System.out.println("1.-Encode a String to Base64.\n2.-Decode a Base64 to String\n");
        val = scanner.nextInt();
        switch (val) {
            case 1:
                enBase64();
                break;
            case 2:
                deBase64();
                break;
            default:
                System.out.println("Icorrect Selection");
                encoder.encoderM();
        }
    }
    private static void enBase64(){
        System.out.println("please enter the word to be decode: ");
        str = scanner.nextLine(); //i´m having issue with this, when i created just this alone is working fine, but after I create the decode is not working, is just skipping the and gets out
        String nStr = str.trim().replace(" ", "|space-");
        String encodeStr = Base64.getEncoder().encodeToString(nStr.getBytes());
        System.out.println(encodeStr);
    }
    private static void deBase64(){
        System.out.println("Please enter the Base64 to be Decode: ");
        str2 = scanner.nextLine();
        byte[] decodeStr = Base64.getDecoder().decode(str2); // I create a byte array to hold the string of the encode original string
        String strDecod = new String(decodeStr);
        System.out.println(strDecod);
    }
}