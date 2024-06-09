package live_coding.kapitel3_arrays;

import java.util.Scanner;

public class Arrays_2_wiederholung {
    public static void main(String[] args) {
        // Arrays
        // 1. methode: Der Inhalt ist erstmal NICHT bekannt
        // a) deklarieren, b) allokation, c) initialisieren
        int x;
        x = 6;

        double[] notenArr; // a) deklarieren
        notenArr = new double[3]; // b) allokation

        System.out.println(notenArr[0]);
        System.out.println(notenArr[1]);
        System.out.println(notenArr[2]);

        notenArr[0] = 1.0;// c) initialisieren
        notenArr[1] = 2.0;// c) initialisieren
        notenArr[2] = 2.7;// c) initialisieren

        System.out.println(notenArr[0]);
        System.out.println(notenArr[1]);
        System.out.println(notenArr[2]);

        // a) deklarieren und allokoation gleichzeitig in einer Zeile, b) initialisieren
        String[] namenArr = new String[3]; // a deklarierenn & b) allokation
        namenArr[0] = "Jean";// c) initialisieren
        namenArr[1] = "Alaa";// c) initialisieren
        namenArr[2] = "Lamiaa";// c) initialisieren

        // 2. Der Inhalt ist direkt bei der Erstsellung des Arrays bekannt
        // boolean[] statusArr1 = new boolean[3]{true, true, true}; // das gibt ein error aus
        boolean[] statusArr2 = new boolean[]{true, true, true}; // a), b) und c)
        boolean[] statusArr3 = {true, true, true}; // a), b) und c) (new boolean[] ist optional)
    }
}
