package me.kaik.javapoo.Modifiers.Static;

public class Static {
    static void staticMethod() {
        System.out.println("Hello");
    }

    public void publicMethod() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        staticMethod(); // Pode ser chamado sem precisar criar um objeto

        Static obj = new Static(); // Necessita a criação de um objeto para ser chamado
        obj.publicMethod(); 

    }
}
