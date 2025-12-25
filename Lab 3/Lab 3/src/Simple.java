
public class Simple {
    protected double num1;
    protected double num2;

    public Simple() {
        num1 = 0;
        num2 = 0;
    }

    public Simple(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        double result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public void sub() {
        double result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    public void mul() {
        double result = num1 * num2;
        System.out.println(num1 + " × " + num2 + " = " + result);
    }

    public void div() {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println(num1 + " ÷ " + num2 + " = " + result);
        } else {
            System.out.println("Error: Division by zero!");
        }
    }

    public void displayNumbers() {
        System.out.println("Numbers: " + num1 + " and " + num2);
    }

    // Getters and setters
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}