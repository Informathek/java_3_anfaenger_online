package live_coding.kapitel5_OOP;
// klass erstellung
class Katze{
    String rasse;
    static char geschlecht;


    // mit parameters (argumente), kein Rueckgabewert (return)
    static void printSomething(String name1, String name2) {
        int x;
        System.out.println("Hello " + name1);
        System.out.println("Hello " + name2);
    }

    void divide(){
        System.out.println("***************");
    }
}

class House{
    static int anzahlZimmer;
}

public class OOP_2_static_intro {

    public static void main(String[] args) {

        House.anzahlZimmer = 4;
        System.out.println(House.anzahlZimmer);

        Katze.geschlecht = 'U';
        System.out.println(Katze.geschlecht);

        // objekte erstellen
        Katze meineKatze1 = new Katze();
        Katze meineKatze2 = new Katze();
        Katze meineKatze3 = new Katze();

        meineKatze1.rasse = "bkh";
        meineKatze2.rasse = "long";
        meineKatze3.rasse = "blh";

        System.out.println(meineKatze1.rasse);
        System.out.println(meineKatze2.rasse);
        System.out.println(meineKatze3.rasse);
        System.out.println("--------");


        System.out.println("-------------");
        meineKatze1.geschlecht = 'W';
        System.out.println(meineKatze1.geschlecht); // w
        System.out.println(meineKatze2.geschlecht); // w
        System.out.println(meineKatze3.geschlecht); // w

        meineKatze3.geschlecht = 'M';
        System.out.println(meineKatze1.geschlecht); // m
        System.out.println(meineKatze2.geschlecht); // m
        System.out.println(meineKatze3.geschlecht); // m

        Katze.geschlecht = 'U';
        System.out.println(Katze.geschlecht);
        System.out.println(meineKatze1.geschlecht); // u
        System.out.println(meineKatze2.geschlecht); // u
        System.out.println(meineKatze3.geschlecht); // u


        System.out.println("-----------------");
        Katze.printSomething("meow", "wue");
        Katze.printSomething("meo", "awe");
        Katze.printSomething("mow", "wue");

        meineKatze1.divide();
        meineKatze2.divide();
        meineKatze3.divide();
    }
}
