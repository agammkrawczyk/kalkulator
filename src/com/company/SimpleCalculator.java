package com.company;

public class SimpleCalculator {
    public double substractAfromB(double a, double b) {
        return a - b;}
    public double addAtoB(double a, double b){
        return a +b;
        }

    public static void main(String[] args) {



            SimpleCalculator simpleCalculator = new SimpleCalculator();

            double result = simpleCalculator.substractAfromB(5.2,3.4);

            System.out.println("Substract result "+result);
            double result2= simpleCalculator.addAtoB(3.2,4.2);
            System.out.println("Add result "+result2);

    }
}
