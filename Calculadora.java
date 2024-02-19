
package com.mycompany.linguagemdeprogramacaoauladois;

public class Calculadora {
    
    private double valor1;
        
    private double valor2;

    public Calculadora() {
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public double getSoma(){
       getValor1();
       getValor2();
       return valor1+valor2;
    }
    
    public double getSubtracao(){
        getValor1();
        getValor2();
        return valor1-valor2;
    }
    
    public double getDivisao(){
        getValor1();
        getValor2();
        return valor1/valor2;
    }
    
    public double getMultiplicacao(){
        getValor1();
        getValor2();
        return valor1*valor2;
    }
    
}


