/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *3. Add two numbers
 *Problem statement_EJERCICIO_3_SERIE_1
 *Given two numbers, add them and print their sum
 *Input
 *Input contains two numbers between 1 and 100, separated by a space
 *Output
 *Print the sum of the 2 numbers
 */
package ejercicios;

/**
 *
 * @author HARBEY_GUERRERO
 */
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        String numero = "";

        System.out.print("\n ingrese dos numeros serparados por un espacio \n ");
        numero = entrada.nextLine();
        String[] datos = numero.split(" ");
        for (int i = 0; i < datos.length; i++) {
            suma = suma + Integer.valueOf(datos[i]);
        }
        System.out.print("La suma de los dos numeros es: " + suma + " \n");
    }
}
