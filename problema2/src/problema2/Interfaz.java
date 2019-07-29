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
public interface Interfaz{
    public void ejecutarAccion(){
        Fachada fachada = new Fachada();
        fachada.transferir(importe, cuentaDestino);
    };
}
