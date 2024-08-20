package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var bubblegumEarnedAmount = 202;
        var toffeeEarnedAmount = 118;
        var iceCreamEarnedAmount = 2250;
        var milkChocolateEarnedAmount = 1680;
        var doughnutEarnedAmount = 1075;
        var pancakeEarnedAmount = 80;

        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%d\n", bubblegumEarnedAmount);
        System.out.printf("Toffee: $%d\n", toffeeEarnedAmount);
        System.out.printf("Ice cream: $%d\n", iceCreamEarnedAmount);
        System.out.printf("Milk chocolate: $%d\n", milkChocolateEarnedAmount);
        System.out.printf("Doughnut: $%d\n", doughnutEarnedAmount);
        System.out.printf("Pancake: $%d\n\n", pancakeEarnedAmount);

        double income = bubblegumEarnedAmount + toffeeEarnedAmount + iceCreamEarnedAmount + milkChocolateEarnedAmount
                + doughnutEarnedAmount + pancakeEarnedAmount;

        System.out.printf("Income: $%.1f\n", income);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Staff expenses:");
        double staffExpenses = scanner.nextDouble();

        System.out.println("Other expenses:");
        double otherExpenses = scanner.nextDouble();

        double netIncome = income - (staffExpenses + otherExpenses);
        System.out.printf("Net income: $%f\n", netIncome);
    }
}
