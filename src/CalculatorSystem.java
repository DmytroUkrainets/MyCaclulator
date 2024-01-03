import java.text.DecimalFormat;

/** Клас, який здійснює математичні операції калькулятора. */
public class CalculatorSystem {

    /** Метод, який перевіряє чи є число цілим. */
    public static boolean isInteger(double number) {
        return Math.floor(number) == number;
    }

    /** Метод, який повертає стрічку, яка є результатом додавання двох дійсних чисел.
     * @param num1 Перше число
     * @param num2 Друге число
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String addition(double num1, double num2){
        double res = num1 + num2;
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** Метод, який повертає стрічку, яка є результатом віднімання від першого числа другого.
     * @param num1 Перше число
     * @param num2 Друге число
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String subtraction(double num1, double num2){
        double res = num1 - num2;
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** Метод, який повертає стрічку, яка є результатом множення першого числа на друге.
     * @param num1 Перше число
     * @param num2 Друге число
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String multiplication(double num1, double num2){
        double res = num1 * num2;
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** Метод, який повертає стрічку, яка є результатом ділення першого числа на друге.
     * @param num1 Перше число
     * @param num2 Друге число
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String dividing(double num1, double num2){
        if (num2 != 0) {
            double res = num1 / num2;
            if (isInteger(res)) return "" + (int) res;
            else return "" + decimalFormat.format(res).replace(',', '.');
        } else return "Помилка!";
    }

    /** Метод, який повертає стрічку, яка є результатом отримання кореня від числа.
     * @param num Число з якого береться корінь
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String getRoot(double num){
        if(num >= 0) {
            double res = Math.sqrt(num);
            if (isInteger(res)) return "" + (int) res;
            else return "" + decimalFormat.format(res).replace(',', '.');
        }else return "Невизначено!";
    }

    /** Метод, який повертає стрічку, яка є результатом ділення одиниці на число.
     * @param num Число на яке ділиться одиниця
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String getOneOfSomething(double num){
        if(num != 0) {
            double res = 1 / num;
            if (isInteger(res)) return "" + (int) res;
            else return "" + decimalFormat.format(res).replace(',', '.');
        }else return "Помилка!";
    }

    /** Метод, який повертає стрічку, яка є результатом піднесення числа в другу степінь.
     * @param num Число яке підноситься до другого степеня
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String getPower(double num){
        double res = Math.pow(num, 2.0);
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** Метод, який повертає стрічку, яка є результатом отримання відсотка від числа.
     * @param num1 Число з якого береться відсоток
     * @param num2 Число, яке визначає відсоток від числа
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String getPercent(double num1, double num2){
        double res = (num1 * num2) / 100.0;
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** Метод, який повертає стрічку, яка є результатом отримання синуса кута.
     * @param num Кут
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String getSin(double num){
        double res = Math.sin(Math.toRadians(num));
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** Метод, який повертає стрічку, яка є результатом отримання косинуса кута.
     * @param num Кут
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String getCos(double num){
        double res = Math.cos(Math.toRadians(num));
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** Метод, який повертає стрічку, яка є результатом отримання тангенса кута.
     * @param num Кут
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String getTg(double num){
        double res = Math.tan(Math.toRadians(num));
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    /** Метод, який повертає стрічку, яка є результатом отримання котангенса кута.
     * @param num Кут
     * @return Якщо результатом є ціле число, то на вихід йде число типу int, в іншому разі - double.
     */
    public String getCtg(double num){
        double res = 1 / Math.tan(Math.toRadians(num));
        if (isInteger(res)) return "" + (int) res;
        else return "" + decimalFormat.format(res).replace(',', '.');
    }

    private final DecimalFormat decimalFormat = new DecimalFormat("#.###"); // Заокруглення числа до тисячних
}
