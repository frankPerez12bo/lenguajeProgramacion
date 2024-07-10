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
    static COperaciones objOp = new COperaciones();
    static double numOneMain,numTwoMain ;
    
    public static void main(String[] args) {

        numOneMain = leer.leer();
        objOp.setNumOne(numOneMain);
        numTwoMain = leer.leer();
        objOp.setNumTwo(numTwoMain);
        mostrar();
       
    }
    static Integer opcion;
    public static void mostrar(){
        do {            
            System.out.println(" Opcion 1 : Numero minimo : ");
            System.out.println(" Opcion 2 : Numero maximo : ");
            System.out.println(" Opcion 3 : Raiz Cudrada : ");
            System.out.println(" Opcion 4 : Elevar Potencia : ");
            System.out.println(" Opcion 5 : Redondear ");
            System.out.println(" Opcion 6 : Calcular logaritmo natural base (e)");
            opcion = tecla.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("----------Resultado-*--------------");
                    System.out.println("----------Minimo Numero ------------");
                    System.out.println(" minimo es : \n " + objOp.minMath());
                    break;
                 case 2:
                    System.out.println("-----------------------------------");
                    System.out.println("----------Resultado-*--------------");
                    System.out.println("----------Maximo Numero ------------");
                    System.out.println(" maximo es : \n " + objOp.maxMath());
                    break;
                  case 3:
                    System.out.println("-----------------------------------");
                    System.out.println("----------Resultado-*--------------");
                    System.out.println("----------Raiz cuadrada ------------");
                    System.out.println(" la Raiz primer Digito : \n " + objOp.raizCuadradaOne()
                    + " \n Segudo Digito : \n " + objOp.raizCuadradaTwo());
                    break;
                 case 4:
                    System.out.println("-----------------------------------");
                    System.out.println("----------Resultado-*--------------");
                    System.out.println("----------Potencia de los 2 Numeros ------------");
                    System.out.println(" \n la Potencia es : \n "+ objOp.potenciaOne());
                    break;
                 case 5:
                    System.out.println("-----------------------------------");
                    System.out.println("----------Resultado-*--------------");
                    System.out.println("----------Redondear los 2 Numeros ------------");
                    System.out.println(" \n Primer digito redondeado es : \n "+ objOp.redondearOne()
                    + " \n Segundo digito redondeado es : \n "+ objOp.redondearTwo());
                    break;
                 case 6 :
                     System.out.println("--------------------------------------");
                     System.out.println("------------Resultado-----------------");
                     System.out.println("----------Logartmo Base (e)----------------");
                     System.out.println("\n------Logaritmo base (e) Primer  Digito \n "+ objOp.logaritmoBase_eOne()
                     + " \n ---Logaritmo base (e) Segundo Digito :  \n " + objOp.logaritmoBase_eTwo());
                     break;
                default:
                    System.out.println("no hay esta opcion \n intente de nuevo \n escoge otra opcion :");
            }
        } while (opcion != 7);
    } 
}
