//Dawid Dudek s1074780 and Omar Qaterge s1056565
package nl.ru.ai.dynamicduo.exercise3;

import java.util.Scanner;

public class Solver {
    public static void main(String[] args) { userInput();}

    private static void calculations(double a, double b, double c) {
        double D = (b*b) - (4*a*c);
        if (D == 0) {
            double x = (-b)/(2*a);
            System.out.println("The solution is x = " + x);
        }
        else if (D > 0) {
            double x1 = ((-b + Math.sqrt(D))/(2*a));
            double x2 = ((-b - Math.sqrt(D))/(2*a));
            System.out.println("The solution is x1 = " + x1 + " and x2 = " + x2);
        }
        else {
            System.out.println("There're no real solutions.");
        }
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of a:");
        double a = scanner.nextDouble();
        while (a == 0) {
            System.out.println("Value of a cannot be equal to 0. Value of a: ");
            a = scanner.nextDouble();
        }
        System.out.println("Value of b:");
        double b = scanner.nextDouble();
        System.out.println("Value of c:");
        double c = scanner.nextDouble();
        calculations(a,b,c);
    }
}

