package A6;

import java.util.*;
public class A6 {
    public static void main(String[] args) {
        //SOLICITAMOS EL NOMBRE DEL ESTUDIANTE
        Scanner sc= new Scanner(System.in);
        System.out.println("Nombre del estudiante: ");
        sc.nextLine();

        //SOLICITAMOS LAS CALIFICACIONES DEL ESTUDIANTE Y SE ALMACENAN EN UN ARREGLO
        int[] calificaciones = new int[5];
        for(int j=0;j<5;j++) {
            System.out.println("Calificación "+(j+1)+": ");
            calificaciones[j]=sc.nextInt();
        }

        //METODO PARA CALCULAR EL PROMEDIO
        int suma = 0;
        for (int calif : calificaciones) suma = suma + calif;
        int promedio = suma / calificaciones.length;
        System.out.println("Promedio: " +promedio);

        //METODO PARA CALCULAR LA CALIFICACION
            if (promedio >= 91 ) {
                System.out.println("Calificación: A");
            }   else if ((promedio >= 81) & (promedio <=90)) {
                System.out.println("Calificación: B");
            }   else if ((promedio >= 71) & (promedio <=80)) {
                System.out.println("Calificación: C");
            }   else if ((promedio >= 61) & (promedio <=70)) {
                System.out.println("Calificación: D");
            }   else if ((promedio >= 51) & (promedio <=60)) {
                System.out.println("Calificación: E");
            }   else if (promedio <=50) {
                System.out.println("Calificación: F");
            }
    }
}
