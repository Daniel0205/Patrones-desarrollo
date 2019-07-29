/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author melissa
 */
public class tarjeta extends transferencia{
    
    private int numero;
    
     public void transferir(float importe, String cuentaDestino){
         System.out.println("Transferencia a tarjeta...");
     }

    public void retirar(){
         System.out.println("Retiro de tarjeta...");
    }

    public void ingresar(){
         System.out.println("ingresar a cuenta...");
    }     

}
