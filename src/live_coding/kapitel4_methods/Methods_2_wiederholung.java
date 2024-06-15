package live_coding.kapitel4_methods;

public class Methods_2_wiederholung {
    static String planet = "Erde";

    // keine paremeters, kein Rueckgabewert (return)
    public static void devider(){
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
    }

    // mit parameters (argumente), kein Rueckgabewert (return)
    public static void printSomething(String name1, String name2) {
        int x;
        System.out.println("Hello " + name1);
        System.out.println("Hello " + name2);
    }

    // keine Parameters, mit return
    public static int postLeitZahl(){
        int plz = 12345;
        String studentenName = "Lamiaa";

        return plz;
    }

    // mit parameters, mit rueckgabe
    public static int berechneFlaeche(int laenge, int breite){
        int ergebnis = laenge * breite;
        return ergebnis;
    }

    public static int power(int basis, int exponent){
        int ergebnis = 1;
        for (int i = 0; i < exponent; i++){
            ergebnis *= basis;
        }
        return ergebnis;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        // display();
        // display();

        String studentName1 = "alaa";
        String studentName2 = "jean";

        printSomething(studentName1, studentName2);
        printSomething("dimah", "lamiaa");

        System.out.println("Goodbye World");

        devider();
        int ergebnisPLZ = postLeitZahl();

        System.out.println(ergebnisPLZ);

        devider();

        int ergebnis1 = Methods_2_wiederholung.berechneFlaeche(3, 4);
        int ergebnis2 = berechneFlaeche(2, 7);
        int ergebnis3 = berechneFlaeche(5, 4);

        System.out.println(ergebnis1);
        System.out.println(ergebnis2);
        System.out.println(ergebnis3);


        double erg = Math.pow(3,4);
        System.out.println(erg);

        devider();

        int erg1 = power(3, 7);
        int erg2 = power(2, 3);
        int erg3 = power(2, 4);

        System.out.println(erg1 + " " + erg2 + " " + erg3);
    }
}
