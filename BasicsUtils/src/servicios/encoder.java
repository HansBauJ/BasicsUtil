package servicios;

import java.lang.String;
import java.util.Scanner;
import java.util.Base64;

public class encoder {
    static Scanner scanner = new Scanner(System.in);

    static int val = 0;
    public static void encoderM() {

        System.out.println("1.-Encode a String to Base64.\n2.-Decode a Base64 to String\n");
        String val = scanner.nextLine();
        switch (val) {
            case "1":
                System.out.println("please enter the word to be decode: ");
                String word = scanner.nextLine();
                enBase64(word);
                break;
            case "2":
                System.out.println("Please enter the Base64 to decode to String: ");
                String code = scanner.nextLine();
                deBase64(code);
                break;
            default:
                System.out.println("Icorrect Selection");
                encoder.encoderM();
        }
    }
    private static void enBase64(String word){
        System.out.println(word);
        String nStr = word.trim().replace(" ", "|space-");
        String encodeStr = Base64.getEncoder().encodeToString(nStr.getBytes());
        System.out.println(encodeStr);
    }
    private static void deBase64(String code){
        byte[] decodeStr = Base64.getDecoder().decode(code); // I create a byte array to hold the string of the encode original string
        String strDecod = new String(decodeStr);
        String finalStr = strDecod.trim().replace("|space-", " ");
        System.out.println(finalStr);
    }
}