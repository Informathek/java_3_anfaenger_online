package live_coding.kapitel4_methods;

public class methods_1 {
    // definition der von mir selbst definierte Methode
    public static void myPrintTextMethode(){
        System.out.println("hi zu unserem program");
        System.out.println("we love java");
        System.out.println("good bye!!");
        System.out.println("=====================");
        System.out.println();
    }


    public static void main(String[] args) {
        int x = 7;
        System.out.println(x);
        // aufruf der von mir selbst definierete Methode (verwendung)
        myPrintTextMethode();

        int ergebnis = x * 10;
        System.out.println(ergebnis);
        // ten years later
        myPrintTextMethode();


        // 1000 years alter
        myPrintTextMethode();
    }
}
