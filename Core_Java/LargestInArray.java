public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 10, 89, 56, 23};
        int largest = numbers[0];

        for (int i = 0;i<numbers.length;i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}

/* Output:
The largest element in the array is: 89
*/
