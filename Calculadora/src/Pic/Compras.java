
package Pic;


public class Compras {
    public static void main(String[] args){
        Produto p = new Produto("Limpeza", 100, 10);
        p.descontar(10);
        p.imprimir();
    }
}
