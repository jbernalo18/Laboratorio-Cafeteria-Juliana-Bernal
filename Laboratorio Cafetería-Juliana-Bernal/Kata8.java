//Contexto: La cafetería necesita planificar turnos para los empleados. Cada turno
//tiene un número de horas

import java.util.Scanner;

public class Kata8 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int numeroEmpleados;
        String nombreEmpleado;
        double horasTrabajadas;
        double totalHorasTrabajadas=0;
        int contadorHorasmasCuarenta=0;
        int contadorHorasmenosVeinte=0;
        double promHoras=0;
        String nombresAgregados="";
        String nombresAgregados2="";
        int valorHora=12000;
        double totalSalario;
        double acumSalario=0;


        System.out.print("Ingresa el número de empleados: ");
        numeroEmpleados = entradaUsuario.nextInt();
        if (numeroEmpleados<=0){
            System.out.println("No se ingresaron empleados");
            return;
        }

        for (int i=1 ; i<=numeroEmpleados;i++){
            System.out.print("Empleado"+i+": ");
            nombreEmpleado = entradaUsuario.next();
            System.out.print("Horas trabajadas: ");
            horasTrabajadas = entradaUsuario.nextDouble();
            totalHorasTrabajadas=totalHorasTrabajadas+horasTrabajadas;
            promHoras=totalHorasTrabajadas/numeroEmpleados;
            totalSalario = horasTrabajadas*valorHora;
            acumSalario= acumSalario+totalSalario;
            if (horasTrabajadas>40){
                if (contadorHorasmasCuarenta>0){
                    nombresAgregados=nombresAgregados+", ";
                }
                nombresAgregados = nombresAgregados+nombreEmpleado;
                contadorHorasmasCuarenta++;

            }

            if (horasTrabajadas<20){
                if (contadorHorasmenosVeinte>0){
                    nombresAgregados=nombresAgregados+", ";
                }
                nombresAgregados2 = nombresAgregados2+nombreEmpleado;
                contadorHorasmenosVeinte++;

            }

        }

        entradaUsuario.close();
        System.out.println("--- Reporte de Turnos ---");
        System.out.println("Empleados con más de 40 horas: "+contadorHorasmasCuarenta+" ("+nombresAgregados+")");
        System.out.println("Empleados con menos de 20 horas: "+contadorHorasmenosVeinte+" ("+nombresAgregados2+")");
        System.out.println("Total de horas: "+totalHorasTrabajadas);
        System.out.println("Promedio de horas: "+String.format("%.2f",promHoras));
        System.out.println("Salario total: $"+String.format("%.2f",acumSalario));
    }
}
