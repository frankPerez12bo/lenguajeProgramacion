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
public class main {
    static Scanner tecla = new Scanner(System.in);
    static leerProblemDia leerDia = new leerProblemDia();
    static leerProblemEdad leerEdad = new leerProblemEdad();
    static COperaciones objOper = new COperaciones();
    static double diaOne;
    static  int edadOne;
    
    public static void main(String[] args) {
        diaOne  = leerDia.leer();
        objOper.setDiaMain(diaOne);
        edadOne = leerEdad.leer();
        objOper.setEdadMain(edadOne);
        mostrar();
    }
    static Integer opcion;
    public static void mostrar(){
        
        do {            
            System.out.println("los dias en la clinoica son : " + diaOne);
            System.out.println("\n la edad del paciente es : " + edadOne);
            System.out.println("----------------------------------------");
            System.out.println("----------Escoger Opcion de Analisi-------------");
            System.out.println("-Opcion 1 : Anbalisi 1 : -----------------------");
            System.out.println("-Opcion 2 : Anbalisi 2 : -----------------------");
            System.out.println("-Opcion 3 : Anbalisi 3 : -----------------------");
            opcion = tecla.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("-------------Resultado-------------------");
                    System.out.println("ANALISIS UNO:");
                    System.out.println("-COSTO BRUTO : \n "+ objOper.allPrice_payOne());
                    System.out.println("COSTO ADICIONAL \n : " + objOper.costoAdicional_one());
                    System.out.println("NETO A PAGAR EN CAJA : \n" + objOper.costoNeto_one());
                    break;
                case 2:
                    System.out.println("-------------Resultado-------------------");
                    System.out.println("ANALISIS DOS:");
                    System.out.println("-COSTO BRUTO : \n "+ objOper.allPrice_payTwo());
                    System.out.println("COSTO ADICIONAL \n : " + objOper.costoAdicional_Two());
                    System.out.println("NETO A PAGAR EN CAJA : \n" + objOper.costoNeto_Two());
                    break;
               case 3:
                    System.out.println("-------------Resultado-------------------");
                    System.out.println("ANALISIS ");
                    System.out.println("-COSTO BRUTO : \n "+ objOper.allPrice_payTree());
                    System.out.println("COSTO ADICIONAL \n : " + objOper.costoAdicional_Tree());
                    System.out.println("NETO A PAGAR EN CAJA : \n" + objOper.costoNeto_Tree());
                    break;
                default:
                     System.out.println("no hay esta opcion \n escoge otra opcion \n intente de nuevo");
            }
        } while (opcion != 4);
    }
}
