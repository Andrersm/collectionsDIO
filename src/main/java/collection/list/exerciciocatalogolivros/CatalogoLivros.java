package main.java.collection.list.exerciciocatalogolivros;

import java.util.ArrayList;
import java.util.List;


public class CatalogoLivros {
    List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo =  new ArrayList<>();
    }

    void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        catalogo.add(livro);
        System.out.println("Livro adicionado ao catálogo: " + livro.toString());
    }

    void pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        System.out.println("Pesquisa por autor " + livrosPorAutor);
    }

    void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        System.out.println("Pesquisa por intervalo" + livrosPorIntervaloAnos);
    }

    void pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        if (livroPorTitulo != null){
            System.out.println("Pesquisa por livro " +livroPorTitulo);
        }
        else{
            System.out.println("Termo pesquisado " + titulo);
            System.out.println("Nenhum livro encontrado");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Harry potter", "JK", 2000);
        System.out.println("");
        catalogo.adicionarLivro("Harry potter 2", "JK", 2001);
        System.out.println("");
        catalogo.adicionarLivro("Senhor dos aneis", "tokien", 2002);
        System.out.println("");
        catalogo.adicionarLivro("Senhor dos aneis 2", "tokien", 2003);
        System.out.println("");
        catalogo.adicionarLivro("naruto", "kishimoto", 2004);
        System.out.println("");

        catalogo.pesquisarPorAutor("kishimoto");
        System.out.println("");
        catalogo.pesquisarPorIntervaloAnos(2001, 2003);
        System.out.println("");
        catalogo.pesquisarPorTitulo("narutosss");
        
    }

}
