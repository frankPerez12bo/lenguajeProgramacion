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
public class COperaciones {
    private double numOne;

    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }
    public double buenaVida(){
    double valor  = 4.90;
    return valor;
    }
    public double totolBruto(){
    double valor = buenaVida() * numOne;
    return valor;
    }
    public double descuento(){
    double desc = 0.0;
        if (numOne < 15) {
            desc = 0.04;
        }else if(numOne >=15 && numOne < 30){
            desc = 0.065;
        }else if(numOne >=30 && numOne < 45){
            desc = 0.009;
        }else if(numOne >= 45){
            desc = 0.11;
        }
        double resultado = desc * totolBruto();
        return resultado;
    }
    public double netoPagar(){
        double valor = totolBruto() - descuento();
        return valor;
    }
    
    
    public double PuraVida(){
        double valor = 4.80;
        return valor;
    }
    
    public double priceBrutoPv(){
        double valor = PuraVida() * numOne;
        return valor;
    }
    
    public double descuentoPv(){
    double descuento = 0.00;
        if (numOne < 15) {
            descuento = 0.04;
        }else if(numOne >=15 && numOne < 30 ){
            descuento = 0.065;
        }else if(numOne >=30 && numOne < 45){
            descuento = 0.09;
        }else if(numOne > 45){
            descuento = 0.11;
        }
        double valor = descuento * priceBrutoPv();
        return valor;
    }
    
    public double montoBrutopv(){
        double valor = priceBrutoPv() - descuento();
        return valor;
    }
    
    
    public double todoSabor(){
        double valor = 5.20;
        return valor;
    }
    
    public double montoBrutoTs(){
        double valor = numOne * todoSabor();
        return valor;
    }
    
    public double descuentoTs(){
    double descuento = 0.00;
        if (numOne < 15) {
            descuento = 0.04;
        }else if(numOne >=15 && numOne < 30){
            descuento = 0.065;
        }else if(numOne >= 30 && numOne < 45){
            descuento = 0.09;
        }else if(numOne > 45){
            descuento = 0.11;
        }
        double valor = descuento * montoBrutoTs();
        return valor;
    }
    
    public double netoTs(){
    double valor = montoBrutoTs() - descuentoTs();
    return valor;
    }
    
    public double cielo(){
    double valor = 4.60;
    return valor;
    }
    
    public double brutoCielo(){
    double valor = cielo() * numOne;
    return valor;
    }
    
    public double descuentoCielo(){
    double descuento = 0.00;
    
        if (numOne < 15) {
            descuento = 0.04;
        }else if(numOne >=15 && numOne < 30){
            descuento = 0.065;
        }else if(numOne >= 30 && numOne < 45){
            descuento = 0.09;
        }else if(numOne > 45){
            descuento = 0.11;
        }
        double valor = brutoCielo() * descuento;
        return valor;
    }
    
    public double netoCielo(){
        double valor = brutoCielo() - descuentoCielo();
        return valor;
    }
}
