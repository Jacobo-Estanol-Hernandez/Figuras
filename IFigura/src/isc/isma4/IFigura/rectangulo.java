/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.IFigura;

/**
 *
 * @author Black Jack
 */
public class rectangulo extends Figura{
    
    double base;
    double altura;
    double lado;
    
    @Override
    public double getArea(){
        
    return base*altura;
    }


public rectangulo(double lado){
}
}