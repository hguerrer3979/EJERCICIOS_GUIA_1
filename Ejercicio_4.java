/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Problem statement_EJERCICIO_4_SERIE_1
 * 4. Number of zeroes in n!
 *Given a number n, find out the number of zeroes at the end of decimal
 *representation of n!
 *Input
 *First line of input will contain T = number of test cases. Next T lines will each
 *have one number n where 1<=n<=10^9. Find out number of trailing zeroes
 *(zeroes at the end) in factorial of this number n.
 *Output
 *There should be one line for each test case printing the number of trailing
 *zeroes in factorial of the given number.
 */
package ejercicios;

/**
 *
 * @author HARBEY_GUERRERO
 */
import java.util.Scanner;
import java.util.*;
public class Ejercicio_4 {
     public static void main (String[] args)
    {
    Scanner teclado = new Scanner(System.in);
        int f = 1, n;
        int ceros = 0;
        System.out.print("Ingrese número: ");
        n = teclado.nextInt();
        for (int i = 1; i <= n; ++i) {
            f = f * i;
        }
        System.out.println("El factorial de " + n + " es " + f);

        String[] sNums = Integer.toString(f).split("");
        for (int i = sNums.length - 1; i >= 0; i--) {
            String num = sNums[i];
            if (num.equals("0")) {
                ceros++;
            } else {
                break;
            }
        }

        System.out.println("Cantidad de cero es " + ceros);
    }
}
