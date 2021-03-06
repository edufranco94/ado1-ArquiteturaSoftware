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
public class TanquePrime extends Tanque {

    public TanquePrime() {
    }

public CoresRGB getCorTanque() {
        return corTanque;
    }
    
    public CoresRGB getCorCanhao() {
        return corCanhao;
    }

    @Override
    public void setCores(CoresRGB corTanque, CoresRGB corCanhao) {
       this.corCanhao=corCanhao;
       this.corTanque=corTanque;
}

    @Override
    public void adPosicaox(double x) {
         this.x = x;
    }

    @Override
    public double retPosicaox() {
        return x;
    }

    @Override
    public void adPosicaoy(double y) {
        this.y = y;
    }

    @Override
    public double retPosicaoy() {
        return y;
    }

    @Override
    public void atirar() {
        System.out.println("Prime disparando a 125metros de distancia!");
    }

    @Override
    public void caracteristicasTanque() {
        System.out.println("Tanque escolhido: Prime");
        System.out.println("Cor do tanque: " + getCorTanque());
        System.out.println("Cor do canhao: " + getCorCanhao());
        System.out.println("Eixo X: " + retPosicaox());
        System.out.println("Eixo Y: " + retPosicaoy());
    }
    
}
