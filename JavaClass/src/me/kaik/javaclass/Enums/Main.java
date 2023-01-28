package me.kaik.javaclass.Enums;

/*public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}*/

enum Level {
    LOW,
    MEDIUM,
    HIGH;
}

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch(myVar) {
            case LOW:
              System.out.println("Low level");
              break;
            case MEDIUM:
               System.out.println("Medium level");
              break;
            case HIGH:
              System.out.println("High level");
              break;
        }
    }
}
