//Contexto: La cafetería ofrece descuentos por volumen en pedidos grandes del
//mismo producto.

import java.util.Scanner;

public class Kata7 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        double precioProducto;
        char respuestaUsuario;
        int cantidadProducto;
        double subtotal;
        double porcDescuento;
        double acumTotalCompra=0;
        double totalDescuento;
        double subtotalConDescuento;
        double valorIva = 0.19;
        double totalIva;
        double totalfinalProducto;
        do {
            System.out.print("Ingresa el precio del producto: ");
            precioProducto = entradaUsuario.nextDouble();
            System.out.print("Ingresa la cantidad: ");
            cantidadProducto = entradaUsuario.nextInt();
            subtotal = precioProducto*cantidadProducto;
            System.out.println("Subtotal: $"+String.format("%.2f",subtotal));
            if(cantidadProducto==1 || cantidadProducto==2){
                porcDescuento = 0;
            } else if (cantidadProducto>=3 && cantidadProducto<=5) {
                porcDescuento=0.05;
            } else if (cantidadProducto>=6 && cantidadProducto<=10) {
                porcDescuento=0.10;
            }else {
                porcDescuento=0.15;
            }
            totalDescuento= porcDescuento*subtotal;
            System.out.println("Descuento"+" ("+porcDescuento*100+"%): $"+String.format("%.2f",totalDescuento));
            subtotalConDescuento = subtotal - totalDescuento;
            totalIva=subtotalConDescuento*valorIva;
            System.out.println("IVA"+" ("+valorIva*100+"%): $"+String.format("%.2f",totalIva));
            totalfinalProducto=subtotalConDescuento+totalIva;
            System.out.println("Total Producto: $"+String.format("%.2f",totalfinalProducto));
            acumTotalCompra = totalfinalProducto+acumTotalCompra;
            System.out.print("¿Agregar otro producto? (S/N): ");
            respuestaUsuario= entradaUsuario.next().charAt(0); //se definio respuesta como caracter es necesario el charAt()

        }while (respuestaUsuario=='S' || respuestaUsuario=='s'); //comillas simples para char
        entradaUsuario.close();
        System.out.println("Total de la compra: $"+String.format("%.2f",acumTotalCompra));


    }
}
