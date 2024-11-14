/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;
import java.util.Locale;/**
 *
 * @author utpl
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double val1;
        double val2;
        double resultado;

        String operacion;

        System.out.println("Ingrese el primer valor");
        val1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo valor");
        val2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el simbolo de la operacion");
        operacion = entrada.nextLine();

        if (val1 > val2) {
            switch (operacion) {
                case "+":
                    resultado = val1 + val2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case "-":
                    resultado = val1 - val2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case "*":
                    resultado = val1 * val2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case "/":
                    resultado = val1 / val2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case "%":
                    resultado = val1 % val2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case "^":
                    resultado = Math.pow(val1, val2);
                    System.out.println("El resultado es: " + resultado);
                    break;

                }
        }else{    
                    System.out.println("Valores fuera de rango");
                    
            }

        }
    }


