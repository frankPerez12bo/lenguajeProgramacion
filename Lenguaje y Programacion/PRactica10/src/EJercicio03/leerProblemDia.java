/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJercicio03;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class leerProblemDia {
    static Scanner tecla = new Scanner(System.in);
    static double dia;
    
    public static double leer(){
        do {            
            System.out.println("dime los días en la clinica por analisis : " );
            dia = tecla.nextDouble();
        } while (dia < 0);
        return dia;
    }
}
