/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Arquivo {
    
    private String nome_arquivo;
    private Double tamanho;
    private ArrayList<Arquivo> listaarquivo;

    
    public Arquivo(String nome_arquivo, double tamanho){
        this.nome_arquivo = nome_arquivo;
        this.tamanho = tamanho;
        listaarquivo = new ArrayList<Arquivo>();
        
    }
    
    public void adicionaArquivo(Arquivo novoArquivo){
        listaarquivo.add(novoArquivo);
    }
    
   public ArrayList<Arquivo> getlistaaarquivo(){
       return listaarquivo;
   }
    
    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public String getNome_arquivo() {
        return nome_arquivo;
    }

    public void setNome_arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }
    
    
    
}
