package Lab03;

public class BankAccount {
    int AccountNumber;
    String AccountName;
    double Balance;

    BankAccount(int Pnumber, String Pname){
        this.AccountNumber = Pnumber;
        this.AccountName = Pname;
    }

    BankAccount(int Pnumber, String Pname, double Pbalance){
        this.AccountNumber = Pnumber;
        this.AccountName = Pname;
        this.Balance = Pbalance;
    }

    public void displayAccDetails(){
        System.out.println("Account Number : " + AccountNumber);
        System.out.println("Account Name : " + AccountName);
        System.out.println("Balance : " + Balance);
    }

    public static void main(String[] args){
        BankAccount acc1 = new BankAccount(10, "Ali");
        acc1.displayAccDetails();

        BankAccount acc2 = new BankAccount(20, "Umar", 50000);
        acc2.displayAccDetails();
    }
}

