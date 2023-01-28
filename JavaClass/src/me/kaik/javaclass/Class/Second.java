package me.kaik.javaclass.Class;

class Second {
    public static void main(String[] args) {
      Main myObj = new Main();

      System.out.println("Name: " + myObj.name);
      System.out.println("Age: " + myObj.age);

      //myObj.name = "Marcos";
      myObj.age = 16;

      System.out.println("New Age: " + myObj.age);

      myObj.Falar();

      
    }
}
