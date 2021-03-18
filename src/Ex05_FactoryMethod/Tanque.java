/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex05_FactoryMethod;

/**
 *
 * @author Edu Franco
 */
public abstract class Tanque implements Cores,Posicao,Canhao {
    CoresRGB corTanque;
    CoresRGB corCanhao;
    double x;
    double y; 
    
    public abstract void caracteristicasTanque();
}
