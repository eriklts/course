package dev.erik.curso_java.program;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Product;

public class ProgramProduct {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.printf("Price: ");
        double price = sc.nextDouble();
        System.out.printf("Quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        product.setName("computador");
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.printf("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Update data: " + product);

        System.out.printf("Enter the number of product to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);
        
         sc.close();            
    }
}