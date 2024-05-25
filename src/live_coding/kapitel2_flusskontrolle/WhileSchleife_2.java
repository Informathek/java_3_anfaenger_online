package live_coding.kapitel2_flusskontrolle;

// WErkzeug fuer Alternativen:
// 1. if-else
// 2. switch (break, continue, default)
// ---------

// Werkzeug zum Wiederholen
// 1. while-schleife (HEUTE)
// 2. for-schleife (HEUTE)
// 3. for each -schleife (machen wir nicht)
// 4. do-while (machen wir nicht)

class WhileSchleife_2 {
    public static void main(String[] args) {


        System.out.println(1 + 1); // 2
        System.out.println("1 + 1"); // 1 + 1
        System.out.println("1" + "1"); // 11

        System.out.println(1 + "1"); // 11
        System.out.println(1 + 1 + "1"); //  21
        System.out.println(1 + "1" + 1); //  111
        System.out.println("1" + 1); //  11

        System.out.println("1" + 1 + 1); //  111
        System.out.println(1 + "1" + 1 + 1); //  1111
        System.out.println(1 + 1 + "1" + 1 + 1); //  2111 

        int x = 7;
        System.out.println("Der Wert von x ist: " + "x"); // Der Wert von x ist x

        System.out.println("Der Wert von x ist: " + x + x); // Der Wert von x ist 77

        System.out.println(x + x + " ist der Wert Der Wert von 2x"); // 14 ist der Wet von x + x

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");


        System.out.println("---- while schleife unten----");
        int zaehler = 0;
        while (zaehler < 5){
            System.out.println(zaehler + ". I love java");
            zaehler++; // (zaehler += 1) ODER (zehler=zaehler+1)
        }






        System.out.println("---- for schleife unten-----");

        for(int counter = 0; counter < 5; counter++){
            System.out.println(zaehler + ". I love java");
        }


        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");

        int geheimzahl_mohammad = 7;
        int gerateneZahl_sabaa;

        while(true){
            gerateneZahl_sabaa = 7;

            if (gerateneZahl_sabaa == geheimzahl_mohammad){
                System.out.println("yeeey");
                break;
            }

            else {
                System.out.println("Versuche es nochmal");
            }
        }

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");

        boolean unendlich_versuche = true;
        while(unendlich_versuche == true){
            gerateneZahl_sabaa = 7;

            if (gerateneZahl_sabaa == geheimzahl_mohammad){
                System.out.println("yeeey");
                unendlich_versuche = false;
            }

            else {
                System.out.println("Versuche es nochmal");
            }
        }

    }
}