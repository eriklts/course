package dev.erik.curso_java.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentege){
        grossSalary += grossSalary * percentege / 100.00;
    }
}
