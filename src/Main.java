import javax.swing.*;

/**
 * @author Дмитро Українець
 * @version 1.1
 * @since 12.05.2023
 * @File: Calculator
 * @Overwrite: Це калькулятор, який працює у двох режимах: "Стандартний" та "Тригонометричний".
 */
public class Main {

    /** Головний метод програми. */
    public static void main(String[] args) {
        CalculatorGraphic calculator = new CalculatorGraphic(1);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setVisible(true);
    }
}