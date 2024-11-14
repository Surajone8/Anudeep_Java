public class AutoboxingExample {
    public static void main(String[] args) {
        int primitiveInt = 25;

        Integer wrapperInt = primitiveInt;

        System.out.println("Primitive value: " + primitiveInt);
        System.out.println("Wrapper object value: " + wrapperInt);
    }
}

/* Output:
Primitive value: 25
Wrapper object value: 25
*/
