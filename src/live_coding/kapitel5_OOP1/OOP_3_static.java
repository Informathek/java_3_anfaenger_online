package live_coding.kapitel5_OOP1;

// static -> class
// xxxxx -> objekt

class Student{
    String name;
    static int PLZ;

    void printSomething(){
        System.out.println("printSomething methode in der Student class");
    }
    static void mainStudent(){

    }
}

class Lehrer{
    String name;
    static char geschlecht;

    void printSomething(){
        System.out.println("printSomething methode in der Lehrer class");
    }

    void mainLehrer(){
        System.out.println("jeaaaaaaaaaan");
        // aufruf aller statische variablen und methoden
        Student.PLZ = 1;
        Student.mainStudent();
        geschlecht = 'M';
        OOP_3_static.lektionNummer = 5;

        // nicht statische methoden und variablen
        Student student1 = new Student();
        student1.name = "sabaa";
        name = "ahmad";
    }
}


public class OOP_3_static {
    String name;
    static int lektionNummer;

    void printSomething(){
        System.out.println("printSomething methode in der OOP_3_static class");
    }

    public static void main(String[] args) {

        OOP_3_static oop_3_static1 = new OOP_3_static();
        oop_3_static1.name = "java";

        OOP_3_static.lektionNummer = 9;
        lektionNummer = 9;
        oop_3_static1.printSomething();



        Student.PLZ = 3;

        System.out.println(Student.PLZ); // 3

        Student student1 = new Student(); // objekt erstellen
        Student student2 = new Student(); // objekt erstellen

        System.out.println(student1.PLZ); // 3
        System.out.println(student2.PLZ); // 3
        System.out.println(Student.PLZ); // 3

        student1.name = "lamiaa";
        student1.PLZ = 1;
        System.out.println(student1.PLZ); // 1
        System.out.println(student2.PLZ); // 1
        System.out.println(Student.PLZ); // 1


        student2.name = "alaa";
        student2.PLZ = 2;
        System.out.println(student1.PLZ); // 2
        System.out.println(student2.PLZ); // 2
        System.out.println(Student.PLZ); // 2

        student1.printSomething();
        student2.printSomething();


        Lehrer.geschlecht = 'F';

        Lehrer lerher1 = new Lehrer();
        lerher1.mainLehrer();


    }
}
