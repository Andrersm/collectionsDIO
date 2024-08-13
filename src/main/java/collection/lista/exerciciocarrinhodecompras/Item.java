package main.java.collection.lista.exerciciocarrinhodecompras;

public class Item {
    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
