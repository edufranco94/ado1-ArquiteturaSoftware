/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1_Singleton;

/**
 *
 * @author Edu Franco
 */
public class MainAviao extends Thread {

    @Override
    public void run() {
        aviaoSingleton s1 = aviaoSingleton.getInstance();
        System.out.println(s1);
    }

    public static void main(String[] args) {
        
        //Cria o objeto aviaoSingleton, capturando sua instância
        aviaoSingleton s1 = aviaoSingleton.getInstance();
        
        //Busca o hash do objeto
        System.out.println(s1);
        
        //Imprimi os detalhes do avião
        s1.detalhesDoAviao();
        
        //Teste de multithread
        System.out.println("");
        System.out.println("- Abaixo teste MULTITHREAD: -");
        MainAviao t1 = new MainAviao();
        MainAviao t2 = new MainAviao();
        MainAviao t3 = new MainAviao();
        MainAviao t4 = new MainAviao();
        
        // Testa as 4 Threads criadas e mostra que é o mesmo hash do objeto
        t1.start();
        t2.start();       
        t3.start();       
        t4.start();       
    }

}
