package com.arpitgarg;


class User{
    String Name;
    float AccBal;
    int AccNo;
    Transaction[] TransacHist;
    int i;
    User(){

    }

    User(String nam, int bal, int accn){
        Name = nam;
        AccBal = bal;
        AccNo = accn;
        TransacHist = new Transaction[5];
        i = 0;
    }

    void display(){
        System.out.println("Account details: ");
        System.out.println("Name: "+ Name);
        System.out.println("Balance: " + AccBal);
        System.out.println("Account Number: " + AccNo);

    }

}