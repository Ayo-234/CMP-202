package oop;


public class AquaticAnimal extends Animal {
 
    @Override
    String move() {
        return "Swims in the ocean.";
    }  

    public static void main(String[] args) {
        AquaticAnimal whale = new AquaticAnimal();
        whale.name = "Whales ";
        System.out.println(whale.name + whale.move());
    }
}
