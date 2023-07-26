package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cedulaCliente;
        String apellidoCliente;
        String nombreCliente;
        Byte edadCliente;
        String ciudadCliente;
        Byte numeroBoletas;

        Double costoTotal;

        // Inicializo variables

        System.out.print("Digite su cédula: ");
        cedulaCliente = teclado.nextLine();
        System.out.print("Digite sus apellidos: ");
        apellidoCliente = teclado.nextLine();
        System.out.print("Digite sus nombres: ");
        nombreCliente = teclado.nextLine();
        System.out.print("Digite su edad: ");
        edadCliente = teclado.nextByte();
        teclado.nextLine();
        System.out.print("Digite su ciudad: ");
        ciudadCliente = teclado.nextLine();
        System.out.print("Digite el número de boletas que desea comprar: ");
        numeroBoletas = teclado.nextByte();



        // Proceso

        if (edadCliente<18) {
            System.out.println("Lo sentimos. Para comprar boletas para este evento, es necesario ser mayor de edad");
        }else if (numeroBoletas<0||numeroBoletas>4) {
            System.out.println("Lo sentimos. Solo es posible comprar entre 1 y 4 boletas");
        }
        else{
            costoTotal = numeroBoletas*450000.00;
            System.out.println("Señor usuario "+nombreCliente+" "+apellidoCliente+". El valor total de su compra es de: $"+costoTotal+", para sus boletas en la ciudad de "+ ciudadCliente+ ".");
        }
    }
}