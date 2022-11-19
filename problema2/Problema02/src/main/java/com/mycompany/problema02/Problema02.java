/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author DETPC
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables
        int cantidad;
        double precio;
        double descuento;
        double total;

        //proceso
        System.out.println("Ingrese la cantidad que se requiere");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio unitario");
        precio = entrada.nextDouble();

        total = cantidad * precio;

        if (cantidad > 50) {
            descuento = (total * 0.15);
            total = descuento - total;

        }
        System.out.println("Su total a cancelar es");
        System.out.println(total);
    }
}
