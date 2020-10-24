/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.lang.Math;
/**
 *
 * @author Tiziano
 */
public class Calculator {
    private double a,b;

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getSomma(){
        return a+b;
    }
    public double getSott(){
        return a-b;
    }
    public double getMolt(){
        return a*b;
    }
    public double getDiv(){
        return a/b;
    }
    public double getPerc(){
        return a/b*100;
    }
    public double getPot(){
        return Math.pow(a,b);
    }
    public double getRad(){
        return Math.pow(a,1/b);
    }
}
