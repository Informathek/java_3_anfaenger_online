package live_coding.kapitel5_OOP1;

class Pferd{
    String name;
    int alter;
    int gewicht;

    public String toString(){
        return "the name is: " + name + ", the age is: " + alter + " " + gewicht;
    }

}


public class OOP_11_toString_wiederholung {
    public static void main(String[] args) {

        Pferd pferd1 = new Pferd();

        pferd1.name = "alaa's Pfderd";
        pferd1.alter = 343;
        pferd1.gewicht = 43;

        System.out.println(pferd1.name);
        System.out.println(pferd1.alter);
        System.out.println(pferd1.gewicht);

        System.out.println("----------------");

        System.out.println(pferd1.toString());
        System.out.println(pferd1);

    }
}
