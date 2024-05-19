package live_coding.kapitel2_flusskontrolle;

public class ifElse_Anweisung_1 {
    public static void main(String[] args) {


        String heute = "Samstag";
        boolean abwesende = true; // es gibt keine abwesenden
        String startzeit = "";

        System.out.println("Bevore if-Anweisung");

        /*
        if(   (heute == "Samstag") || (heute == "Sonntag")   ){
            System.out.println("In der if-block");
            System.out.println("Wir haben Unterricht");
            x = 10;
            System.out.println(x);
        }
        */

        if(heute == "Samstag"){
            System.out.println("In der if-block");
            System.out.println("Wir haben Unterricht");

            if(abwesende == false){
                startzeit = "10:30";
                System.out.println(startzeit);

            }

            else { //  if(abwesende == true)
                startzeit = "10:00";
                System.out.println(startzeit);
            }

            System.out.println("Wir haben den Startzeit zugestimmt");
        }

        System.out.println("Nach if-Anweisung");
        System.out.println(startzeit);

        // ---------------------------------------------------------------------
        // Weiteres Beispiel
        //  Kinder unter 10 Jahren dürfen kein Handy kaufen.
        //  Kiner zwischen 10 und 12 Jahren dürfen nur bis zu 2 Stunden pro Tag mit dem Handy spielen.
        //  Kinder ab 13 Jahre dürfen ein Handy haben."

        int alter = 15; // das kann irgendeine beliebige nummer sein.

        if (alter < 10) {
            System.out.println("Du darfst KEIN Handy haben");
        }
        if (alter >= 10 && alter < 13) {
            System.out.println("Du darfst NUR 2 Stunden am Tag mit dem Handy spielen");
        }
        if (alter >= 13) {
            System.out.println("Du darfst ein Handy haben");
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Eine andere schreibweise:");

        if(alter < 10){
            // wenn alter < 10
            System.out.println("kein Handy!!");
        }

        else {
            // wenn alter >= 10
            if(alter < 13){
                // wenn alter kleiner 13 (und >= 10)
                System.out.println("Nur 2 stunden am Tag");
            }
            else {
                // wenn alter groesser 13 (und >= 10)
                System.out.println("Duerfen ein Handy besitzen");
            }

        }

    }
}
