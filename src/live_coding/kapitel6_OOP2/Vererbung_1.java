package live_coding.kapitel6_OOP2;

class Animal{
    String name;
    int alter;
    int gewicht = 100; //gram
    static int plz = 11111;

    void printSomething(){
        System.out.println("hi there! ich bin ein animal");
    }
}

// Katze erbt von Animal == Animal vererbt an Katze
class Katze extends Animal{
    String haarFarbe = "braun";

    void printSomething(){
        System.out.println("hi there, ich bin eine Katze");
    }
}

class Vogel extends Animal{
    int anzahl_EierImNest;
}

public class Vererbung_1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Katze katze = new Katze();

        animal1.alter = 42;
        animal1.gewicht = 99;
        Animal.plz = 88888;

        System.out.println(katze.name); // null
        System.out.println(katze.alter); // 0
        System.out.println(katze.gewicht); // 100
        System.out.println(katze.plz); // 88888

        animal1.printSomething(); // animal
        katze.printSomething(); // Katze









    }
}
