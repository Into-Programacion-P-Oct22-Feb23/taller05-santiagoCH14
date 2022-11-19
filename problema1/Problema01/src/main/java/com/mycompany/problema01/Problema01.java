/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author DETPC
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int edad;
        double costoKilovatio;
        double kilovatioNumero;
        double costoPlanilla;
        double descuento = 10;

        System.out.println("ingrese la edad");
        edad = entrada.nextInt();
        
        System.out.println("ingrese el costo kilovatio/hora");
        costoKilovatio = entrada.nextDouble();
        
        System.out.println("ingrese el numero consumido de kilovatios por"
        + "el mes");
        kilovatioNumero = entrada.nextDouble();
        
        costoPlanilla = costoKilovatio * kilovatioNumero;
        
        if (edad > 65){
            double valordescuento = (costoPlanilla * descuento) / 100;
            
            costoPlanilla = (costoPlanilla - valordescuento);
            
            System.out.println("el valor a cancelar es:" + costoPlanilla);
        }
        
        

    }
}
