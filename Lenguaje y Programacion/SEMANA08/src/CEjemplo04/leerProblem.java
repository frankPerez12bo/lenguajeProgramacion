/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packgeOne;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class leerProblem {
    static  Scanner tecla = new Scanner(System.in);
    static double num;
    public static double leer(){
        do {            
            System.out.println("Diga un numero");
            num = tecla.nextDouble() ;
        } while (num < 0);
        return num;
    }
}
