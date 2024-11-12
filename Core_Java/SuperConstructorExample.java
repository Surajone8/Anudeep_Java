class Parent {
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child class constructor called");
    }
}

public class SuperConstructorExample {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

/* Output:
Parent class constructor called
Child class constructor called
*/
