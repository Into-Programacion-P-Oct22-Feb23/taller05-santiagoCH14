/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author DETPC
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //Variables
        double impuesto;
        String marca;
        String origen;
        double costo;
        int total;
        double descuento;

        //Proceso
        System.out.println("Ingrese la marca del vehiculo");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen de su vehiculo");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del vehiculo");
        costo = entrada.nextDouble();

        switch (origen) {
            case "Aleman":
                descuento = costo * 0.20;
                impuesto = costo + descuento;
                System.out.println("Su impuesto es del");
                System.out.println("20%");
                System.out.println("Su total a pagar es");
                System.out.println(impuesto);
                break;
        }
        switch (origen) {
            case "Japon":
                descuento = costo * 0.30;
                impuesto = costo + descuento;
                System.out.println("Su impuesto es del");
                System.out.println("30%");
                System.out.println("Su total a pagar es");
                System.out.println(impuesto);
                break;
        }
        switch (origen) {
            case "Italia":
                descuento = costo * 0.15;
                impuesto = costo + descuento;
                System.out.println("Su impuesto es del");
                System.out.println("15%");
                System.out.println("Su total a pagar es");
                System.out.println(impuesto);
                break;
        }
        switch (origen) {
            case "USA":
                descuento = costo * 0.8;
                impuesto = costo + descuento;
                System.out.println("Su impuesto es del");
                System.out.println("8%");
                System.out.println("Su total a pagar es");
                System.out.println(impuesto);
                break;

        }
    }
}
