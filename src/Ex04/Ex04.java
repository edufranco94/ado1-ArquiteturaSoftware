/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

/**
 *
 * @author Marcos
 */
public class Ex04 {
    
    public static void main(String[] args) {
        
        
        Arquivo arquivo1 = new Arquivo ("Teste",100);
        Arquivo arquivo2 = new Arquivo ("Teste2",200);
        
        System.out.println("O arquivo tem o nome de " + arquivo2.getNome_arquivo() + " " + "Com o tamanho de" + " " + arquivo2.getTamanho() + "KB");
        
            
        }
    }
    

