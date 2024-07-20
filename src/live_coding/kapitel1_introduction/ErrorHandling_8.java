package live_coding.kapitel1_introduction;

// Syntax : Grammatik
// Symantisch : Kontext, Inhalt

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling_8 {
    public static void main(String[] args) {
        System.out.println("Start");



        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Achtung! Falsche Eingabe. Bitte nur int eingeben!!!!");
        }
        finally {
            System.out.println("Ende A");
        }




        int x = 10;
        int y = 0;

        try{
            int ergebis = x / y;
            System.out.println(ergebis);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Achtung!!! Du hast durch null dividiert!!!!!!");
        }
        finally {
            System.out.println("Ende B");
        }


        System.out.println("Ende 2");
    }
}
