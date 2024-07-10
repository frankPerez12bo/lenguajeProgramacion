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
public class COperaciones {
    private double numOne,numTwo;

    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }
    public double minMath(){
    double valor;
    valor = Math.min(numOne, numTwo);
    return valor;
    }
     public double maxMath(){
    double valor;
    valor = Math.max(numOne, numTwo);
    return valor;
    }
     public double raizCuadradaOne(){
    double valor = Math.sqrt(numOne);
    return valor;
     }
      public double raizCuadradaTwo(){
    double valor = Math.sqrt(numTwo);
    return valor;
     }
      public double potenciaOne(){
    double valor = Math.pow(numOne, numTwo);
    return valor;
     }
     public double redondearOne(){
     double valor;
     valor = Math.round(numOne) ;
     return valor;
     }
       public double redondearTwo(){
     double valor;
     valor = Math.round(numTwo);
     return valor;
     }
       public double logaritmoBase_eOne(){
       double valor;
       valor = Math.log(numOne);
       return  valor;
       }
        public double logaritmoBase_eTwo(){
       double valor;
       valor = Math.log(numTwo);
       return  valor;
       }
}
