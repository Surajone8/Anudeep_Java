class Example {
    int value;

    Example(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

class ThisKeywordExample {
    Example example;

    ThisKeywordExample(int value) {
        example = new Example(value);
        example.display();
    }

    public static void main(String[] args) {
        ThisKeywordExample obj = new ThisKeywordExample(10);
    }
}

/* Output:
Value: 10
*/
