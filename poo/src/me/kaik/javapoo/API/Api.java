package me.kaik.javapoo.API;

import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Olá " + nome + ", é um prater te conhecer!");
    }
}
