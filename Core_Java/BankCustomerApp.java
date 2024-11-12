class BankCustomer {
    int acno;
    String atype;
    double amt;

    BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    void display() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }
}

public class BankCustomerApp {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer(101, "Saving", 1000.50);
        customer.display();
    }
}

/* Output:
Account Number: 101
Account Type: Saving
Amount: 1000.5
*/
