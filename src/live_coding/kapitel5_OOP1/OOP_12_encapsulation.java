package live_coding.kapitel5_OOP1;

class Studiernede{
    String name;
    private int id;

    Studiernede(){}

    Studiernede(String name){
        this.name = name;
    }


    int getId(){
        return id;
    }

    void setId(int id){
        this.id = id;
    }

}

public class OOP_12_encapsulation {
    public static void main(String[] args) {
        Studiernede student1 = new Studiernede();
        Studiernede student2 = new Studiernede();
        Studiernede student3 = new Studiernede("mohmmad");


        student1.name = "alaa";
        student2.name = "jean";

        // student1.id = 123;
        student1.setId(123);
        student2.setId(1212343);

        System.out.println(student1.name);
        System.out.println(student2.name);

        // System.out.println(student1.id);
        System.out.println(student1.getId());
        System.out.println(student2.getId());

        System.out.println(student3.name);
        System.out.println(student3.getId());

    }
}
