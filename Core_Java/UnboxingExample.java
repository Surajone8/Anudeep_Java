public class UnboxingExample {
    public static void main(String[] args) {
        Integer wrapperInt = 30;

        int primitiveInt = wrapperInt;

        System.out.println("Wrapper object value: " + wrapperInt);
        System.out.println("Primitive value: " + primitiveInt);
    }
}

/* Output:
Wrapper object value: 30
Primitive value: 30
*/
