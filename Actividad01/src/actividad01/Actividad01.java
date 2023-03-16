/**
 * Confeccionar un programa que pida por teclado tres notas de un alumno,
 * calcule el promedio e imprima alguno de estos mensajes: Si el promedio
 * es >=7 mostrar "Promocionado". Si el promedio es >=4 y <7 mostrar
 * "Regular". Si el promedio es <4 mostrar "Reprobado".
 */
package actividad01;

import javax.swing.JOptionPane;

public class Actividad01 {

    public static void main(String[] args) {
        int nota, cantidadNota;
        double totalNotas, promedio;
        cantidadNota = 0;
        totalNotas = 0;
        
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota"));
            totalNotas += nota;
            cantidadNota++;

        } while (cantidadNota != 3);
        
        promedio = totalNotas / cantidadNota;
        
        if(promedio < 4){
            System.out.println("Observacion: Reprobado");
        }else if(promedio >=4 && promedio <7){
            System.out.println("Observacion: Regular");
        }else{
            System.out.println("Observacion: Promocionado");
        }
        
        System.out.println("cantidad de notas " + cantidadNota);
        System.out.println("total notas : " + totalNotas);
        System.out.println("Promedio: " + promedio);
    }

}
