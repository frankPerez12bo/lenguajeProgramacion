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
public class leerProblemEdad {
    static Integer edad;
    static Scanner tecla = new Scanner(System.in);
   
    public static int leer(){
        do {            
            System.out.println("diga tu edad por favor : ");
            edad = tecla.nextInt();
        } while (edad < 0);
        return edad;
    }
}
