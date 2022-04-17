package day11_Switch_Scanner;

public class CalculatorTask {

    public static void main(String[] args) {

        double n1 = 200.5,
                n2 = 10.5;

        char operator = '+';
        boolean valid = operator == '+' || operator == '-' || operator =='*' || operator == '/';

        if (valid) {
            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '/':
                    System.out.println(n1 / n2);
                    break;

                default:
                    System.out.println(n1 * n2);
                    break;
            }


        } else {
            System.out.println("invalid operator" + operator);
        }

    }

    public static class CalledBrowser {
        public static void main(String[] args) {

            String browserName = "opera";

            String result = " ";


            switch (browserName) {
                case "chrome":
                    result = "Chrome Browser is Selected";
                    break;
                case "firefox":
                    result = "firefox Browser is Selected";
                    break;
                case"opera":
                    result = "Opera Browser is Selected";
                    break;
                case "safari":
                    result = "Safari Browser is Selected";
                    break;
                case "edge":
                    result = "Edge Browser is Selected";
                default:
                result = "Invalid Browser Name";
            }

            System.out.println(result);
        }
    }
}