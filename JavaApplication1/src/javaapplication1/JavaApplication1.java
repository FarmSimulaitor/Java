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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArvoreNaria a = new ArvoreNaria(8);
        No r = a.criaNovoNo(8);
        a.insere(r, 15,8);
        a.insere(r, 20,15);
        a.insere(r, 10,15);
        
        System.out.println("\nListagem da Arvore");
        a.exibirArvore(r);
        System.out.println("\n");
    }
    
}
