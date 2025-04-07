package com.atividade.application;

import com.atividade.model.services.Ordenacao;
import com.atividade.model.services.Ordenacao_IF;
import com.atividade.model.services.Busca;
import com.atividade.model.services.Busca_IF;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Ordenacao_IF ordenacao = new Ordenacao();
        Busca_IF busca = new Busca();

        int[] numeros = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 11, 13, 15, 12, 14};
        int[] numerosOrdenados = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        executar("Bubble Sort", ordenacao, numeros.clone(), ordenacao::bubbleSort);
        executar("Selection Sort", ordenacao, numeros.clone(), ordenacao::selectionSort);
        executar("Insertion Sort", ordenacao, numeros.clone(), ordenacao::insertionSort);
        executar("Merge Sort", ordenacao, numeros.clone(), ordenacao::mergeSort);
        executar("Quick Sort", ordenacao, numeros.clone(), ordenacao::quickSort);
        executar("Random Quick Sort", ordenacao, numeros.clone(), ordenacao::random_quickSort);
        executar("QuickSort Java", ordenacao, numeros.clone(), ordenacao::quickSort_Java);
        executar("Counting Sort", ordenacao, numeros.clone(), ordenacao::countingSort);

        System.out.println("=== Testes de Busca com número 10 ===");
        System.out.println("Linear Iterativa: " + busca.buscaLinear_iterativa(numerosOrdenados, 10));
        System.out.println("Linear Recursiva: " + busca.buscaLinear_recursiva(numerosOrdenados, 10));
        System.out.println("Binária Iterativa: " + busca.buscaBinaria_iterativa(numerosOrdenados, 10));
        System.out.println("Binária Recursiva: " + busca.buscaBinaria_recursiva(numerosOrdenados, 10));
        System.out.println("Linear 2 Pontas: " + busca.buscaLinear_iterativa_duasPontas(numerosOrdenados, 10));

        System.out.println("\n=== Testes de Busca com número -1 (inexistente) ===");
        System.out.println("Linear Iterativa: " + busca.buscaLinear_iterativa(numerosOrdenados, -1));
        System.out.println("Linear Recursiva: " + busca.buscaLinear_recursiva(numerosOrdenados, -1));
        System.out.println("Binária Iterativa: " + busca.buscaBinaria_iterativa(numerosOrdenados, -1));
        System.out.println("Binária Recursiva: " + busca.buscaBinaria_recursiva(numerosOrdenados, -1));
        System.out.println("Linear 2 Pontas: " + busca.buscaLinear_iterativa_duasPontas(numerosOrdenados, -1));
    }

    private static void executar(String nome, Ordenacao_IF ordenacao, int[] vetor, java.util.function.Consumer<int[]> metodo) {
        System.out.println("=== " + nome + " ===");
        metodo.accept(vetor);
        System.out.println("Ordenado: " + Arrays.toString(vetor));
        System.out.println("Está ordenado? " + ordenacao.checaVetorOrdenado(vetor));
        System.out.println();
    }
}