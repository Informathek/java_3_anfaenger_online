package live_coding.kapitel2_flusskontrolle;

import java.util.Random;
import java.util.Scanner;

public class While_scanner_random_3 {
    public static void main(String[] args) {

        Scanner inputZahl = new Scanner(System.in); // input
        Random myRandom = new Random(); // random number

        int randomNumber = myRandom.nextInt(11); // zwischen 0 und 11 (exclusively), also bis 10.
//        System.out.println("Random number von Alaa: " + randomNumber);

        int zaehler = 0;
//        while(true){ // unendlich schleife.
        while(zaehler < 5){

            System.out.print("Das ist Versuch nr. " + zaehler + " Please guess a number between 0 and 10: ");

            int userGuess = inputZahl.nextInt(); // Lamiaa
//            System.out.println(zaehler + "). Your guess was : " + userGuess);

            if (userGuess == randomNumber){
                System.out.println("Yeeey, Du hast die richtige Zahl erraten und somit gewonnen !!!!");
                break;
            }

            System.out.println("Du hast die falsche nummer im Kopf. Versuche es noch mal..");

            zaehler++;
        }

    }
}
