package views;

import model.client;

public class VistaUser {
    public static void main(String[] args) {
        client customer1 = new client("Marco");
        client customer2 = new client("Julian");
        String response = customer1.getNombre();
        String response1 = customer2.getNombre();
        System.out.println(response);
        System.out.println(response1);
        System.out.println(customer1.getWallet().safeMoney(10000));
        String response2 = customer1.getWallet().compararCuenta(customer2.getWallet());
        System.out.println(response2);

    }
}
