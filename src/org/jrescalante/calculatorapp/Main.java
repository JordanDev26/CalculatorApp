package org.jrescalante.calculatorapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(showMenu());
                var option = Integer.parseInt(console.nextLine());
                if (option >= 1 && option <= 4) {
                    double result = executeOperation(option, console);
                    System.out.println("result = " + result);
                } else if (option == 5) {
                    System.out.println("See you soon...");
                    break;
                } else {
                    System.out.println("invalid option -> " + option);
                }
                System.out.println();
            }catch (Exception e){
                System.out.println("Error in the aplication -> " + e.getMessage());
            }
        }
    }


    private static String showMenu() {
        return "**** Calculator App ****\n" +
                "1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Go out" +
                "Operation to perform? ";
    }

    private static double executeOperation (int option, Scanner console){
        double result = 0;
        System.out.print("Enter value 1: ");
        var value1 = Double.parseDouble(console.nextLine());
        System.out.print("Enter value 2: ");
        var value2 = Double.parseDouble(console.nextLine());
        switch (option) {
            case 1 -> result = value1 + value2;
            case 2 -> result = value1 - value2;
            case 3 -> result = value1 * value2;
            case 4 -> result = value1 / value2;
            default -> System.out.println("invalid option -> " + option);
        }
        return result;
    }
}
