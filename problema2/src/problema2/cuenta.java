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
public class cuenta extends transferencia{
     private String entidad;
     private int sucursal;
     private float numeroCuenta;
     
     public void transferir(float importe, String cuentaDestino){
         System.out.println("Transferencia a cuenta...");
     }
     
    public void retirar(){
         System.out.println("retiro de cuenta...");
    }
    public void ingresar(){
         System.out.println("ingresar a cuenta...");
    }
}
