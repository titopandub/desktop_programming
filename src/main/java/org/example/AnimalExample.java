package org.example;

public class AnimalExample {
    public static void main(String[] args) {
        Frog greenFrog = new Frog("green", 200);
        System.out.println("Frog color is " + greenFrog.getColor());
        System.out.println("Frog weight is " + greenFrog.getWeightInGram() + "gr");

        greenFrog.jump();
        greenFrog.eat("mosquito");
        greenFrog.ribbit();

        greenFrog.eaten("snake");
    }
}

class Frog {
    // property
    String color;
    float weightInGram;

    // initialization method
    public Frog(String color, float weightInGram) {
        this.color = color;
        this.weightInGram = weightInGram;
    }

    // method
    public void jump() {
        System.out.println("frog jumping!");
    }

    public void eat(String food) {
        System.out.println("frog eat " + food);
    }

    public void ribbit() {
        System.out.println("ribbit! ribbit!");
    }

    public String getColor() {
        return this.color;
    }

    public float getWeightInGram() {
        return this.weightInGram;
    }

    // event
    public void eaten(String predator) {
        System.out.println("frog is eaten by " + predator + ", frog is dead!");
    }
}
