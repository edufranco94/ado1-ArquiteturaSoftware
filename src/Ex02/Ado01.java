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
public class Ado01 {

    public static void main(String[] args) {

        Calculoimposto calcula = new Calculoimposto();
        IP1 ip1 = new IP1(200.0);
        IP2 ip2 = new IP2(100.0);
        IP3 ip3 = new IP3(100.0);
        System.out.println(calcula.calcular(ip1));
        System.out.println(calcula.calcular(ip2));
        System.out.println(calcula.calcular(ip3));
    }

}
