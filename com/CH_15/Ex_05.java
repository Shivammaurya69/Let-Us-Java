package com.CH_15;

class Customer{
    private String name;
    private int accno, balance;
    public Customer(String n, int a, int b){
        name=n;
        accno=a;
        balance=b;
    }
    public void withdraw (int amt) throws BankException{
        if (balance-amt<= 500){
            throw new BankException(accno, balance);
        }
        balance-=amt;
    }
}
class BankException extends Exception{
    private int acc, bal;
    public BankException (int a, int b){
        this.acc=a;
        this.bal=b;
    }
    public void inform() {
        System.out.println("Acc. No. :"+acc);
        System.out.println("Balance :" +bal);
    }
}
public class Ex_05 {
    public static void main(String[] args) {
        try{
            Customer c= new Customer("Rahul",2453, 900 );
            c.withdraw(450);
        }
        catch (BankException be){
            System.out.println("Transaction Failed");
            be.inform();
        }
    }
}
