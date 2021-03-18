/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;
    
/**
 *
 * @author Marcos
 */
public class IP1 implements Imposto {

    private double valor;

    public IP1(double valor) {
        this.valor = valor;

    }

    @Override
    public double calcular() {

        return this.valor * 0.10;

    }
}


