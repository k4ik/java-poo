package me.kaik.javapoo.Constructors;

public class Exercicio {
    int anoModelo;
    String nomeModelo;


    public Exercicio(int ano, String nome) {
        anoModelo = ano;
        nomeModelo = nome;
    }

    public static void main(String[] args) {
        Exercicio carro = new Exercicio(1999, "Fusca Azul");
        System.out.println(carro.anoModelo + " " + carro.nomeModelo);
    }
}