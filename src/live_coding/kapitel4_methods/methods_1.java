package live_coding.kapitel4_methods;

public class methods_1 {

    // ohne param, ohne return
    public static void willkommenMethode() {
        System.out.println("hi");
        System.out.println("i love java");
        System.out.println("hi nochmal ");
        System.out.println("i love coding");
        System.out.println("bye");
        System.out.println("============");
    }

    // mit param, ohne return
    public static void printMax(int x, int y) {
        String name = "alaa";
        if (x > y){
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }
    }

    // ohne param, mit return
    public static String begruessung(){
//        String message = "Willkommen zu unserem Program..!";
//        return message
        return "Willkommen zu unserem Program..!";
    }

    // mit param, mit return
    public static double berechneFlaecheDreieck(int basis, int hoehe){
        // 6 / 2 = 3
        // 6.0 / 2 = 3.0
        // 6 / 2.0 = 3.0

        double ergebnis = basis * hoehe / 2.0;
        return ergebnis;
    }


    public static void main(String[] args) {
        System.out.println(begruessung());

        System.out.println("jean");
        willkommenMethode();
        willkommenMethode();
        System.out.println("Lamiaa");

        int zahl1 = 7;
        int zahl2 = 8;
        int zahl3 = 9;

        printMax(zahl1, zahl2);

        printMax(34980573, 34980473);

        // int x = 16;
        System.out.println(Math.sqrt(16));

        System.out.println("----------------");
        double meinErgebnis1 = berechneFlaecheDreieck(3, 9);
        double meinErgebnis2 = berechneFlaecheDreieck(6, 5);
        System.out.println(meinErgebnis1);
        System.out.println(meinErgebnis2);
    }
}
