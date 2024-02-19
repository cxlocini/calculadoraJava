/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linguagemdeprogramacaoauladois;

/**
 *
 * @author rafac
 */
public class LinguagemDeProgramacaoAulaDois {
    public static void main(String[] args) {
         Calculadora oCalculadora = new Calculadora();
        
        oCalculadora.setValor1(100);
        oCalculadora.setValor2(2);
        
        System.out.println("Soma: " + oCalculadora.getSoma());
        System.out.println("Subtracao: " + oCalculadora.getSubtracao());
        System.out.println("Multiplicacao: " + oCalculadora.getMultiplicacao());
        System.out.println("Divisao: " + oCalculadora.getDivisao());
    }

}
