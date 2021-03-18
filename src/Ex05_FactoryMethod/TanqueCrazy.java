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
public class TanqueCrazy extends Tanque {

    public TanqueCrazy() {
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
        System.out.println("Crazy disparando a 150metros de distancia!");
    }

    @Override
    public void caracteristicasTanque() {
        System.out.println("Tanque escolhido: Crazy");
        System.out.println("Cor do tanque: " + getCorTanque());
        System.out.println("Cor do canhao: " + getCorCanhao());
        System.out.println("Eixo X: " + retPosicaox());
        System.out.println("Eixo Y: " + retPosicaoy());
    }
    
}
