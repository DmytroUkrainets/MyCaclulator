package org.example;

import javax.swing.*;

/**
 * @author Dmytro Ukrainets
 * @version 1.1
 * @since 12.05.2023
 * @File: Calculator
 * @Overwrite: This is a calculator working in two modes: "Standard" and "Trigonometric".
 */
public class Main {

    /** The main method of the program. */
    public static void main(String[] args) {
        CalculatorGraphic calculator = new CalculatorGraphic(1);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setVisible(true);
    }
}