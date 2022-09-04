package advanced.threads.bankaccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount("IBAN3298844", 500.0d );

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i <10000; i++){
                    bankAccount.deposit(1);
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++){
                    bankAccount.withdraw(1);
                }
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        bankAccount.seeBalance();

        System.out.println("Enter amount you want to deposit:");
        bankAccount.deposit(scanner.nextDouble());
        bankAccount.seeBalance();

    }

}
