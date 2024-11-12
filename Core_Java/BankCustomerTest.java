class BankCustomer {
    int acno;
    String atype;
    double amt;

    BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    BankCustomer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0;
    }

    BankCustomer(int acno) {
        this.acno = acno;
        this.atype = "Saving";
        this.amt = 0;
    }

    void display() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }
}

public class BankCustomerTest {
    public static void main(String[] args) {
        BankCustomer customer1 = new BankCustomer(101, "Saving", 1000);
        BankCustomer customer2 = new BankCustomer(102, "Current");
        BankCustomer customer3 = new BankCustomer(103);

        customer1.display();
        customer2.display();
        customer3.display();
    }
}

/* Output:
Account Number: 101
Account Type: Saving
Amount: 1000.0
Account Number: 102
Account Type: Current
Amount: 0.0
Account Number: 103
Account Type: Saving
Amount: 0.0
*/
