package com.atividade.application;

import java.util.Arrays;
import java.util.Scanner;
import com.atividade.model.services.Ordenacao;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];
        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();
        }

        Ordenacao ordenacao = new Ordenacao();

        System.out.println("Escolha o método de ordenação: 1 - QuickSort, 2 - MergeSort, 3 - BubbleSort");
        int escolha = scanner.nextInt();
        long tempo = 0;

        if (escolha == 1) tempo = ordenacao.quickSort(numeros);
        else if (escolha == 2) tempo = ordenacao.mergeSort(numeros);
        else if (escolha == 3) tempo = ordenacao.bubbleSort(numeros);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
        System.out.println("Tempo de execução: " + tempo + " ns");
        scanner.close();
    }
}

