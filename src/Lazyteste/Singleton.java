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
public class Singleton {
    
    private static Singleton sin;
    
    private Singleton(){
    }
    
    public static Singleton getInstance(){
      if(sin==null)
          sin=new Singleton();
        
      return sin;
    }


}
