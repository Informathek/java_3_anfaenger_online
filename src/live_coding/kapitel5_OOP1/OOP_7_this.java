package live_coding.kapitel5_OOP1;

class Bike{
    String farbe;
    int speed;
    int anzahlRaeder;

    Bike() {
    }

    Bike (int speed){
        this.speed = speed;
    }

    Bike (String farbe){
        this.farbe = farbe;
    }

    Bike(String farbe, int speed){
        this.farbe = farbe;
        this.speed = speed;
    }

    // konstruktor: eine spaezielle methode!!!!
    Bike(String farbe, int speed, int anzahlRaeder){
        this.farbe = farbe;
        this.speed = speed;
        this.anzahlRaeder = anzahlRaeder;
    }

    public void brake(int speed){
        System.out.println("deine jetzige Geschwidikeit ist:" + this.speed);
        this.speed = speed;
        System.out.println("deine neue Geschwidikeit nach dem bremsen wird:" + this.speed);
    }
}


class Ant{
    public int anzahlFreunde;
    int alter;

    Ant(){
    }

    Ant(int anzahlFreunde, int alter){
        this.anzahlFreunde = anzahlFreunde;
        this.alter = alter;
    }

}

public class OOP_7_this {
    public static void main(String[] args) {

        Ant ant0  = new Ant();
        Ant ant1  = new Ant(13, 100);








        Bike bike1 = new Bike("weiss", 50, 2); // erstelle ein Objekt vom Typ Bike. Aurfruf des konstruktors
        Bike bike2 = new Bike("rot", 30, 1); // erstelle ein Objekt vom Typ Bike
        Bike bike3 = new Bike("blau", 60, 3); // erstelle ein Objekt vom Typ Bike
        bike1.farbe = "lila";

        bike1.brake(7);
        bike2.brake(100);

        Bike bike4 = new Bike();
//        // ten years later
//        bike4.speed = 10;
//        // 20 years later
//        bike4.farbe = "gruen";
        Bike bikeLamia = new Bike();

        Bike bike5 = new Bike("blau", 6);

        Bike bike6 = new Bike(60);
        bike6.anzahlRaeder = 4;
        bike6.farbe = "keine farbe";

        Bike bike7 = new Bike("rosa");

    }
}
