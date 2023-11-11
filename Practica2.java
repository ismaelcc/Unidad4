
package practica2;

import java.util.Scanner;

/**
 *
 * @author Ism@
 */
public class Practica2 {

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    
    public static double restar(double num1, double num2) {
        return num1-num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    
    public static double dividir(double num1, double num2) {
       
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; 
        }
    }

    public static void main(String[] args) {
       
          Scanner numeros= new Scanner (System.in);
    
         System.out.println("Ingresar num1 ");
         double num1=numeros.nextDouble();
         System.out.println("Ingresar num 2");
         double num2=numeros.nextDouble();
         
        double resultadoSuma = sumar(num1,num2);
        double resultadoResta = restar(num1,num2);
        double resultadoMultiplicacion = multiplicar(num1,num2);
        double resultadoDivision = dividir(num1,num2);

        
        System.out.println("Suma-- R=  " + resultadoSuma);
        System.out.println("Resta-- R= " + resultadoResta);
        System.out.println("Multiplicacion-- R=  " + resultadoMultiplicacion);
        System.out.println("Division-- R=  " + resultadoDivision);
    }
}
