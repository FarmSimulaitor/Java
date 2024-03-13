/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 12224298
 */
public class No {
    private int chave;
    private No primFilho;
    private No proxIrmao;
   
    public No(){
    
    }
    
    public No (int chave){
        this.chave = chave;
        primFilho = null;
        proxIrmao = null;
    }
    
    public int getChave() {
        return chave;
    }
    
    public void setChave(int chave){
        this.chave = chave;
    }
    
    public No getPrimFilho(){
        return primFilho;
    }
    
    public void setPrimFilho(No primFilho){
        this.primFilho = primFilho;
    }
    
    public No getProxIrmao(){
        return proxIrmao;
    }
    
    public void setProxIrmao( No proxIrmao){
        this.proxIrmao = proxIrmao;
    }
}


