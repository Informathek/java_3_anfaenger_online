package live_coding.kapitel5_OOP1;

class Hund{
    String farbe;
    String name;
    int alter;

    // eine besondere methode, naemlich der KONSTRUKTPOR
    Hund(String myFarbe, String myName, int myAlter){
        farbe = myFarbe;
        name = myName;
        alter = myAlter;
    }
}



class Cat{
    String name;
    int alter;

    Cat(String myName, int myAlter){
        name = myName;
        alter = myAlter;
    }
}


public class OOP_6_konstruktor {
    public static void main(String[] args) {

//        System.out.println(hund1.farbe);
//        hund1.farbe = "weiss";
//        hund1.name = "kuku";
//        hund1.alter = 1;
//
//        hund2.farbe = "rot";
//        hund2.name = "lulu";
//        hund2.alter = 3;
//
//        hund3.farbe = "weiss";
//        hund3.name = "kuku";
//        hund3.alter = 1;
//
//        hund4.farbe = "rot";
//        hund4.name = "lulu";
//        hund4.alter = 3;

        Cat cat1 = new Cat("mimi", 3);
        Cat cat2 = new Cat("momo", 2);
        System.out.println(cat1.name);
        System.out.println(cat2.name);

    }
}

