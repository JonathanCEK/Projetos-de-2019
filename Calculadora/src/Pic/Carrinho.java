
package Pic;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> lista = new ArrayList();
    
    public void inserir(Produto p){
        lista.add(p);
    }
    public void listarTodosProdutos(){
        for (Produto p : lista) {
            p.imprimir();
            System.out.println("----------------------");
            
        }
    }
    public double precoTotalCompras(){
        double precoTotal = 0;
        
        for (Produto p : lista) {
            precoTotal += p.getPrecocomdesconto() * p.getQuantidade();
        }
        return precoTotal;
    }
}
