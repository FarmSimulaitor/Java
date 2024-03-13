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
public class ArvoreNaria {
    private No raiz;
    
    public ArvoreNaria(int ch){
        this.raiz = null;
    }
    
    public No criaNovoNo(int chave){
        No novoNo = new No(chave);
        return novoNo;
    }
    
    public No buscaChave(int ch, No raiz){
        if (raiz == null) return null;
        if(raiz.getChave() == ch) return raiz;
        No p = raiz.getPrimFilho();
        while(p != null){
            No resp = buscaChave(ch, p);
            if ( resp != null)
                  return resp;
            p = p.getProxIrmao();
        }
        return null;
    }
    
    public boolean insere(No raiz, int novaChave, int chavePai){
        No pai = buscaChave(chavePai,raiz);
        if ( pai == null) return false;
        
        No filho = criaNovoNo(novaChave);
        No p = pai.getPrimFilho();
        if (p == null)
            pai.setPrimFilho(filho);
        else{
            while(p.getProxIrmao() !=null){
                p = p.getProxIrmao();
            }
            p.setProxIrmao(filho);
        }
        System.out.print("Inserido" + novaChave);
        return false;
    }
    
   public void exibirArvore (No raiz){
       if(raiz == null) return;
       System.out.print(""+raiz.getChave()+"(");
       No p = raiz.getPrimFilho();
       while( p != null){
           exibirArvore(p);
           p = p.getProxIrmao();
       }
       System.out.print(")");
   }
}
