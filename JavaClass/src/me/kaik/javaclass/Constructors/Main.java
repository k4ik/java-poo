package me.kaik.javaclass.Constructors;

public class Main {
    int x;

    /**
     * Class Constructor
     */
    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Main myObj = new Main(5);
        System.out.println(myObj.x);
    }
}


