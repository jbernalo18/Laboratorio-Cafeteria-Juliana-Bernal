//Contexto: La cafetería quiere saber cuántos clientes atiende por hora para
//planificar mejor el personal.

import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int horaIngresada;
        double totalClientes=0;
        double acumTotalClientes=0;
        double contadorHoras=0;
        double promHoras;
        double maxClientes =0;
        double horaPico=0;
        do{
            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            horaIngresada = entradaUsuario.nextInt();
            if (horaIngresada==-1 && totalClientes==0){
                System.out.println("No se ingresaron datos");
                break;
            } else if (horaIngresada==-1) {
                break;
            }
            contadorHoras = contadorHoras +1;
            System.out.print("Ingresa el número de clientes en esa hora: ");
            totalClientes = entradaUsuario.nextDouble();
            acumTotalClientes = acumTotalClientes +totalClientes;
                if (totalClientes>maxClientes){
                     maxClientes=totalClientes;
                     horaPico=horaIngresada;
                }

        }while (horaIngresada>-1);
        entradaUsuario.close();

        promHoras = acumTotalClientes/(contadorHoras);
            if (contadorHoras>0) {
                System.out.println("Total de clientes: " + acumTotalClientes);
                System.out.println("Promedio por hora: " + String.format("%.2f", promHoras));
                System.out.println("Hora con más clientes: " + horaPico + " (" + maxClientes + " clientes" + ")");
            }
    }
}
