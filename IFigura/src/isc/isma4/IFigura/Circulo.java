/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import isc.isma4.IFigura.Figura;

/**
 *
 * @author Black Jack
 */
public class Circulo extends Figura {

    private double radio;
    @Override
    public double getArea() {
        return Math.PI*radio*radio;
    }
}
