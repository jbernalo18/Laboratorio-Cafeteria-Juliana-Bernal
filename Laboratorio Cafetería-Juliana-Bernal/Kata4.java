
import java.util.Scanner;
//Contexto: La cafetería abre de lunes a viernes de 6:00 AM a 8:00 PM, y los
//sábados de 7:00 AM a 2:00 PM. Los domingos está cerrada.

class Kata4 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        //Pide al usuario el día de la semana (1-7, donde 1 = Lunes, 7 = Domingo).
        System.out.print("Ingresa un día de la semana (1:Lunes, 7:Domingo): ");
        int diaIngresado = entradaUsuario.nextInt();
        System.out.print("Ingresa la hora (0-23): ");
        int horaIngresada = entradaUsuario.nextInt();

        entradaUsuario.close();

        String eleccionDia = switch (diaIngresado) {
            case 1,2,3,4,5 -> "Horario de Lunes a Viernes: 6:00 AM - 8:00 PM";
            case 6 -> "Horario de sábado: 7:00 AM - 2:00 PM";
            case 7 -> "Horario de domingo: cerrado todo el día";
            default -> "Día no válido";
        };

        if (diaIngresado >= 1 && diaIngresado <= 5) {
            if(horaIngresada >= 6 && horaIngresada <= 20) {
                System.out.println("La cafetería está abierta.");
            }else{
                System.out.println("La cafetería está cerrada.");
            }
        }else if(diaIngresado == 6) {
            if (horaIngresada >= 7 && horaIngresada <= 14) {
                System.out.println("La cafetería está abierta.");
            }else {
                System.out.println("La cafetería está cerrada.");
            }
        }else if (diaIngresado == 7) {
            System.out.println("La cafetería está cerrada.");
        }

        System.out.println(eleccionDia);
    }
}
