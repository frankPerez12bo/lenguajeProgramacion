/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJercicio02;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class leerProb {
    static Scanner tecla = new Scanner(System.in);
    static double num;
    public static double leer(){
        do {            
            System.out.println("dime la cantidad acomprar");
            num = tecla.nextDouble();
        } while (num < 0);
        return num;
    }
}
