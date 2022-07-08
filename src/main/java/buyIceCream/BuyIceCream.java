package buyIceCream;

import java.util.Scanner;

public class BuyIceCream {
    public static void main(String[] args) {

        double totalCost = menu();
        System.out.printf("%n The total cost of Ice Cream is: %3.2f%n", totalCost);
    }

    public static double menu(){

        Scanner input = new Scanner(System.in);
        double valueIceCream = 1.90f;
        int option;

        do {
            System.out.printf(
                    "%n%s%n%s%n%s%n%s%n%s%n%n",
                    "TOPPINGS:",
                    "0. Pay Ice Cream",
                    "1. Oreo: 1$",
                    "2. Kitkat: 0.75$",
                    "3. Brownie: 0.95$"
            );

            System.out.print("Select a new topping or select zero(0) for finish: ");
            option = input.nextInt();

            switch (option) {
                case 0:
                    System.out.printf("%n Thank you for purchase!!");
                    break;
                case 1:
                    valueIceCream += 1;
                    printMessage(valueIceCream);
                    break;
                case 2:
                    valueIceCream += 0.75;
                    printMessage(valueIceCream);
                    break;
                case 3:
                    valueIceCream += 0.95;
                    printMessage(valueIceCream);
                    break;
                default:
                    System.out.printf("%n Select a topping valid %n");// code block
                    break;
            }
        }while(option != 0);

        return valueIceCream;
    }
    public static void printMessage(double message){
        System.out.printf("%nPartial cost of Ice Cream is: %3.2f%n", message);
    }
}
