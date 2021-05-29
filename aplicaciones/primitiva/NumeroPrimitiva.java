package aplicaciones.primitiva;

import java.util.Random;

/** NumeroPrimitiva: representa un numero entero
 *  entre el 1 y el 49, elegido aleatoriamente.
 *
 *  @version Febrero 2019
 */

public class NumeroPrimitiva implements Comparable <NumeroPrimitiva> {
    
    // Un NumeroPrimitiva TIENE UN int en el intervalo [1, 49]
    private int numero;
    
    /**
     * Crea un NumeroPrimitiva eligiendo aleatoriamente  
     * un numero del intervalo entero [1, 49].
     */
    public NumeroPrimitiva() {
        Random r = new Random();
        numero = r.nextInt(49) + 1;
    }
    
    /**
     * Comprueba si un (this) NumeroPrimitiva es igual a otro, 
     * i.e. si ambos tienen el mismo valor
     * 
     * @param num el otro NumeroPrimitiva.
     * @return true si this y otro tienen el mismo valor 
     *              y false en caso contrario
     */

    public boolean equals(Object num) {
       if (num instanceof NumeroPrimitiva){
           if (this.numero == ((NumeroPrimitiva) num).numero){
               return true;
           }else{
               return false;
           }
       }
        return false;
    }
    
    /**
     * Compara un (this) NumeroPrimitiva con otro.
     * 
     * @param num el NumeroPrimitiva a comparar con this.
     * @return int < 0 si this es menor que otro, 
     *         int > 0 si this es mayor que otro
     *          0      si this y otro son iguales
     */

    @Override
    public int compareTo(NumeroPrimitiva num) {
        if(this.numero < num.numero){
            return -1;

        }else if (this.numero > num.numero){
            return 1;

        }else{
            return 0;
        }
    }
    
    
    /**
     * Devuelve el String que representa un (this) NumeroPrimitiva 
     * en formato texto
     * 
     * @return el String con el NumeroPrimitiva en formato texto. 
     */
    public String toString() {
        return Integer.toString(numero);
    }


}
