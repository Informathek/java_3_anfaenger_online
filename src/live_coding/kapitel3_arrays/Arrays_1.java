package live_coding.kapitel3_arrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays_1 {
    public static void main(String[] args) {
        // Motivation
        int zahl; // 0
        String name; // null

        int zahl1 = 5;
        int zahl2 = 7;

        String name1 = "Java";
        String name2 = "C++";

        int[] myArray1 = {1,7,0,3,5};
        String[] myArray2 = {"hi","   there  !", "java", "C++"};
//        ------------------------------------------------------
        int x; // 1. deklaration
        x = 500; // 2. initialisierung
        System.out.println(x);

        int y = 600;
        System.out.println(y);
        System.out.println("----");
//        ------------------------------------------------------
        String[] autoFarbenArr; // 1. deklaration
        autoFarbenArr = new String[3]; // 2. memory allokation

        System.out.println(autoFarbenArr[0]); // null
        System.out.println(autoFarbenArr[1]); // null
        System.out.println(autoFarbenArr[2]); // null

        autoFarbenArr[0] = "red"; // 3. initialisierung
        autoFarbenArr[1] = "green"; // 3. initialisierung
        autoFarbenArr[2] = "blue"; // 3. initialisierung

        System.out.println(autoFarbenArr[0]); // red
        System.out.println(autoFarbenArr[1]); // green
        System.out.println(autoFarbenArr[2]); // blue


        System.out.println("********Eine kompaktere Schreibweisen******");
//        String[] namenArr; // 1. deklaration
//        namenArr = new String[3]; // 2. allokation
        String[] namenArr = new String[10]; //  1. deklaration & 2. allokation
//        System.out.println(namenArr[0]); // null
//        System.out.println(namenArr[1]); // null
//        System.out.println(namenArr[2]); // null
//        ...
//        System.out.println(namenArr[99]); // null

//        english | deutsch
//        zero    | Null
//        null    | Nichts

        // for schleige zum printen des inhalts des arrays
        for (int i = 0; i < 10; i++){
            // System.out.println(counter); // 0, 1, 2, ..., 99
            System.out.println(namenArr[i]);
        }

        // for schleife zum initialisieren des arrays (werte zuweisen)
        // die erste 5 elemente sind "rot", die anderen 5 elemente sind "blau".
        for (int i = 0; i < 10; i++){
            if (i < 5){
                namenArr[i] = "red";
            }
            else {
                namenArr[i] = "blue";
            }

        }

        // for schleige zum printen des inhalts des arrays
        for (int i = 0; i < 10; i++){
            // System.out.println(counter); // 0, 1, 2, ..., 99
            System.out.println(namenArr[i]);
        }

        System.out.println("_________Eine andere schreibweise (je nach Situation-also was bekannt ist)________");
        System.out.println("_________wir kennen den Inhalt des Arrays schon________");

        // man soll die groese also [5] nicht schreiben! das wird automatisch erkannt!!!
        // String[] teilnehmerArr1 = new String[5]{"jean", "sabaa", "lamiaa", "dima", "alaa"};
        String[] teilnehmerArr1 = new String[]{"jean", "sabaa", "lamiaa", "dima", "alaa"};

        // new String[] ist optional, wenn man die tatsecliche Werte angibt
        String[] teilnehmerArr2 = {"jean", "sabaa", "lamiaa", "dima", "alaa"};
        int[] teilnehmerArr3 = {1, 7, 8, 0, 55};

        for (int i = 0; i < 5; i++){
            System.out.println(teilnehmerArr1[i]);
        }

    }
}
