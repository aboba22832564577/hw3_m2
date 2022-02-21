package com.company;

public class Main {

    public static void main(String[] args)  {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(20000);
        System.out.println("Ваш счет пополнился. Ваш текущий счет - " + bankAccount.Amount);

        while (true){
            try {
               bankAccount.WithDraw(6000);
                System.out.println("Вы сняли со счета деньги. Ваш текущий счет - " + bankAccount.getAmount());
            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage());
                System.out.println("Ваш текущий счет - " + bankAccount.Amount);
                System.out.println("Мы сняли и всю ту оставшуюся сумму с вашего счета в размере - " + bankAccount.Amount + " сом");
                double счет = bankAccount.Amount- bankAccount.getAmount();
                System.out.println("Ваш текущий счет - " + счет);
                break;
            }
        }
    }
}
