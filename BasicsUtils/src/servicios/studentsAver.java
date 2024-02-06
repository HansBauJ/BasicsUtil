package servicios;

import java.lang.String;
import java.util.Scanner;

public interface studentsAver {
    Scanner scanner = new Scanner(System.in);
    static int numSing = 0;



    public void studAv();
    public void doct( String sing, double valu);
    public void evalu();
}

