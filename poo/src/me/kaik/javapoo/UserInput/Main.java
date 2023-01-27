package me.kaik.javapoo.UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");  
        String nome = scan.nextLine();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
}
