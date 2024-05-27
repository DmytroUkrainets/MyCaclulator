package org.example;

import java.text.DecimalFormat;

/** A class that performs mathematical operations of the calculator. */
public class CalculatorSystem {

    /** A method that checks whether a number is an integer. */
    public static boolean isInteger(double number) {
        return Math.floor(number) == number;
    }

    /** A method that returns the string that is the result of adding two real numbers.
     * @param num1 The first number
     * @param num2 The second number
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String addition(double num1, double num2) {
        double res = num1 + num2;
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** A method that returns the string that is the result of subtracting the second number from the first number.
     * @param num1 The first number
     * @param num2 The second number
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String subtraction(double num1, double num2){
        double res = num1 - num2;
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** A method that returns the string that is the result of multiplying the first number by the second.
     * @param num1 The first number
     * @param num2 The second number
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String multiplication(double num1, double num2){
        double res = num1 * num2;
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** A method that returns the string that is the result of dividing the first number by the second.
     * @param num1 The first number
     * @param num2 The second number
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String dividing(double num1, double num2){
        if (num2 != 0) {
            double res = num1 / num2;
            if (isInteger(res)) return "" + (int) res;
            else return "" + decimalFormat.format(res).replace(',', '.');
        } else return "Error!";
    }

    /** A method that returns the string that is the result of taking the root of a number.
     * @param num The number from which the root is taken
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String getRoot(double num){
        if(num >= 0) {
            double res = Math.sqrt(num);
            if (isInteger(res)) return "" + (int) res;
            else return "" + decimalFormat.format(res).replace(',', '.');
        } else return "Not specified!";
    }

    /** A method that returns the string that is the result of dividing one by a number.
     * @param num The number by which the unit is divided
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String getOneOfSomething(double num){
        if(num != 0) {
            double res = 1 / num;
            if (isInteger(res)) return "" + (int) res;
            else return "" + decimalFormat.format(res).replace(',', '.');
        } else return "Error!";
    }

    /** A method that returns the string that is the result of raising a number to the second power.
     * @param num A number raised to the second power
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String getPower(double num){
        double res = Math.pow(num, 2.0);
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** A method that returns a string that is the result of getting a percentage of a number.
     * @param num1 The number from which the percentage is taken
     * @param num2 A number that specifies a percentage of a number
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String getPercent(double num1, double num2){
        double res = (num1 * num2) / 100.0;
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** If the result is an integer, the output is an int number, otherwise - double.
     * @param num Angle
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String getSin(double num){
        double res = Math.sin(Math.toRadians(num));
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** A method that returns the ribbon that is the result of taking the cosine of an angle.
     * @param num Angle
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String getCos(double num){
        double res = Math.cos(Math.toRadians(num));
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** A method that returns the tape that is the result of taking the tangent of an angle.
     * @param num Angle
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String getTg(double num){
        double res = Math.tan(Math.toRadians(num));
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** A method that returns the ribbon that is the result of taking the cotangent of an angle.
     * @param num Angle
     * @return If the result is an integer, the output is an int number, otherwise - double.
     */
    public static String getCtg(double num){
        double res = 1 / Math.tan(Math.toRadians(num));
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    private static final DecimalFormat decimalFormat = new DecimalFormat("#.###"); // Rounding the number to thousands
}
