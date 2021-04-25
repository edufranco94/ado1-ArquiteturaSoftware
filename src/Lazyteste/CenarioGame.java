/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lazyteste;

/**
 *
 * @author eduardofranco
 */
public class CenarioGame extends Thread{

    
        @Override
    public void run(){
      Singleton s1=Singleton.getInstance();
      System.out.println(s1);
    }

    public static void main(String[] args) {
        CenarioGame t1=new CenarioGame();
        CenarioGame t2=new CenarioGame();
        
        t1.start();
        t2.start();
    }

    
}
