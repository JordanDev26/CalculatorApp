package org.jrescalante.calculatorapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("**** Calculator App ****");
        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Go out");
        System.out.print("Operation to perform? ");
        var option = Integer.parseInt(console.nextLine());
        if (option >= 1 && option <= 4) {
            System.out.print("Enter value 1: ");
            var value1 = Integer.parseInt(console.nextLine());
            System.out.print("Enter value 2: ");
            var value2 = Integer.parseInt(console.nextLine());
            int result = 0;
            switch (option){
                case 1 -> result = value1+value2;
                case 2 -> result = value1-value2;
                case 3 -> result = value1*value2;
                case 4 -> result = value1/value2;
                default -> System.out.println("invalid option -> " + option);
            }
            System.out.println("result = " + result);

        }else if(option == 5){
            System.out.println("See you soon...");
        }else {
            System.out.println("invalid option -> " + option);
        }

    }

    private static String showMenu() {
        return "";
    }
}
