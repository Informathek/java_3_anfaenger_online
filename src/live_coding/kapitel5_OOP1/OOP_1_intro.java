package live_coding.kapitel5_OOP1;

//int[] arr = {8,6,9,4,2};
//arr[3]


class Mensch {
    String name;
    String farbe;
    int alter;
    int laenge;
    String ort;
    char geschlecht;
}

// class erstellen
class Haus{
    String adresse;
    int plz;
    double flaeche;
    int anzahlZimmer;
}


public class OOP_1_intro {
    public static void main(String[] args) {
        int x = 6;
        int[] arr = new int[4];
        arr[0] = 9;
        arr[1] = 8;
        arr[3] = 9;
        arr[2] = 7;


        // objekt erstellen
        Mensch mensch1 = new Mensch();
        Mensch mensch2 = new Mensch();

        // objekt initialisieren
        mensch1.name = "Mohammad";
        mensch1.farbe = "braun";
        mensch1.alter = 29;
        System.out.println(mensch1.ort);
        mensch1.ort = "Berlin";
        System.out.println(mensch1.ort);


        mensch2.name = "jean";
        mensch2.farbe = "braun";
        mensch2.alter = 26;
        System.out.println(mensch2.ort);
        mensch1.ort = "Hamburg";
        System.out.println(mensch2.ort);


        Haus haus1 = new Haus();
        Haus haus2 = new Haus();

        haus1.adresse = "berlinerstr, 123";
        haus1.anzahlZimmer = 3;
        haus1.plz = 12345;
        haus1.flaeche = 90;

        haus2.adresse = "berlinerplatz, 123";
        haus2.anzahlZimmer = 2;
        haus2.plz = 12395;
        haus2.flaeche = 80;


    }
}
