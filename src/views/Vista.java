package views;

import model.Wallet;

public class Vista {

    public static void main2(String[] args) {
        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        wallet1.getSaldo();

        System.out.println(wallet1.safeMoney(200000));
        System.out.println(wallet1.safeMoney(300000));
        System.out.println(wallet1.breakLimit());
        System.out.println(wallet1.safeMoney(600000));
        System.out.println(wallet1.getSaldo());
        System.out.println(wallet2.getSaldo());
        System.out.println(wallet2.establecerMeta(1100000));
        System.out.println(wallet1.establecerMeta(900000));
        System.out.println(wallet1.establecerMeta(1900000));
        System.out.println(wallet1.safeMoney(1200000));
    }
}
