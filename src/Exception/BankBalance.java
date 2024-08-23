package Exception;

public class BankBalance {

    double balance;

    public BankBalance(double intialBalance){
balance=intialBalance;
    }
    public  void withdraw(double amount) {

        if(balance<amount){

            throw new CustomEx("Insufficient balance");
        }else {
            balance = balance-amount;
            System.out.println("withdrwal successfully and remain balance is :"+balance);

        }

    }

    public static void main(String[] args)  {
        BankBalance account = new BankBalance(3000);

        try {
            account.withdraw(1500);
        }catch (CustomEx e){

            System.out.println("insufficient found"+e.getMessage());
        }
    }



}
