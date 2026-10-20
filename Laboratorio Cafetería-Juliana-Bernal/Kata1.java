/// Contexto: Los clientes de la cafetería quieren dejar propina. Debes calcular la
/// propina basada en el total de la cuenta.




import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        //Pide el total de la cuenta y el porcentaje de propina.
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra (COP): ");
        double totalCompra = entradaUsuario.nextDouble();

        System.out.print("Ingrese el porcentaje de propina: ");
        double porcentajePropina = entradaUsuario.nextDouble();
        entradaUsuario.close();

        if(porcentajePropina<0 && totalCompra<=0) {
            System.out.println("Error: total de compra y porcentaje inválidos");
        } else if (porcentajePropina<0) {
            System.out.println("Error: porcentaje inválido");
        } else if (totalCompra<=0){
            System.out.println("Error: total inválido");
        }else {
            //Calcula el monto de la propina y el total a pagar.
            double totalPropina = (totalCompra * porcentajePropina / 100);
            double totalPagar = totalPropina + totalCompra;

            //Si la propina es mayor al 30%, muestra: "¡Propina generosa!" .
            //Si la propina es menor al 5%, muestra: "Propina muy baja" .
            //Si la propina está entre 5% y 30% (ambos incluidos), no muestres ningún mensaje adicional.
            String mensaje = "";
            if (porcentajePropina < 5) {
                mensaje = "Propina muy baja";
            } else if (porcentajePropina > 30) {
                mensaje = "¡Propina generosa!";
            }
            System.out.println("Propina: " + "$" + String.format("%.2f", totalPropina)); //solo dos decimales
            System.out.println("Total a pagar: " + "$" + String.format("%.2f", totalPagar));

            if (!mensaje.equals("")) { // validamos si hay mensaje para mostrar
                System.out.println(mensaje);
            }

        }

    }
}