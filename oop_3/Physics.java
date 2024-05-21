package oop_3;
public class Physics {
    // method overloading

    float calculateVelocity(float distance, int time){
        return distance/time;
    }

    float calculateVelocity(float initialVelocity, float acceleration, int time){
        return initialVelocity + (acceleration * time);
    }
}
