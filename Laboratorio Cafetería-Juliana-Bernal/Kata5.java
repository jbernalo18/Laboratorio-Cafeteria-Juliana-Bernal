//Contexto: La cafetería tiene un menú básico. Los clientes pueden elegir productos.


import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        double totalPedido=0;
        int opcionElegida;
        do {
            System.out.println("--- Menú de la Cafetería ---\n" +
                    "1. Café ($4.000)\n" +
                    "2. Muffin ($3.500)\n" +
                    "3. Sandwich ($7.500)\n" +
                    "4. Jugo ($5.000)\n" +
                    "5. Té ($3.000)\n" +
                    "6. Salir");
            System.out.print("Ingresa una opción del menú: ");
             opcionElegida = entradaUsuario.nextInt();


            switch (opcionElegida){
                case 1 -> {
                    totalPedido = totalPedido+4000;
                    System.out.println("Producto agregado: Café ($4.000)");
                }
                case 2 -> {
                    totalPedido = totalPedido+3500;
                    System.out.println("Producto agregado: Muffin ($3.500)");
                }
                case 3 ->  {
                    totalPedido = totalPedido+7500;
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                }
                case 4 ->  {
                    totalPedido = totalPedido+5000;
                    System.out.println("Producto agregado: Jugo ($5.000)");
                }
                case 5 ->  {
                    totalPedido = totalPedido+3000;
                    System.out.println("Producto agregado: Té ($3.000)");
                }
                case 6 ->  {

                }
                default ->{
                    System.out.println("Opción no válida. Intenta de nuevo.");
                }
            };
        }while (opcionElegida !=6);
        entradaUsuario.close();
        System.out.println("Total del pedido: "+"$"+totalPedido);
    }
}
