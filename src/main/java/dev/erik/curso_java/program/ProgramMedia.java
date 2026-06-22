package dev.erik.curso_java.program;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Media;

public class ProgramMedia {
     public static void main (String[] args){
    
        Locale.setDefault(Locale.US);
        Scanner systemIn = new Scanner(System.in);

        Media quantity = new Media();

        System.out.printf("Digite a quantidade de notas: ");
        quantity.quantity = systemIn.nextInt();
        quantity.notes();
        
        System.out.printf("Sua media final é de: %.2f", quantity.averrage());
       
        systemIn.close();
    }
}
