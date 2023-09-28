package Banking_Design;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello dear Customer welcome to the BANKING WORLD");
        System.out.println("Choose the Bank you are interested to create your Account in ");
        System.out.println("1) Kotak Mahindra Bank");
        System.out.println("2) Yes Bank");
        Scanner sc = new Scanner(System.in);
        String Bank = sc.nextLine();
        RBI bank=null;
        if(Bank.equals("Kotak Mahindra")){
            System.out.println("*************** Welcome to KOTAK MAHINDRA **************");
            int accNO =(int)(Math.random()*1000000000);
            System.out.println("The Account No. alloted to you is "+accNO);
            System.out.println("Enter the Password Of your choice");
            String password = sc.nextLine();
            System.out.println("Enter the initial amount Of Money you want to add");
            int money = sc.nextInt();
            bank = new Kotak_Mahindra(accNO,password,money);
        }else if(Bank.equals("Yes Bank")){
            System.out.println("*************** Welcome to YES BANK ***************");
            int accNO =(int)(Math.random()*1000000000);
            System.out.println("The Account No. alloted to you is "+accNO);
            System.out.println("Enter the Password Of your choice");
            String password = sc.nextLine();
            System.out.println("Enter the initial amount Of Money you want to add");
            int money = sc.nextInt();
            bank = new Yes_Bank(accNO,password,money);

        }
        String curr_password =null;
        System.out.println("*************** Services Offered by the Bank ****************");
        System.out.println(" 1-> Add Money \n 2-> Withdraw Money \n 3-> Change Password \n 4-> Check rate of Interest \n 5-> Check Balance \n 6-> Exit" );
        int option = sc.nextInt();
        Scanner scanner = new Scanner(System.in);
        if(option==1){
            System.out.println("Enter your Password ");
            curr_password = scanner.nextLine();
            System.out.println("Enter the amount you want to deposit");
            int amount = sc.nextInt();
            String addedMoney = bank.addMoney(curr_password,amount);
            System.out.println(addedMoney);
        }else if(option == 2){
            System.out.println("Enter your Password ");
            curr_password = scanner.nextLine();
            System.out.println("Enter the amount you want to withdraw");
            int amount = sc.nextInt();
            String withdrawnMoney = bank.withdrawMoney(curr_password,amount);
            System.out.println(withdrawnMoney);
        }else if(option==3){
            System.out.println("Enter your current password ");
            bank.changePassword(scanner.nextLine());
        }else if(option==4){
            System.out.println("Enter the year");
            double year =bank.simpleInterest(scanner.nextInt());
            System.out.println("The Simple Interest is "+year);
        }
        else if(option==5){
            int balance = bank.checkBalance();
            System.out.println("Your bank balance is "+ balance);
        }else{
            System.out.println("Thankyou VISIT AGAIN :)");
        }

    }
}