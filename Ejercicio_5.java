/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Problem statement_EJERCICIO_5_SERIE_1 
 * 5. Verify Prime Number
 *Problem statement
 *Given a number, verify whether its prime or not
 *Input
 *First line of input will contain a number N = number of test cases. Next N lines will
 *contain number n as test case where 0<=n<=1000000000
 *Output
 *For each input case, print "PRIME" if the number is prime, else print "NOT PRIME"
 *(quotes for clarity)
 */
package ejercicios;

/**
 *
 * @author HARBEY_GUERRERO
 */
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args )
    {
         Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();
         int num2 = num-1;
         while((num%num2) != 0) {
             num2--;
            }
            if(num2 == 1) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
} 
}
