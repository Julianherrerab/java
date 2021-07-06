package model;

public class Wallet {

    public static final  int CAPACIDAD_MAXIMA =1000000; // static es una constante final para un valor inicial, nombre mayuscula con guin bajo

    private int saldo;
    private boolean tieneLimite;
    private int meta;


    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
        meta = 0;
    }
   
    public int getSaldo() {
        return saldo;
    }

    public boolean getTieneLimite() {
        return tieneLimite;
    }

    public verificarMeta() {
        if(meta == 0 || meta > saldo){
            return false;
        }
        return true;

    }

    public boolean establecerMeta(int value){
        if(value == 0){
            meta = value;
            return true;
        }
        if(value < 0 || value <= saldo || (value > CAPACIDAD_MAXIMA && tieneLimite)){
            return false;
        }
        meta = value;
        return true;

    }

    public void setTieneLimite(boolean newTieneLimite) {
        this.tieneLimite = newTieneLimite;
    }

    public String safeMoney(int value){
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite) {
           return "no se puede superar el limite " + CAPACIDAD_MAXIMA;
        }
        saldo += value; // saldo = saldo + value 
        if(verificarMeta()){System.out.println("has cumplido la meta");}
        return " Transaccion exitosa, nuev saldo " + saldo;
    }

    public String getMoney(int value){
       
        if (saldo <= value) {
            return "saldo Insuficiente";
        }
            saldo -= value;
            return "Transaccion exitosa, nuevo saldo " + saldo; 
        }
 
    public String breakLimit(){
        if(!tieneLimite){
            return "Tu cuenta no tiene limites";
        }
        if (saldo >= 10000) {
            saldo -= 10000;
            setTieneLimite(false);
            return "Has roto los limites";
        }
        return "No tiene saldo suficiente" ;

    }

    public boolean establecerMeta(int value){
       if value == 0;
       return "no hay meta asignada";
       if value <= 0;
       return "No puede establecer meta negativa";
       if saldo >= value;
       return "transaccion exitosa"

    }

}
