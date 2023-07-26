package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String apellidoCliente;
        String nombreCliente;
        Byte edadCliente;
        Integer usosUltimoMes;
        Double montoAseoUltimoMes;
        Double montoAlimentosUltimoMes;
        Double montoOtrosProductosUltimoMes;

        Byte puntajeCredito;

        Double totalDeuda;
        Double totalAPagar;

        // Inicializo variables

        System.out.print("Digite sus apellidos: ");
        apellidoCliente = teclado.nextLine();
        System.out.print("Digite sus nombres: ");
        nombreCliente = teclado.nextLine();
        System.out.print("Digite su edad: ");
        edadCliente = teclado.nextByte();
        System.out.print("Digite el número de usos de tarjeta en el último mes: ");
        usosUltimoMes = teclado.nextInt();
        System.out.print("Digite su consumo,en pesos, en productos de aseo en el último mes: ");
        montoAseoUltimoMes = teclado.nextDouble();
        System.out.print("Digite su consumo,en pesos, en productos de alimentos en el último mes: ");
        montoAlimentosUltimoMes = teclado.nextDouble();
        System.out.print("Digite su consumo,en pesos, en otros productos en el último mes: ");
        montoOtrosProductosUltimoMes = teclado.nextDouble();
        System.out.print("Digite su puntaje de crédito: ");
        puntajeCredito = teclado.nextByte();

        // Proceso

        totalDeuda = montoAseoUltimoMes+montoAlimentosUltimoMes+montoOtrosProductosUltimoMes;
        totalAPagar = totalDeuda;

        if(puntajeCredito>9||puntajeCredito<1){ System.out.println("Señor usuario, usted ha digitado un puntaje de crédito inválido"); }
        else{
            if(puntajeCredito==1){ totalAPagar = totalAPagar*0.75; }
            else if(puntajeCredito==2){ totalAPagar = totalAPagar*0.80; }
            else if(puntajeCredito==3){ totalAPagar = totalAPagar*0.85; }
            else if(puntajeCredito==4){ totalAPagar = totalAPagar*0.90; }

            System.out.println("Querido usuario, "+ nombreCliente+" "+apellidoCliente+". El total que debes pagar por el consumo del último mes es de: $"+totalAPagar+" pesos.");
        }
    }
}