
class ATM{
    double balance;
    ATM(){
        balance=0.0;
    }
    void withdrawal(double amount)
    {
        if(amount>balance)
        System.out.println("Withdrawal not possible, Low account balance!!!");
        else
        balance=balance-amount;
    }
    void deposit(double amount)
    {
        balance=balance+amount;
    }
    void checkBalance()
    {
        System.out.println("Your Current Account Balance: "+balance);
        System.out.println("\n");
    }
}

