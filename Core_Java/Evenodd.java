public class Evenodd {
    public static void main(String[] args) {
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result);
    }
}

// Output:
// The number 10 is Even
