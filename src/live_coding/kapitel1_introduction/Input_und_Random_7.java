package live_coding.kapitel1_introduction;

import java.util.Random;
import java.util.Scanner;

public class Input_und_Random_7 {
    public static void main(String[] args) {

        /*
//         String username = "Mohammad";
//         System.out.println(username);

        System.out.println("Hi");

        Scanner myInput = new Scanner(System.in); // objekt erstellen. Das ma he ich nur einmal

        System.out.println("Gib deinen Namen ein:");
        String myInputName = myInput.nextLine(); // nimm input von user

        System.out.println("Gib dein Alter ein: ");
        int myInputAlter = myInput.nextInt(); // nimm input von user

        System.out.println("---------------");
        System.out.println("Dein Name ist: " + myInputName);
        System.out.println("Dein Alter ist: " + myInputAlter);

        System.out.println("Bye");

        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

        int counter = 0;
        int gerateneZahl;

        while(counter < 5){
            gerateneZahl = myInput.nextInt();
            System.out.println(counter + "). die geraten Zahl ist: " + gerateneZahl);
            counter++;
        }
        */

        System.out.println("----------------------------------------");
        System.out.println("------ Random Numbers kommt unten-------");
        System.out.println("----------------------------------------");

        // Scanner myInput = new Scanner(System.in); // objekt erstellen. Das ma he ich nur einmal
        // String myInputName = myInput.nextLine(); // nimm input von user

        Random myRandom = new Random(); // objekt erstellen. Das ma he ich nur einmal

        boolean myRandomBoolean = myRandom.nextBoolean();

        int myRandomNumber1 = myRandom.nextInt(); // random int zwischen -2^32-1 und 2^32-1
        int myRandomNumber2 = myRandom.nextInt(10); // zwischen 0 und 10
        int myRandomNumber3 = myRandom.nextInt(5, 10); // zwischen 5 und 10

        System.out.println(myRandomNumber3);

    }
}
