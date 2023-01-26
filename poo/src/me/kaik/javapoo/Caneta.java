package me.kaik.javapoo;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está Tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (tampada == false) {
            System.out.println("Estou tampada, não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar() {
        this.tampada = false;
    }

    protected void destampar() {
        this.tampada = true;
    }
}

