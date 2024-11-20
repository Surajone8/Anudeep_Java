public class SmallestInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 36, 2, 10, 77, 05, 99};
        int smallest = numbers[0];

        for (int i = 0;i<numbers.length;i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}

/* Output:
The smallest element in the array is: 2
*/
