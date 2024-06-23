import java.util.Scanner;
class Customer
{
   
    public static void main(String args[])
    {
        ATM ob=new ATM();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name");
            String name=sc.nextLine();
            while(true){
            System.out.println("------------------------------------------------------------\n");
            System.out.println("1-Deposit");
            System.out.println("2-Withdraw");
            System.out.println("3-Check Balance");
            System.out.println("4-Exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter Amount :");
                    double amount=sc.nextInt();
                    ob.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter Amount :");
                    double amt=sc.nextInt();
                    ob.withdrawal(amt);
                    break; 
                case 3:
                    System.out.println("\nName : "+name);
                    ob.checkBalance();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
   }
        }}
}