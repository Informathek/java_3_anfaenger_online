package live_coding.kapitel6_OOP2;

class Tier{
    String name = "No name";
    double gewicht = 100 ; // in grams
    int alter;

    Tier(String name, double gewicht, int alter){
        this.name = name;
        this.gewicht = gewicht;
        this.alter = alter;
    }

    Tier(){}
}

class Fisch extends Tier{
    int anzahlKiemen = 2;
    boolean kannSchwimmen = true;

    Fisch(){
        // super();
    }

    // meine attribute
    Fisch(int anzahlKiemen, boolean kannSchwimmen){
        // super();
        this.anzahlKiemen = anzahlKiemen;
        this.kannSchwimmen = kannSchwimmen;
    }

    // mein eltern's attribute
    Fisch(String name, double gewicht, int alter){
        super(name, gewicht, alter);
    }


    Fisch(int anzahlKiemen, boolean kannSchwimmen, String name, double gewicht, int alter){
        super(name, gewicht, alter);
        this.anzahlKiemen = anzahlKiemen;
        this.kannSchwimmen = kannSchwimmen;
    }

}


public class Vererbung_3 {
    public static void main(String[] args) {

//        --------------------  Tier 1:
        Tier tier1 = new Tier();

        System.out.println(tier1.name); // no name
        System.out.println(tier1.gewicht); // 100
        System.out.println(tier1.alter); // 0

        tier1.name = "This is an animal 1";
        tier1.gewicht = 5.9;
        tier1.alter = 3;

        System.out.println(tier1.name); // "This is an animal 1";
        System.out.println(tier1.gewicht); // 5.9;
        System.out.println(tier1.alter); // 3;

//        --------------------  Tier 2:
        Tier tier2 = new Tier();

        System.out.println(tier2.name); // no name
        System.out.println(tier2.gewicht); // 100
        System.out.println(tier2.alter); // 0

        tier2.name = "This is an animal 2";
        tier2.gewicht = 1.8;
        tier2.alter = 4;

        System.out.println(tier2.name); // "This is an animal 2";
        System.out.println(tier2.gewicht); // 1.8;
        System.out.println(tier2.alter); // 4;

//        --------------------  Fisch1 :
        System.out.println("----------------");

        // 1. anzahlKiemen, 2. kannSchwimmen, 3. name. 4. gewicht, 5. alter
        Fisch fisch1 = new Fisch(); // 2, true, no name, 100, 0
        Fisch fisch2 = new Fisch(); // 2, true, no name, 100, 0

        Fisch fisch3 = new Fisch(6, true); // 6, true, no name, 100, 0
        Fisch fisch4 = new Fisch(8, true); // 8, true, no name, 100 ,0


        Fisch fisch5 = new Fisch("lolale", 88.2, 42); // 2, true, lolale, 88.2, 42
        Fisch fisch6 = new Fisch("fufafe", 77.3, 100); // 2, true, fufafe, 77.3, 100

        Fisch fisch7 = new Fisch(4, true, "samki", 50, 60);
        Fisch fisch8 = new Fisch(4, true, "mr. saltaa", 57, 10);
    }
}
