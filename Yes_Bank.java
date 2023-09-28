package Banking_Design;

import java.util.Scanner;

public class Yes_Bank implements RBI{
    int AccNo;
    String password;
    int balance;
    public static final int roi=14;
    Yes_Bank(){};
    Yes_Bank( int AccNo,String password,int balance){
        this.AccNo=AccNo;
        this.password=password;
        this.balance=balance;

    }
    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(String password, int money) {
        if(this.password.equals(password)){
            balance+=money;
            return "Your bank balance after adding the money is "+balance;
        }
        return "Wrong Password Entered";
    }

    @Override
    public String withdrawMoney(String password, int money) {
        if(this.password.equals(password)){
            if(balance-money>1000){
                return "You Have Successfully withdrawn Rupees "+money+"\n Your Remaining balance is "+(balance-money)+"\n VISIT AGAIN :)";
            }
        }
        return "Insufficient Balance";
    }

    @Override
    public void changePassword(String password) {
        if(this.password.equals(password)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new Password");
            String newPass = sc.nextLine();
            this.password=newPass;
            System.out.println("Your Password have been changed successfully");
            sc.close();
        }
    }

    @Override
    public double simpleInterest(int years) {
        return (double) (balance * years * roi) /100;
    }
}
