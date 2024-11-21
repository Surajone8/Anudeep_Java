public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed!");
        }
    }
}

/* Output:
Exception caught: java.lang.ArithmeticException: / by zero
Finally block executed!
*/
