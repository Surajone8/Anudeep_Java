public class MultipleCatchBlocksExample {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();

            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed!");
        }
    }
}

/* Output:
NullPointerException caught: java.lang.NullPointerException
Finally block executed!
*/
