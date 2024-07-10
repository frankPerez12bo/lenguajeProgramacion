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
public class COperaciones {
    private double diaMain;
    private int edadMain;

    public double getDiaMain() {
        return diaMain;
    }

    public void setDiaMain(double diaMain) {
        this.diaMain = diaMain;
    }

    public int getEdadMain() {
        return edadMain;
    }

    public void setEdadMain(int edadMain) {
        this.edadMain = edadMain;
    }
   
   
  
     public double analisisOne(){
    double valor = 25.00;
    return valor;
    }
    public double allPrice_payOne(){
        double valor = analisisOne() * diaMain ;
        return valor;
    }
    public double costoAdicional_one(){
        double edad = 0;
        if (edadMain >= 14 && edadMain <=24) {
            edad = 0.10;
        }
        double priceNew = allPrice_payOne() * edad;
        return priceNew;
    }
    public double costoNeto_one(){
    double valor;
    valor =  allPrice_payOne() + costoAdicional_one();
    return valor;
    }
    
     public double analisisTwo(){
    double valor = 36.00;
    return valor;
    }
     
     public double allPrice_payTwo(){
        double valor = analisisTwo() * diaMain ;
        return valor;
    }
    public double costoAdicional_Two(){
        double edad = 0;
        if (edadMain >= 14 && edadMain <=24) {
            edad = 0.10;
        }
        double priceNew = allPrice_payTwo() * edad;
        return priceNew;
    }
    public double costoNeto_Two(){
    double valor;
    valor =  allPrice_payTwo() + costoAdicional_Two();
    return valor;
    }
    
    
      public double analisisTree(){
    double valor = 50.00;
    return valor;
    }
      
      
      public double allPrice_payTree(){
        double valor = analisisTree() * diaMain ;
        return valor;
    }
    public double costoAdicional_Tree(){
        double edad = 0;
        if (edadMain >= 14 && edadMain <=24) {
            edad = 0.10;
        }
        double priceNew = allPrice_payTree() * edad;
        return priceNew;
    }
    public double costoNeto_Tree(){
    double valor;
    valor =  allPrice_payTree() + costoAdicional_Tree();
    return valor;
    }
}
