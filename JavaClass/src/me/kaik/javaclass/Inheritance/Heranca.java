package me.kaik.javaclass.Inheritance;

class Heranca {

   protected String marca = "Ford";

   public void buzinar() {
        System.out.println("Bi Bii");
   }
}

class Carro extends Heranca {

    private String modelo = "Mustang";
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.buzinar();
        System.out.println(carro1.marca + " " + carro1.modelo);
    }

}


