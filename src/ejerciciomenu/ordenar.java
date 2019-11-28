/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomenu;

/**
 *
 * @author TOSHIBA
 */
public class ordenar {
    
    public void ordenarBurbuja(int [] array){
        
        int aux;
        boolean cambio=false;
        
        while (true){
            cambio=false;
            for (int i=1;i<array.length;i++){
                if (array[i]<array[i-1]){
                    aux = array[i];
                    array [i] = array [i-1];
                    array [i-1] = aux;
                    cambio=true;
                }
            }
            if (cambio==false)
                break;
        }
        
    }
    
}