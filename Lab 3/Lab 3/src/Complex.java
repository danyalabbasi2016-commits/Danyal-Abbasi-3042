
public class Complex extends Simple {

    public Complex() {
        super();
    }

    public Complex(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void add() {
        if (num1 > 0 && num2 > 0) {
            System.out.print("[Complex] ");
            super.add();
        } else {
            System.out.println("Error: Cannot add - numbers must be positive!");
        }
    }

    @Override
    public void sub() {
        if (num1 > 0 && num2 > 0) {
            System.out.print("[Complex] ");
            super.sub();
        } else {
            System.out.println("Error: Cannot subtract - numbers must be positive!");
        }
    }

    @Override
    public void mul() {
        if (num1 > 0 && num2 > 0) {
            System.out.print("[Complex] ");
            super.mul();
        } else {
            System.out.println("Error: Cannot multiply - numbers must be positive!");
        }
    }

    @Override
    public void div() {
        if (num1 > 0 && num2 > 0) {
            System.out.print("[Complex] ");
            super.div();
        } else {
            System.out.println("Error: Cannot divide - numbers must be positive!");
        }
    }

    // Additional method to show all operations
    public void showAllOperations() {
        System.out.println("\nPerforming all operations:");
        add();
        sub();
        mul();
        div();
    }
}