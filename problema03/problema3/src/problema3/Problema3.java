/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author utpl
 */

import java.util.Scanner;
import java.util.Locale;

public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int tipoEmpleado;
        double sueldoInicial;
        double porcentajeIncremento;
        double nuevoSueldo;
        double incremento;
        
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de empleado (1/5):");
        tipoEmpleado = entrada.nextInt();
        
        System.out.println("Ingrese el sueldo inicial del empleado:");
        sueldoInicial = entrada.nextDouble();
        
        switch (tipoEmpleado) {
            case 1: 
                porcentajeIncremento = 0.05;
                break; 
                
            case 2: 
                porcentajeIncremento = 0.07;
                break;     
                
            case 3: 
                porcentajeIncremento = 0.09;
                break;     
                
            case 4: 
                porcentajeIncremento = 0.12;
                break;     
            
            default: 
                porcentajeIncremento = 0.15;
                break;   
                    
        }
    
        incremento = sueldoInicial * porcentajeIncremento;
        nuevoSueldo = sueldoInicial + incremento;
        
        System.out.printf("Reporte del Empleado::\n", args);
        System.out.printf("Nombre: %s\n", nombre, args);
        System.out.printf("Sueldo inicial: $%.2f\n", incremento, args);
        System.out.printf("Incremento de sueldo: $5.2f\n", incremento, args);
        System.out.printf("Nuevo sueldo: $%.2f\n", nuevoSueldo, args);
    }
    
}
