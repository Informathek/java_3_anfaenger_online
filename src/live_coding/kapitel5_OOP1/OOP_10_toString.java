package live_coding.kapitel5_OOP1;

class Auto{
    double preis;
    String farbe;
    String model;

    Auto(double preis, String farbe, String model){
        this.preis = preis;
        this.farbe = farbe;
        this.model = model;
    }

    Auto(){
    }

    String printAttribute(){
        return "Der Preis ist: " + this.preis + ", die Farbe ist: " + this.farbe + ", das Model ist: " +this.model;
    }

    public String toString(){
        return "Der Preis ist: " + this.preis + ", die Farbe ist: " + this.farbe + ", das Model ist: " +this.model;
    }

}

public class OOP_10_toString {
    public static void main(String[] args) {

        Auto mohammadAuto = new Auto();
        Auto jeanAuto = new Auto(1000, "B", "Tesla");

        Auto sabaaAuto = new Auto();
        sabaaAuto.preis = 1003;
        sabaaAuto.farbe = "R";
        sabaaAuto.model = "BMW";

        System.out.println(jeanAuto.preis);
        System.out.println(jeanAuto.farbe);
        System.out.println(jeanAuto.model);

        System.out.println(sabaaAuto.preis);
        System.out.println(sabaaAuto.model);
        System.out.println(sabaaAuto.farbe);

        System.out.println("----------------");

//        System.out.println(sabaaAuto.printAttribute());
//        System.out.println(jeanAuto.printAttribute());

        System.out.println(mohammadAuto.printAttribute());
        System.out.println(mohammadAuto.toString());
        System.out.println(mohammadAuto);

        System.out.println("1111111111111111111111");
        System.out.println("Jetzt kommt Alaa's Auto");
        Auto alaaAuto = new Auto(100, "Gruen", "tesla");
        System.out.println(alaaAuto);
        System.out.println(alaaAuto.printAttribute());
        System.out.println(alaaAuto.preis);


//        100 * 100 = 10000
//        100
    }
}
