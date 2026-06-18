package dev.erik.curso_java.entities;

public class Radius {

    public static double r;
    public static double pi = 3.14;

    public static double circumference(){
        return 2 * pi * r;
    }

    public static double volume(){
        return (4.0 / 3.0) * pi * Math.pow(r, 3);
    }

}
