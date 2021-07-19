package model;

public class Client extends User {
    private Wallet wallet;

    public Client(String pNombre) {
        super();
        wallet = new Wallet();
        setNombre(pNombre);
    }

    /**
     * 
     * 
     * @return
     */

    public Wallet getWallet() {
        return wallet;
    }
    
    public String toString(){
        return "soy un cliente";
    }
}