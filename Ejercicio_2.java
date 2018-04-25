/*
*To change this license header, choose License Headers in Project Properties.
*To change this template file, choose Tools | Templates
*and open the template in the editor.
*
2. Add three numbers
*Problem statement_EJERCICIO_2_SERIE_1
*Complete the given function which takes 3 integers as input. Return the sum of the
*3 integers as output
*/
package ejercicios;

/**
 *
 * @author HARBEY_GUERRERO
 */
import java.util.Scanner;
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner entrada = new Scanner (System.in);
    int suma = 0;
    int numero = 0;
    
    for (int i = 0; i < 3; i++){
        
        System.out.print(" Ingrese el entero " + (i + 1) + " \n ");
        numero=entrada.nextInt ();
        suma = suma + numero;
    } 
    
    System.out.print ("La suma de los tres numeros es: " + suma);
    }
   
    
}
