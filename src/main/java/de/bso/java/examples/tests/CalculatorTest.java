package de.bso.java.examples.tests;

class CalculatorTest {

    public static void main(String[] args) {
        boolean result = true;
        result &= testAddition();
        result &= testSubstraction();
        System.out.println("Overall Result: " + result);
    }

    static Calculator calculator = new Calculator();

    static private boolean testAddition() {
        boolean result = true;


        if (calculator.addition(0, 0) != 0) {
            System.out.println("Error in: calculator.addition(0, 0), expected: 0");
            result = false;
        }

        if (calculator.addition(-1, 1) != 0) {
            System.out.println("Error in: calculator.addition(-1, 1), expected: 0");
            result = false;
        }

        if (calculator.addition(Integer.MAX_VALUE - 1, 1) != Integer.MAX_VALUE - 1) {
            System.out.println("Error in: calculator.addition(Integer.MAX_VALUE - 1, 1), expected: Integer.MAX_VALUE - 1");
            result = false;
        }

        if (calculator.addition(Integer.MIN_VALUE, 1) != Integer.MIN_VALUE +1) {
            System.out.println("Error in: calculator.addition(Integer.MIN_VALUE, 1), expected: Integer.MIN_VALUE + 1");
            result = false;
        }
        return result;
    }

    static private boolean testSubstraction() {
        boolean result = true;
        if (calculator.substraction(1, 0) != 1) {
            System.out.println("Error in: calculator.substraction(1, 0) != 1");
            result = false;
        }


        if (calculator.substraction(1, 1) != 0) {
            System.out.println("Error in: calculator.substraction(1, 1) != 0");
            result = false;
        }
        return result;
    }

}