/**
 * . Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
 * siguiente información: cantidad total de preguntas que se le realizaron y
 * la cantidad de preguntas que contestó correctamente. Se pide
 * confeccionar un programa que ingrese los dos datos por teclado e informe
 * el nivel del mismo según el porcentaje de respuestas correctas que ha
 * obtenido, y sabiendo que: Nivel máximo: Porcentaje>=90%. Nivel
 * medio: Porcentaje>=75% y <90%. Nivel regular:
 * Porcentaje>=50% y <75%. Fuera de nivel: Porcentaje<50%.
 */
package actividad02;

import javax.swing.JOptionPane;

public class Actividad02 {

    public static void main(String[] args) {
        float porcentajeRespCorrectas, totalPreguntas, respuestasCorrectas;

        respuestasCorrectas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el total de Respuestas correctas"));
        totalPreguntas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el total de Preguntas"));

        porcentajeRespCorrectas = respuestasCorrectas / totalPreguntas;
        System.out.println(" Porcentaje " + ((int)(porcentajeRespCorrectas * 100)) + "%");

       if(porcentajeRespCorrectas > 0.89){
           System.out.println("Nivel Maximo");
       }else if(porcentajeRespCorrectas > 0.75 && porcentajeRespCorrectas < 0.90){
               System.out.println("Nivel Medio");
           }else if(porcentajeRespCorrectas >= 0.50 && porcentajeRespCorrectas <= 0.75){
                   System.out.println("Nivel Regular");
               }else{
                   System.out.println("Fuera de Nivel");
               }
           }
       }


