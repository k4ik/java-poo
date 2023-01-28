package me.kaik.javaclass.Modifiers.Final;

public class Final {
    final float pi = 3.14f;

    public static void main(String[] args) {
        Final obj = new Final();
        //obj.pi = 34; error
        System.out.println(obj.pi);
    } 
}
