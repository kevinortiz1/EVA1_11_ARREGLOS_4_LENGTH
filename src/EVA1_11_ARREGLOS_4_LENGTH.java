/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 */
public class EVA1_11_ARREGLOS_4_LENGTH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiDatos[] =  new int [5];
        for (int i = 0; i < aiDatos.length; i++) {
           aiDatos[i] = (int) (Math.random() * 10);
        } 
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + i + "] = " + aiDatos[i]);
        }
        //COPIA TEMPORAL DE LOS DATOS
        int aiCopia[]  = new int [5];
        
        for (int i = 0; i < aiCopia.length; i++) {
            aiCopia[i] = aiDatos[i];
        }
        //SE LLENA EL ARREGLO DE NUEVO TAMAÑO CON LA COPIA TEMPORAL
        aiDatos = new int [10];
        for (int i = 0; i < aiCopia.length; i++) {
            aiDatos[i] = aiCopia[i];
        }
        System.out.println("DESPUES DE DARLE TAMAÑO 10");
         for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + i + "] = " + aiDatos[i]);
        }
        
    }
    
    
    
}
