package practica02;

import javax.swing.JOptionPane;

public class Practica02 {

    public static void main(String[] args) {
        int nota;

        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota entera comprendida entre 1 y 10"));
            if (nota > 10 || nota <= 0) {
                System.out.println("La nota ingresada esta fuera de rango");
            }
        } while (nota > 10 || nota <= 0);

        System.out.println("Su nota es: " + nota);
        System.out.println("Fin del Programa");
    }

}
