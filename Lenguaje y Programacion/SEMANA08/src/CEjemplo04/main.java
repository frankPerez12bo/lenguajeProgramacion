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
public class main {
    static Scanner tecla = new Scanner(System.in);
    static leerProblem leer = new leerProblem();
    static COpreraciones objOpe = new COpreraciones();
    
    static double numOneMain,numTwoMain;
    public static void main(String[] args) {
        numOneMain = leer.leer();
        objOpe.setNumOne(numOneMain);
        numTwoMain = leer.leer();
        objOpe.setNumTwo(numTwoMain);
        mostrar();
    }
    static int opcion;
    public static void mostrar(){
        do {            
            System.out.println("Escoger opcion de la operación a realizar");
            System.out.println("Opcion 1 : Suma : ");
            System.out.println("opcion 2 : Resta : ");
            System.out.println("opcion 3 : Multiplicación : ");
            System.out.println("opcion 4 : División : ");
            
           opcion = tecla.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(" Resultado de la suma : ");
                    System.out.println("La suma es : " + objOpe.suma());
                    break;
                 case 2:
                    System.out.println(" Resultado de la Resta : ");
                    System.out.println("La resta es : " + objOpe.resta());
                    break;
                 case 3:
                    System.out.println(" Resultado de la multiplicación : ");
                    System.out.println("La multiplicación es : " + objOpe.multiplicacionm());
                    break;
                 case 4:
                    System.out.println(" Resultado de la division : ");
                    System.out.println("La división es : " + objOpe.division());
                    break;
                default:
                    System.out.println("no hay esta opción");
            }
        } while (opcion != 5);
    } 
}
