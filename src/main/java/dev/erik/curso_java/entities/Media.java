package dev.erik.curso_java.entities;

import java.util.Scanner;

public class Media {

    Scanner systemIn = new Scanner(System.in);
    public int quantity;
    public double acum;
    public int number = 1;

        public double notes(){
            for (int i = 0; i < quantity; i++){
                System.out.printf("Digite sua %dº nota: ", number);
                acum += systemIn.nextDouble();
                number = number + 1;
            }
            return acum;
        }

        public double averrage(){
            if(quantity == 0){
                return 0;
            }
            return acum / quantity;
        }

}
