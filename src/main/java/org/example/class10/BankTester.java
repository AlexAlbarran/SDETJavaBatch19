package org.example.class10;

public class BankTester {
    public static void main(String[] args) {

        BankUser AlexObj=new BankUser();
        AlexObj.fullName="Alex";
        AlexObj.isSavingsAcc=false;
        AlexObj.accountBalance=30000;
        AlexObj.userName="Alex";
        AlexObj.password="Pass123";

        System.out.println(AlexObj.fullName);
        System.out.println(AlexObj.age);
        System.out.println(AlexObj.accountBalance);
        System.out.println(AlexObj.password);

        AlexObj.deposit();
        AlexObj.transferFunds();


    }
}
