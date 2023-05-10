package com.Sebastian;

import java.text.NumberFormat;
import java.util.Scanner;

public class Console {
    public static double readNumber(String prompt, int min, int max) {
        var scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + NumberFormat.getCurrencyInstance().format(min) + " and " + NumberFormat.getCurrencyInstance().format(max));
        }
        return value;
    }
}
