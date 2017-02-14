/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inserccion;

/**
 *
 * @author isrm_
 */
public class Ordenador {
    
    
    public static void OrdenarInserccion(int[] array)
    {
        int aux;
        int cont1;
        int cont2;
        
        for(cont1=1; cont1<array.length; cont1++)
        {
            aux=array[cont1];
            for(cont2=cont1-1; cont2>=0 && array[cont2]>aux; cont2--)
            {
                array[cont2+1]=array[cont2];
                array[cont2]=aux;
            }
        }
    }
    
}
