public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Attempting to access elements in the array...");

        try {
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Accessing index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access an index that is out of bounds!");
        }

        System.out.println("Program continues after handling the exception.");
    }
}

// Attempting to access elements in the array...
// Accessing index 0: 1
// Accessing index 1: 2
// Accessing index 2: 3
// Accessing index 3: 4
// Accessing index 4: 5
// Exception caught: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
// You tried to access an index that is out of bounds!
// Program continues after handling the exception.
