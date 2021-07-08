package model;

public class client extends User {
    private Wallet wallet;

    public client(String nNombre) {
        super();
        wallet = new Wallet();
        setNombre(nNombre);
    }

    public Wallet getWallet() {
    return wallet;
    }


}
