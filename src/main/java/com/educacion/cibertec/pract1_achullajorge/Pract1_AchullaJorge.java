package com.educacion.cibertec.pract1_achullajorge;

import java.util.Scanner;

/**
 *
 * @author Jorge Achulla
 */
public class Pract1_AchullaJorge {

    public static void main(String[] args) {
    ejecutarMetodos();
    }
    
    public static void ejecutarMetodos(){
        Scanner sc = new Scanner(System.in);
        //calcularPromedioDeTallas(sc);
        //realizarCalculadoraDePotencia(sc);
        //convertirDeSolesADolares(sc);
        //mostrarLos40PrimerosNrosMultiplos7();
        //calcularTarifaPorHorasTrabajadas(sc);
        mostrarSiAplicaAlDescYSiTieneTarjeta(sc);
        sc.close();
    }
    
    public static double obtenerDatoDecimalXConsola(Scanner sc, String msg){
       double n;
       System.out.print("Ingrese " + msg);
       n = sc.nextDouble();
       return n;
    }
    
    public static int obtenerDatoEnterosXConsola(Scanner sc, String msg){
       int n;
       System.out.print("Ingrese " + msg);
       n = sc.nextInt();
       return n;
    }
    
    public static void calcularPromedioDeTallas(Scanner sc){
        System.out.println("Ingrese la Talla de 4 Deportista");
        int x=1;
        int totalPersonas=4;
        double suma = 0.0;
        double talla;
        double tallaMaxima=1.70;

        while (x <= totalPersonas) {     
            talla = obtenerDatoDecimalXConsola(sc, "Talla del Deportista: ");
            suma = suma + talla;
            x = x +1;        
        }

        double promedio = suma/totalPersonas;
        
        if (promedio < tallaMaxima){
            System.out.println("Los Deportistas no son Aptos por el Promedio de talla: " + promedio);
        }else{
            System.out.println("Los Deportistas Son Aptos por el Promedio de talla: " + promedio);
        }

    }
   
    public static void realizarCalculadoraDePotencia(Scanner sc){
        int n1 = obtenerDatoEnterosXConsola(sc, " 1: ");
        int n2 = obtenerDatoEnterosXConsola(sc, "numero de la Potencia a multiplicar: ");
        double calcular = Math.pow(n1, n2);
        
        System.out.println(" El Resultado es: " + calcular);
    }
    
    public static void convertirDeSolesADolares(Scanner sc){
        int montoEnSoles = obtenerDatoEnterosXConsola(sc, "a Convertir ");
        double precioDolar = 4.5;   
        double totalEnDolares;
        
        totalEnDolares = precioDolar  / montoEnSoles;
        
        System.out.println("El monto Ingresado en Doles es: "  + totalEnDolares);
    }
    
    public static void mostrarLos40PrimerosNrosMultiplos7(){
        int i =7;
        int contador=1;
            
        while (contador<=40) { 
            if(i%7 == 0){
                contador++;
                System.out.print("" + i);
                System.out.print(" ");
            }
            i++;
        }
    }
        
    public static void calcularTarifaPorHorasTrabajadas(Scanner sc){
        int diasLaborables = 6;
        int horasSemanales = 48;
        int diasEnElMes=31;
        int cantidadSemanasEnElMes = diasEnElMes  / diasLaborables;
        double tarifa = obtenerDatoDecimalXConsola(sc, "La tarifa por hora del personal: ");
        double total;
        
        if (tarifa >= 10 && tarifa <= 20){
            total = (horasSemanales *tarifa) * cantidadSemanasEnElMes;
            System.out.println("El Pago Mensual del Personal es de : " + total);
        }else{
            System.out.println("La tarifa no esta en el rango establecido por RRHH");
        }
    }
    
    public static void mostrarSiAplicaAlDescYSiTieneTarjeta(Scanner sc){
        int conTarjeta = obtenerDatoEnterosXConsola(sc, "1: Si tiene Tarjeta ó 0: Si no tiene Tarjeta: ");
        double desc=0.1;  
        int precioLatop=3500;
        
        if(conTarjeta == 1){
            int montoEnTarjeta = obtenerDatoEnterosXConsola(sc, "Monto que tiene en la Tarjeta: ");
            if( montoEnTarjeta >= 2000){
                int edad = obtenerDatoEnterosXConsola(sc, "Su edad: ");
                if(edad <= 30){
                System.out.println("Accede al Descuento del 10% ");
                calcularImporte(precioLatop, desc);
                }else{
                    System.out.println("No Cumple con la Edad para un Prestamo");
                    int aval2 = obtenerDatoEnterosXConsola(sc, " 1: Si tiene Aval ó 0: Si no Tiene: ");
                    if(aval2 == 1){
                        System.out.println("Ya que usted cuenta con AVAL Si Accede al Descuento del 10%");
                        calcularImporte(precioLatop, desc);
                    }else{
                        System.out.println("No es Aptop al Descuento");
                    }
                }
            } else {
                System.out.println("No Cuenta con saldo Suficiente para el descuento,"
                        + "el monto aproximado que deberia tener en la tarje se de 2000");
            }
        }else{
            System.out.println("Al no Contar con Tarjeta de Credito no Aplica al Descuento, "
                    + "Si Desea comprar al contado el precio es de : " + precioLatop);
        }

    }
    
    public static void calcularImporte(int precioLatop, double desc){
        double subTotal;
        double importTotal;
        
        subTotal = precioLatop * desc;
        System.out.println("El Descuento es de: " + subTotal);
        importTotal = subTotal + precioLatop;
        System.out.println("El importe Total a Pagar es de: " + importTotal);
    }
}
