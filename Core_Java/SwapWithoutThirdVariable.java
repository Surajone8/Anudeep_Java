public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

// Output:
// Before swapping: a = 6, b = 8
// After swapping: a = 8, b = 6
