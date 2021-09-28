package nl.ru.ai.sleezyslimeballs.exercise3;

import java.util.Scanner;

public class newton_raphson {
    public static void main(String[] args) {
        userInput();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your number: ");
        Double a = scanner.nextDouble();

        calculate(a);
    }

    private static void calculate(Double a) {
        Double x1 = 1.0;
        Double epsilon = 0.001;
        Double func = x1 * x1 - a;
        Double deriv_func = 2 * x1;
        Double h = func/deriv_func;


        for (Double i = 0; i < epsilon; i++) {
            x1 = 2.0;
        }
    }
}
