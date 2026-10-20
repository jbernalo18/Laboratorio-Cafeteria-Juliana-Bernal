//Contexto: La cafetería tiene diferentes tipos de bebidas. Debes clasificarlas según
//su temperatura.

import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        //Pide el nombre de una bebida.
        System.out.print("Ingrese el nombre de una bebida: ");
        String nombreBebida = entradaUsuario.nextLine();

        //Pide la temperatura en grados Celsius (puede ser decimal, usa nextDouble() ).
        System.out.print("Ingrese la tempertura (Celsius): ");
        double valorTemperatura = entradaUsuario.nextDouble();


        String clasificacionBebida;
        if (valorTemperatura<30){
            clasificacionBebida ="Fría";
        } else if (valorTemperatura>=30 && valorTemperatura<=60) {
            clasificacionBebida ="Templada";
        } else{
            clasificacionBebida ="Caliente";
        }

        System.out.println(nombreBebida+": "+clasificacionBebida);

    }
}
