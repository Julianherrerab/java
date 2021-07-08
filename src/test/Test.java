package test;

import model.client;


public class Test {

   public static void main(String[] args) {
       Test iniciarPruebas = new Test();
       iniciarPruebas.escenarioClient();
   }
    
    public void escenarioClient(){
        client cliente1 = new client("Esteban");
        boolean test1 = assertEquals("Esteban", cliente1.getNombre());
        // (condition)? responseTrue: responseFalse
        System.out.println((test1)? "paso la prueba de nombre":"Error el nombre no es igual" );
    }


    public boolean assertEquals(String expected, String received){
        if (expected.equalsIgnoreCase(received)){
            return true;
    }
    return false;

}


}
