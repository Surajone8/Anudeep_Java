public class NarrowingTypeCasting {
    public static void main(String[] args) {
        // Widening (automatic) type casting: int to double
        double myDouble = 9.78;

        // Narrowing (manual) type casting: double to int
        int myInt = (int) myDouble; // Explicit casting

        // Output: Before and After Type Casting
        System.out.println("Original double value: " + myDouble);
        System.out.println("Narrowed int value: " + myInt);
    }
}
