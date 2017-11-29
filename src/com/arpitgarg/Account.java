package com.arpitgarg;
class Account extends User {

    Account(String nam, float bal, int accn){
        Name = nam;
        AccBal = bal;
        AccNo = accn;
        TransacHist = new Transaction[5];
        i=0;
    }

    void deposit(float amount){
        AccBal = AccBal + amount;
        System.out.println("New Balance after depositing: "+ AccBal);
        Transaction t = new Transaction(amount, this.AccNo, this.AccNo, AccBal, "Deposit");
        TransacHist[i] = t;
        i++;
    }

    void withdraw(float amount){
        if((AccBal - amount) >= 0){
            AccBal = AccBal - amount;
            System.out.println("New Balance after withdrawing: "+ AccBal);
            Transaction t = new Transaction(amount, this.AccNo, this.AccNo, AccBal, "Withdrawal");
            TransacHist[i] = t;
            i++;
        }
        else{
            System.out.println("Not sufficient funds.");
        }
    }

    void transfer(int toAccNo, float amount){
        if((AccBal - amount) >= 0) {
            AccBal = AccBal - amount;
            System.out.println("Transfer successful to: "+ toAccNo+". New Balance: :" + AccBal);
            Transaction t = new Transaction(amount, this.AccNo, toAccNo, AccBal, "Transfer");
            TransacHist[i] = t;
            i++;
        }
        else{
            System.out.println("Not sufficient funds.");
        }
    }

    void GetTransacHist(){
        for(int j =0 ; j < TransacHist.length; j++){
            if(TransacHist[j] != null) {
                System.out.println("Amount :" + TransacHist[j].amount);
                System.out.println("Account Number :" + TransacHist[j].AccNo);
                System.out.println("Date :" + TransacHist[j].date.toString());
                System.out.println("To Account Number :" + TransacHist[j].toAccNo);
                System.out.println("Account Balance :" + TransacHist[j].AccBal);
                System.out.println("Transaction Type :" + TransacHist[j].type);
                System.out.println();
            }
        }

    }
    void GetTrasacHistFilter(String type){
        int apoint= 0;
        Transaction [] a = new Transaction[5];
        for (int j = 0; j<TransacHist.length; j++){
            if(TransacHist[j] != null) {
                if ( TransacHist[j].type == type) {
                    a[apoint] = TransacHist[j];
                    apoint++;
                }
            }
        }
        for(int j =0 ; j < a.length; j++) {
            if (a[j] != null) {
                System.out.println("Amount :" + a[j].amount);
                System.out.println("Account Number :" + a[j].AccNo);
                System.out.println("Date :" + a[j].date.toString());
                System.out.println("To Account Number :" + a[j].toAccNo);
                System.out.println("Account Balance :" + a[j].AccBal);
                System.out.println("Transaction Type :" + a[j].type);
                System.out.println();
            }
        }
    }
}