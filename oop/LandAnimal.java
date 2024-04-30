package oop;

public class LandAnimal extends Animal { 

    @Override
    String move() {
        return "Swing on trees";
    }

    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();

        LandAnimal monkey = new LandAnimal();
        monkey.name = "Monkeys ";
        System.out.println(monkey.name + monkey.move()); 
    }
}
