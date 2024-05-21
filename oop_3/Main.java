package oop_3;

public class Main {

    public static void main(String[] args) {
        Person student = new Person("Ayo", "13245657687", "22/04/05/0004");
        System.out.println(student);
        System.out.println(student.getName());

        Physics calcVelocity = new Physics();
        System.out.println(calcVelocity.calculateVelocity(100, 20));
        System.out.println(calcVelocity.calculateVelocity(9, 36, 12));

    }
}
