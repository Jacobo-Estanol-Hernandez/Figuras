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
public class cuadrado extends rectangulo{
    //double lado;

    public cuadrado(double lado) {
        super(lado);
    }
    @Override
    public double getArea(){
    return lado*lado;
    }
    
}

