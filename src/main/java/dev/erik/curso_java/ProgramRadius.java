package dev.erik.curso_java;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Radius;

public class ProgramRadius {

       public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        Radius.r = sc.nextDouble();

        
        System.out.printf("Circumference: %.2f", Radius.circumference());
        System.out.println();
        System.out.printf("Volume: %.2f", Radius.volume());
        System.out.println();
        System.out.printf("PI value: %.2f", Radius.pi);

        





    }
}
