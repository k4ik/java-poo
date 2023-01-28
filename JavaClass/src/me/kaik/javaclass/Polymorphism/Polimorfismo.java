package me.kaik.javaclass.Polymorphism;

class Polimorfismo {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Polimorfismo {
    public void animalSound() {
        System.out.println("wee wee");
    }
}

class Dog extends Polimorfismo {
    public void animalSound() {
        System.out.println("bow bow");
    }
}

class Main {
    public static void main(String[] args) {
        Polimorfismo myAnimal = new Polimorfismo();
        Polimorfismo myPig = new Pig();
        Polimorfismo myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}