
package Pic;


public class main {
    public static void main(String[] args){
        Carrinho compras = new Carrinho();
        Produto p1 = new Produto("Carne de Cachorro", 1999, 1);
        Produto p2 = new Produto("Requeijao", 5, 400);
        Produto p3 = new Produto("Lubrificante", 60, 2);
        p1.descontar(50);
        compras.inserir(p1);
        compras.inserir(p2);
        compras.inserir(p3);
        
        
        
        compras.listarTodosProdutos();
        System.out.println("Preço Total: R$" + compras.precoTotalCompras());
        
    }
    
}
