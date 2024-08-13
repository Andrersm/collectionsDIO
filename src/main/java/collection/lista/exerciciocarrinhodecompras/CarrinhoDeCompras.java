package main.java.collection.lista.exerciciocarrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itens;

    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
        System.out.println("Item adicionado ao carrinho: " + nome);
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item item : this.itens){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
                System.out.println("Item removido do carrinho: " + nome);
            }
        }
        this.itens.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for(Item item : this.itens){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor total do carrinho: " + valorTotal);
    }

    public void exibirItens(){
        System.out.println("Itens no carrinho:");
        for(Item item : this.itens){
            System.out.println(item.getNome() + " - R$" + item.getPreco() + " x " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 5.0, 2);
        carrinho.adicionarItem("Feijão", 3.0, 1);
        carrinho.adicionarItem("Macarrão", 2.0, 3);

        carrinho.exibirItens();

        carrinho.removerItem("Feijão");

        carrinho.calcularValorTotal();
    }
}
