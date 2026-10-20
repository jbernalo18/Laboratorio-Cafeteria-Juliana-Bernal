//Contexto: Los clientes piden productos de la cafetería. Debes calcular el total de su pedido.

import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        double precioIngresado;
        double subTotal = 0;
        double IVA=0.19;
        double valorIVA= 0;
        double subTotalIVA=0;
        double descuento =0;
        double totalFinal;

       do {
           System.out.print("Ingrese el precio del producto (0 para terminar): ");
            precioIngresado= entradaUsuario.nextDouble();
            subTotal = subTotal + precioIngresado;
       } while (precioIngresado != 0);
        entradaUsuario.close();


       //calculo de subtotal con iva
        valorIVA = subTotal*IVA;
        subTotalIVA =valorIVA+subTotal;

        //validacion de descuento
        if (subTotalIVA>50000){
            descuento = subTotalIVA * 0.10;
            totalFinal = subTotalIVA-descuento;
        }else {
            totalFinal = subTotalIVA;
        }

        System.out.println("Subtotal: "+"$"+subTotal);
        System.out.println("IVA (19%): "+"$"+valorIVA);
        if (descuento!=0) { // validamos si hay descuento para mostrar
            System.out.println("Total con IVA: "+"$"+subTotalIVA);
            System.out.println("Descuento (10%): "+descuento);
        }
        System.out.println("Total a pagar: "+"$"+totalFinal);

    }
}
