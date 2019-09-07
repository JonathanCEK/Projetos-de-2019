
package Pic;

public class Produto {
    private String descricao;
    private double preco;
    private double desconto = 0;
    private double precocomdesconto;
    private int quantidade;
    
    Produto(String desc, double pre, int quant){
        descricao = desc;
        preco  = pre;
        quantidade = quant;
    }
    
    String getDescrição(){
        return descricao;
    }
    double getPreco(){
        return preco;
    }
    double getDesconto(){
        return desconto;
    }
    int getQuantidade(){
        return quantidade;
    }
    double getPrecocomdesconto(){
        return precocomdesconto;
    }
    void setDescricao(String desc){
        descricao = desc;
    }
    void setPreco(double data){
        preco = data;
    }
    void setQuantidad(int data){
        quantidade = data;
    }
    void descontar(double des){
        if(des > 0 && des < 100){
            double d = (des/100);
            double temp = preco * d;
            precocomdesconto = preco - temp;
            desconto = des;
        }else{
            System.out.println("Desconto fora dos Limites");
        }
    }
    
    void imprimir(){
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$" + preco);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Preço com Desconto: R$" + precocomdesconto);
        System.out.println("Quantidade: " + quantidade + " itens");
    }
    
    double precoFinal(){
        return precocomdesconto*quantidade;
    }
}
