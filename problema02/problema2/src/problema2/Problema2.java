/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author utpl
 */

import java.util.Locale;
import java.util.Scanner;

public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    entrada.useLocale(Locale.US);
    
    double peaje;
    String tipoDescripcion;
    double valorVehiculo;
    int tipoVehiculo;
    String propietario;
    
    System.out.println("Ingrese el nombre del propietario");
    propietario = entrada.nextLine();
    
    System.out.println("Seleccione el tipo de vehiculo");
    System.out.println("1. Vehiculo liviano particular");
    System.out.println("2. Vehiculo grande particular");
    System.out.println("3. Taxi");
    System.out.println("4. Bus urbano");
    tipoVehiculo = entrada.nextInt();
    
    System.out.println("Ingrese el valor del vehiculo:");
    valorVehiculo = entrada.nextDouble();
    
    switch (tipoVehiculo) {
        case 1:
            peaje = (valorVehiculo * 0.0001) + 2;
            tipoDescripcion = "Vehiculo liviano particular";
            break;
            
        case 2:  
            peaje = (valorVehiculo * 0.0002) + 2.5;
            tipoDescripcion = "Vehiculo grande particular";
            break;
            
        case 3:
            peaje = (valorVehiculo * 0.0004) + 1.5;
            tipoDescripcion = "Taxi";
            break;
            
        case 4:
            peaje = (valorVehiculo * 0.0005) + 2.2;
            tipoDescripcion = "Bus urbano";
            break;
            
        default:
            System.out.println("Tipo de vehiculo no valido");
            return;
    }
    
    System.out.println("\nPeaje BUEN VIA");
    System.out.println("\tPropietario: %s\n" + propietario);
    System.out.println("Tipo: %s\n" + tipoDescripcion);
    System.out.println("\tValor: $%.2f\n" + valorVehiculo);
    System.out.println("\tPeaje: $%.2f\n" + peaje);
    }
    
}
