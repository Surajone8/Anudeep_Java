package Anudeep_Java.Core_Java;

public class NarrowingTypeCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;

        int myInt = (int) myDouble;

        System.out.println("Original double value: " + myDouble);
        System.out.println("Narrowed int value: " + myInt);
    }
}
