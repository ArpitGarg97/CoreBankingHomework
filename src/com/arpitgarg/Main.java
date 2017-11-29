package com.arpitgarg;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        int action;
        String Name;
        float AccBal = 0;
        int AccNo;
        int flag = 0;
        Account A = new Account("name", 0, 0);

        do{
            System.out.println("Choose the action to be performed: ");
            System.out.println(" 1) Create Account.\n 2) Deposit Cash.\n 3) Withdraw Cash.\n4) Transfer Money.\n 5) Transaction History.\n 6) Transaction with Filters \n 7) Press any other key to quit.");
            action = s.nextInt();

            switch(action){

                case 1:
                    System.out.println("Enter your name: ");
                    Name = s.next();
                    Random rand = new Random();
                    AccNo = rand.nextInt(10000);
                    A = new Account(Name, 0, AccNo);
                    break;

                case 2:
                    System.out.println("Amount to be deposited: ");
                    float amount = s.nextInt();
                    A.deposit(amount);
                    break;

                case 3:
                    System.out.println("Amount to be withdrawn: ");
                    amount = s.nextInt();
                    A.withdraw(amount);
                    break;

                case 4:
                    System.out.println("Account Number to be Transferred to: ");
                    int toAccNo = s.nextInt();
                    System.out.println("Amount to be Transferred to "+toAccNo+": ");
                    amount = s.nextFloat();
                    A.transfer(toAccNo,amount);
                    break;

                case 5:
                    A.GetTransacHist();
                    break;

                case 6:
                    System.out.println("Type of Transaction: 1.Withdrawal, 2. Deposit, 3. Transfer");
                    int option = s.nextInt();
                    String type = "Withdrawal";
                        if (option == 1){
                             type= "Withdrawal";
                        }
                        else if (option == 2){
                            type = "Deposit";
                        }
                        else if (option == 3){
                            type = "Transfer";
                        }
                        A.GetTrasacHistFilter(type);
                    break;

                case 7:
                    flag = 1;
                    break;

            }
        }while(flag == 0);
    }
}




