/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author Dima
 */
public class SimpleCalc {
    private int a;
private int b;

SimpleCalc(double p1,double p2) {
this.a=5;
this.b=0;
}

public double getSum() {

return this.a+this.b;
}
public double getDiff() {

return this.a-this.b;
}
public double getMult() {

return this.a*this.b;
}
public double getDiv() {

return this.a/this.b;
}
}
