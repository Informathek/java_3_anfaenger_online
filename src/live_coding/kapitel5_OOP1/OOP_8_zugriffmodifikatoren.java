package live_coding.kapitel5_OOP1;

class Maus{
    public int alter;
    String name;
    private int id;

    void printSomething_default(){
        System.out.println(alter);
        System.out.println(name);
        System.out.println(id);
    }

    public void printSomething_public(){
    }

}

public class OOP_8_zugriffmodifikatoren {
    public static void main(String[] args) {
        // maus (default)
        // - name (default)
        // - alter (public)
        // - id (private)
        Maus maus = new Maus();
        maus.name = "jerry";
        maus.alter = 1;
//        maus.id = 333; // geht nicht, da `id` ist private!!!

        // tiger (public)
        // - name (default)
        // - alter (public)
        // - id (private)
        Tiger tiger = new Tiger();
        tiger.name = "lion";
        tiger.alter = 10;
//        tiger.id = 563; // geht nicht




    }
}
