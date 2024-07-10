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
public class principal {
    static Scanner tecla = new Scanner(System.in);
    static leerProb leer = new leerProb();
    static COperaciones objPro = new COperaciones();
    static double numOneMain;
    public static void main(String[] args) {
        numOneMain = leer.leer();
        objPro.setNumOne(numOneMain);
        mostrar();
    }
    static int opcion;
    public static void mostrar(){
        do {
            System.out.println(" Escoger la Opcione");
            System.out.println("1 Buena vida");
            System.out.println("2 Pura Vida");
            System.out.println("3 Todo Sabor");
            System.out.println("4 Cielo");
            opcion = tecla.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("resultado Buena Vida");
                    System.out.println("monto bruto Buena Vida: " + objPro.totolBruto());
                    System.out.println("descuento : " + objPro.descuento());
                    System.out.println("total Pagar : " + objPro.netoPagar());
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("resultado Pura Vida");
                    System.out.println("monto bruto Pura Vida : " + objPro.priceBrutoPv());
                    System.out.println("descuento : " + objPro.descuentoPv());
                    System.out.println("total Pagar : " + objPro.montoBrutopv());
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("resulatado Todo Sabor");
                    System.out.println("monto Bruto Todo Sabor : " + objPro.montoBrutoTs());
                    System.out.println("descuento Todo Sabor : "+ objPro.descuentoTs());
                    System.out.println("Total Pagar : " + objPro.netoTs());
                    System.out.println("");
                    break;
                 case 4:
                    System.out.println("");
                    System.out.println("resulatado Cielo");
                    System.out.println("monto Bruto Cielo : " + objPro.brutoCielo());
                    System.out.println("descuento Cielo : "+ objPro.descuentoCielo());
                    System.out.println("Total Pagar : " + objPro.netoCielo());
                    System.out.println("");
                    break;
                default:
                    System.out.println("no hay esta opcion");
                    //throw new AssertionError();
            }
        } while (opcion != 5);
    }
}
