/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema04;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author DETPC
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //Variables
        int dias;
        double descuento;
        double precio;
        double subtotal;
        double total;
        double descuento2;

        System.out.println("Ingrese la cantidad de dias de hospedaje");
        dias = entrada.nextInt();
        System.out.println("Ingrese el precio diario de la habitacion");
        precio = entrada.nextDouble();

        subtotal = dias * precio;
        total = dias * precio;
        System.out.println("Su subtotal es");
        System.out.println(subtotal);

        if (dias > 5 && dias <= 10) {
            descuento = subtotal * 0.10;
            total = subtotal - descuento;
            System.out.println("Su descuento es del 10%");
            System.out.println("Su total a pagar es de");

        }
        if (dias > 10 && dias < 15) {
            descuento = subtotal * 0.15;
            total = subtotal - descuento;
            System.out.println("Su descuento es de 15%");
            System.out.println("Su total a pagar es de");

        }
        if (dias > 15) {
            descuento = subtotal * 0.20;
            total = subtotal - descuento;
            System.out.println("Su descuento es de 20%");
            System.out.println("Su total a pagar es de");

        }

        System.out.println(total);
    }
}
