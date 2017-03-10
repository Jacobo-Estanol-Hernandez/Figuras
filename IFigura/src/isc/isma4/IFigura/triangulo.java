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
public class triangulo extends Figura{
    double base;
    double altura;

@Override
    public double getArea() {
        return base*altura/2;
    }

}