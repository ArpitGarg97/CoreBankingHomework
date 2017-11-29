package com.arpitgarg;

import java.util.Date;

class Transaction{
    float amount;
    int AccNo;
    Date date;
    int toAccNo;
    float AccBal;
    String type;

    Transaction(float amount, int AccNo, int toAccNo, float AccBal, String type){
        this.date = new Date();
        this.AccNo = AccNo;
        this.toAccNo = toAccNo;
        this.amount = amount;
        this.AccBal = AccBal;
        this.type = type;
    }
}
