package live_coding.kapitel6_OOP2;

class Auto{
    String model;
    int preis;
    String farbe;

    Auto(String model, int preis, String farbe){
        this.model = model;
        this.preis = preis;
        this.farbe = farbe;
    }

    Auto(String model, String farbe){
        this.model = model;
        this.farbe = farbe;
    }

    Auto(int preis){
        this.preis = preis;
    }


    Auto(){
        this(100000);
    }
}

public class this2_2 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", 100, "Weis");
        Auto auto2 = new Auto("Audi", 200, "Schwarz");
        Auto auto3 = new Auto("Audi", "Schwarz"); // audi, 0, Schwarz

        Auto auto4 = new Auto(); //
        System.out.println(auto4.model); // null
        System.out.println(auto4.preis); // 100000
        System.out.println(auto4.farbe); // null
    }
}
