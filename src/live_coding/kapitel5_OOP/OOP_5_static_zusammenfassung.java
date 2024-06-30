package live_coding.kapitel5_OOP;

class Vogel{
    String farbe;
    String name;
    static String planet;

    void print_nicht_static(){
        System.out.println("nicht static");
        planet = "Erde"; // oder Vogel.planet = "Erde"
        name = "vooo";
        farbe = "Weiss";
    }

    static void print_static(){
        System.out.println("static");
        Vogel.planet = "Sonne"; // oder Vogel.planet = "Sonne";

        Vogel vogel1 = new Vogel();
        vogel1.name = "gggggg";
        vogel1.farbe = "rot";
    }
}

public class OOP_5_static_zusammenfassung {
    public static void main(String[] args) {
        Vogel vogel1 = new Vogel();
        Vogel vogel2 = new Vogel();

        vogel1.print_nicht_static();
        vogel2.print_nicht_static();

        Vogel.print_static();


    }
}
