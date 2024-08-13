package main.java.collection.list.exerciciolistatarefas;

import java.util.List;

import java.util.ArrayList;

public class ListaTarefas {
   
    List<Tarefa> tarefas;

    public ListaTarefas(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        this.tarefas.add(tarefa);
        System.out.println("tarefa " + descricao + " adicionada com sucesso"); 
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : this.tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
                System.out.println("tarefa removida: " + descricao);
            }
        }
        if (!tarefasParaRemover.isEmpty()){
            System.out.println("nenhuma tarefa removida");
        }
        this.tarefas.removeAll(tarefasParaRemover);
        
        
    }

    public int obterNumeroTotalTarefas(){
        return this.tarefas.size();
    }

    public void obterDescricoesTarefas(){
        if (this.tarefas.isEmpty()){
            System.out.println("Ta vazia a lista");
        }

        for(Tarefa tarefa : this.tarefas){
            System.out.println(tarefa.getDescricao());
        }
    }
    public static void main(String[] args) {

        
    // método main copiado do curso para ver se a minha implementaçao
    // funciona da mesma maneira que foi proposta no curso!


    // Criando uma instância da classe ListaTarefa
    ListaTarefas listaTarefas = new ListaTarefas();

    // Aicionando tarefas à lista
    listaTarefas.adicionarTarefa("Comprar leite");
    listaTarefas.adicionarTarefa("Estudar para o exame");
    listaTarefas.adicionarTarefa("Fazer exercícios");

    // Exibindo o número total de tarefas na lista
    System.out.println(listaTarefas.obterNumeroTotalTarefas());

    // Exibindo as descrições das tarefas na lista
    listaTarefas.obterDescricoesTarefas();

    // Removendo uma tarefa da lista
    listaTarefas.removerTarefa("Trabalhar");

    // Exibindo o número total de tarefas na lista após a remoção
    System.out.println("Agora você tem " + listaTarefas.obterNumeroTotalTarefas() + " tarefas na lista:");

    // Exibindo as descrições das tarefas atualizadas na lista
    listaTarefas.obterDescricoesTarefas();

    // Removendo uma tarefa da lista quando a lista está vazia
    listaTarefas.removerTarefa("Estudar para o exame");

    // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
    System.out.println("Agora você tem " + listaTarefas.obterNumeroTotalTarefas() + " tarefas na lista:");
  }
    

}
