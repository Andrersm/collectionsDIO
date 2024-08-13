package main.java.collection.list.exerciciosomasdenumeros;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    void calcularSoma() {
        if (numeros.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("A soma dos números é: " + soma);
    }

    public void encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (numeros.isEmpty()){
            System.out.println("Lista vazia");
            return;
        }

        for (int numero : numeros) {
            if (numero > maiorNumero){
                maiorNumero = numero;
            }
        } 
        System.out.println("O maior numero é " + maiorNumero);
    }

    public void encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (numeros.isEmpty()){
            System.out.println("Lista vazia");
            return;
        }
        for (int numero : numeros) {
            if (numero < menorNumero){
                menorNumero = numero;
            }
        }
        System.out.println("O menor numero é " + menorNumero); 
    
    }

    public void exibirNumeros(){
        if(numeros.isEmpty()){
            System.out.println("A lista ta vazia");
            return;
        }
        System.out.println("a sua lista é " + numeros);
        
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        int numero = 0;
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 33;
        int numero4 = 43;


        somaNumeros.adicionarNumero(numero);
        somaNumeros.adicionarNumero(numero1);
        somaNumeros.adicionarNumero(numero2);
        somaNumeros.adicionarNumero(numero3);
        somaNumeros.adicionarNumero(numero4);


        somaNumeros.exibirNumeros();
        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();

    }



}
