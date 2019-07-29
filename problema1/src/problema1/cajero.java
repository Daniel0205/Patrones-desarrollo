/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author melissa
 */
public class cajero {
    
    private void transferenciaCuenta(){
    
    transferencia transferencia = new cuenta();
    transferencia.transferir(0, "cuentaDestino");
    }
    
    private void tranferenciaTarjeta(){
    
    transferencia transferencia = new tarjeta();
    transferencia.transferir(0, "tarjetaDestino");
    
    }
    
}
