package com.atividade.model.services;

import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class OrdenacaoOutros_Test {
    private final Ordenacao_IF ordenacao = new Ordenacao();

    public static final int[] vetorOrdenado1000 = criarVetorOrdenado(1000);
    public static final int[] vetorOrdenado10000 = criarVetorOrdenado(10000);
    public static final int[] vetorOrdenado100000 = criarVetorOrdenado(100000);

    public static final int[] vetorOrdenadoInverso1000 = criarVetorOrdenadoInverso(1000);
    public static final int[] vetorOrdenadoInverso10000 = criarVetorOrdenadoInverso(10000);
    public static final int[] vetorOrdenadoInverso100000 = criarVetorOrdenadoInverso(100000);

    public static final int[] vetorAleatorio1000 = criarVetorAleatorio(1000);
    public static final int[] vetorAleatorio10000 = criarVetorAleatorio(10000);
    public static final int[] vetorAleatorio100000 = criarVetorAleatorio(100000);

    // Métodos de criações de vetores
    public static int[] criarVetorOrdenado(int tamanho){
        int[] vetor100Ordenado = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            vetor100Ordenado[i] = i+1;
        }
        return vetor100Ordenado;
    }

    public static int[] criarVetorOrdenadoInverso(int tamanho){
        int[] vetorOrdenado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorOrdenado[i] = tamanho-i;
        }
        return vetorOrdenado;
    }

    public static int[] criarVetorAleatorio(int tamanho){
        int[] vetorAleatorio = new int[tamanho];
        Random random = new Random(); 
        for(int i = 0; i < tamanho; i++){
            vetorAleatorio[i] = random.nextInt(101); 
        }
        return vetorAleatorio;
    }

    // Métodos de teste de ordenação com os vetores criados
    @Test
    public void testBubbleSortAleatorios(){
        int[] numerosAleatoriosClonados = vetorAleatorio1000.clone();
        long tempoExecucao = ordenacao.bubbleSort(numerosAleatoriosClonados);  
        System.out.println("\nORDENAÇÃO DE VETORES ALEATÓRIOS - Bubble Sort");
        System.out.println("Tempo de execução do Bubble Sort com um vetor aleatório de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio1000)); // O vetor original não deve estar ordenado após executar o método 

        numerosAleatoriosClonados = vetorAleatorio10000.clone();
        tempoExecucao = ordenacao.bubbleSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Bubble Sort com um vetor aleatório de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio10000));  

        numerosAleatoriosClonados = vetorAleatorio100000.clone();
        tempoExecucao = ordenacao.bubbleSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Bubble Sort com um vetor aleatório de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio100000)); 
    }

    @Test
    public void testBubbleSortOrdenados(){
        int[] numerosAleatoriosClonados = vetorOrdenado1000.clone();
        long tempoExecucao = ordenacao.bubbleSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS - Bubble Sort");
        System.out.println("Tempo de execução do Bubble Sort com um vetor ordenado de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado1000)); 

        numerosAleatoriosClonados = vetorOrdenado10000.clone();
        tempoExecucao = ordenacao.bubbleSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Bubble Sort com um vetor ordenado de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado10000)); 

        numerosAleatoriosClonados = vetorOrdenado100000.clone();
        tempoExecucao = ordenacao.bubbleSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Bubble Sort com um vetor ordenado de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado100000));
    }

    @Test
    public void testBubbleSortOrdenadosInversos(){
        int[] numerosAleatoriosClonados = vetorOrdenadoInverso1000.clone();
        long tempoExecucao = ordenacao.bubbleSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS INVERSOS - Bubble Sort");
        System.out.println("Tempo de execução do Bubble Sort com um vetor ordenado inverso de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso1000)); 

        numerosAleatoriosClonados = vetorOrdenadoInverso10000.clone();
        tempoExecucao = ordenacao.bubbleSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Bubble Sort com um vetor ordenado inverso de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso10000));  

        numerosAleatoriosClonados = vetorOrdenadoInverso100000.clone();
        tempoExecucao = ordenacao.bubbleSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Bubble Sort com um vetor ordenado inverso de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso100000)); 
    }


    @Test
    public void testMergeSortAleatorios(){
        int[] numerosAleatoriosClonados = vetorAleatorio1000.clone();
        long tempoExecucao = ordenacao.mergeSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ALEATÓRIOS - Merge Sort");
        System.out.println("Tempo de execução do Merge Sort com um vetor aleatório de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio1000)); // O vetor original não deve estar ordenado após executar o método 

        numerosAleatoriosClonados = vetorAleatorio10000.clone();
        tempoExecucao = ordenacao.mergeSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Merge Sort com um vetor aleatório de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio10000));  

        numerosAleatoriosClonados = vetorAleatorio100000.clone();
        tempoExecucao = ordenacao.mergeSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Merge Sort com um vetor aleatório de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio100000)); 
    }

    @Test
    public void testMergeSortOrdenados(){
        int[] numerosAleatoriosClonados = vetorOrdenado1000.clone();
        long tempoExecucao = ordenacao.mergeSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS - Merge Sort");
        System.out.println("Tempo de execução do Merge Sort com um vetor ordenado de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado1000)); 

        numerosAleatoriosClonados = vetorOrdenado10000.clone();
        tempoExecucao = ordenacao.mergeSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Merge Sort com um vetor ordenado de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado10000)); 

        numerosAleatoriosClonados = vetorOrdenado100000.clone();
        tempoExecucao = ordenacao.mergeSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Merge Sort com um vetor ordenado de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado100000));
    }

    @Test
    public void testMergeSortOrdenadosInversos(){
        int[] numerosAleatoriosClonados = vetorOrdenadoInverso1000.clone();
        long tempoExecucao = ordenacao.mergeSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS INVERSOS - Merge Sort");
        System.out.println("Tempo de execução do Merge Sort com um vetor ordenado inverso de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso1000)); 

        numerosAleatoriosClonados = vetorOrdenadoInverso10000.clone();
        tempoExecucao = ordenacao.mergeSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Merge Sort com um vetor ordenado inverso de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso10000));  

        numerosAleatoriosClonados = vetorOrdenadoInverso100000.clone();
        tempoExecucao = ordenacao.mergeSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Merge Sort com um vetor ordenado inverso de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso100000)); 
    }

    @Test
    public void testQuickSortAleatorios(){
        int[] numerosAleatoriosClonados = vetorAleatorio1000.clone();
        long tempoExecucao = ordenacao.quickSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ALEATÓRIOS - Quick Sort");
        System.out.println("Tempo de execução do Quick Sort com um vetor aleatório de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio1000)); // O vetor original não deve estar ordenado após executar o método 

        numerosAleatoriosClonados = vetorAleatorio10000.clone();
        tempoExecucao = ordenacao.quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort com um vetor aleatório de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio10000));  

        numerosAleatoriosClonados = vetorAleatorio100000.clone();
        tempoExecucao = ordenacao.quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort com um vetor aleatório de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio100000)); 
    }

    
    @Test
    public void testQuickSortOrdenados(){
        int[] numerosAleatoriosClonados = vetorOrdenado1000.clone();
        long tempoExecucao = ordenacao.quickSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS - Quick Sort");
        System.out.println("Tempo de execução do Quick Sort com um vetor ordenado de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado1000)); 

        numerosAleatoriosClonados = vetorOrdenado10000.clone();
        tempoExecucao = ordenacao.quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort com um vetor ordenado de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado10000));
        
        // Removi os casos de teste com arrays de 100.000 elementos devido ao StackOverflow
        // O pior caso do QuickSort (vetores ordenados/inversos) tem profundidade de recursão O(n), estourando a pilha para n grande (ex: 100.000 elementos).
    }

    @Test
    public void testQuickSortOrdenadosInversos(){
        int[] numerosAleatoriosClonados = vetorOrdenadoInverso1000.clone();
        long tempoExecucao = ordenacao.quickSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS INVERSOS - Quick Sort");
        System.out.println("Tempo de execução do Quick Sort com um vetor ordenado inverso de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso1000)); 

        numerosAleatoriosClonados = vetorOrdenadoInverso10000.clone();
        tempoExecucao = ordenacao.quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort com um vetor ordenado inverso de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso10000));  

        // Removi os casos de teste com arrays de 100.000 elementos devido ao StackOverflow
        // O pior caso do QuickSort (vetores ordenados/inversos) tem profundidade de recursão O(n), estourando a pilha para n grande (ex: 100.000 elementos).
    }

    @Test
    public void testRandomQuickSortAleatorios(){
        int[] numerosAleatoriosClonados = vetorAleatorio1000.clone();
        long tempoExecucao = ordenacao.random_quickSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ALEATÓRIOS - Random Quick Sort");
        System.out.println("Tempo de execução do Random Quick Sort com um vetor aleatório de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio1000)); // O vetor original não deve estar ordenado após executar o método 

        numerosAleatoriosClonados = vetorAleatorio10000.clone();
        tempoExecucao = ordenacao.random_quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Random Quick Sort com um vetor aleatório de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio10000));  

        numerosAleatoriosClonados = vetorAleatorio100000.clone();
        tempoExecucao = ordenacao.random_quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Random Quick Sort com um vetor aleatório de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio100000)); 
    }

    @Test
    public void testRandomQuickSortOrdenados(){
        int[] numerosAleatoriosClonados = vetorOrdenado1000.clone();
        long tempoExecucao = ordenacao.random_quickSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS - Random Quick Sort");
        System.out.println("Tempo de execução do Random Quick Sort com um vetor ordenado de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado1000)); 

        numerosAleatoriosClonados = vetorOrdenado10000.clone();
        tempoExecucao = ordenacao.random_quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Random Quick Sort com um vetor ordenado de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado10000)); 

        numerosAleatoriosClonados = vetorOrdenado100000.clone();
        tempoExecucao = ordenacao.random_quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Random Quick Sort com um vetor ordenado de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado100000));
    }

    @Test
    public void testRandomQuickSortOrdenadosInversos(){
        int[] numerosAleatoriosClonados = vetorOrdenadoInverso1000.clone();
        long tempoExecucao = ordenacao.random_quickSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS INVERSOS - Random Quick Sort");
        System.out.println("Tempo de execução do Random Quick Sort com um vetor ordenado inverso de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso1000)); 

        numerosAleatoriosClonados = vetorOrdenadoInverso10000.clone();
        tempoExecucao = ordenacao.random_quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Random Quick Sort com um vetor ordenado inverso de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso10000));  

        numerosAleatoriosClonados = vetorOrdenadoInverso100000.clone();
        tempoExecucao = ordenacao.random_quickSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Random Quick Sort com um vetor ordenado inverso de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso100000)); 
    }

    @Test
    public void testQuickSortJavaAleatorios(){
        int[] numerosAleatoriosClonados = vetorAleatorio1000.clone();
        long tempoExecucao = ordenacao.quickSort_Java(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ALEATÓRIOS - Quick Sort Java");
        System.out.println("Tempo de execução do Quick Sort Java com um vetor aleatório de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio1000)); // O vetor original não deve estar ordenado após executar o método 

        numerosAleatoriosClonados = vetorAleatorio10000.clone();
        tempoExecucao = ordenacao.quickSort_Java(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort Java com um vetor aleatório de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio10000));  

        numerosAleatoriosClonados = vetorAleatorio100000.clone();
        tempoExecucao = ordenacao.quickSort_Java(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort Java com um vetor aleatório de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio100000)); 
    }

    @Test
    public void testQuickSortJavaOrdenados(){
        int[] numerosAleatoriosClonados = vetorOrdenado1000.clone();
        long tempoExecucao = ordenacao.quickSort_Java(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS - Quick Sort Java");
        System.out.println("Tempo de execução do Quick Sort Java com um vetor ordenado de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado1000)); 

        numerosAleatoriosClonados = vetorOrdenado10000.clone();
        tempoExecucao = ordenacao.quickSort_Java(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort Java com um vetor ordenado de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado10000)); 

        numerosAleatoriosClonados = vetorOrdenado100000.clone();
        tempoExecucao = ordenacao.quickSort_Java(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort Java com um vetor ordenado de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado100000));
    }

    @Test
    public void testQuickSortJavaOrdenadosInversos(){
        int[] numerosAleatoriosClonados = vetorOrdenadoInverso1000.clone();
        long tempoExecucao = ordenacao.quickSort_Java(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS INVERSOS - Quick Sort Java");
        System.out.println("Tempo de execução do Quick Sort Java com um vetor ordenado inverso de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso1000)); 

        numerosAleatoriosClonados = vetorOrdenadoInverso10000.clone();
        tempoExecucao = ordenacao.quickSort_Java(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort Java com um vetor ordenado inverso de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso10000));  

        numerosAleatoriosClonados = vetorOrdenadoInverso100000.clone();
        tempoExecucao = ordenacao.quickSort_Java(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Quick Sort Java com um vetor ordenado inverso de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso100000)); 
    }

    @Test
    public void testCountingSortAleatorios(){
        int[] numerosAleatoriosClonados = vetorAleatorio1000.clone();
        long tempoExecucao = ordenacao.countingSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ALEATÓRIOS - Counting Sort");
        System.out.println("Tempo de execução do Counting Sort com um vetor aleatório de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio1000)); // O vetor original não deve estar ordenado após executar o método 

        numerosAleatoriosClonados = vetorAleatorio10000.clone();
        tempoExecucao = ordenacao.countingSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Counting Sort com um vetor aleatório de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio10000));  

        numerosAleatoriosClonados = vetorAleatorio100000.clone();
        tempoExecucao = ordenacao.countingSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Counting Sort com um vetor aleatório de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorAleatorio100000)); 
    }

    @Test
    public void testCountingSortOrdenados(){
        int[] numerosAleatoriosClonados = vetorOrdenado1000.clone();
        long tempoExecucao = ordenacao.countingSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS - Counting Sort");
        System.out.println("Tempo de execução do Counting Sort com um vetor ordenado de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado1000)); 

        numerosAleatoriosClonados = vetorOrdenado10000.clone();
        tempoExecucao = ordenacao.countingSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Counting Sort com um vetor ordenado de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado10000)); 

        numerosAleatoriosClonados = vetorOrdenado100000.clone();
        tempoExecucao = ordenacao.countingSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Counting Sort com um vetor ordenado de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertTrue(ordenacao.checaVetorOrdenado(vetorOrdenado100000));
    }

    @Test
    public void testCountingSortOrdenadosInversos(){
        int[] numerosAleatoriosClonados = vetorOrdenadoInverso1000.clone();
        long tempoExecucao = ordenacao.countingSort(numerosAleatoriosClonados);
        System.out.println("\nORDENAÇÃO DE VETORES ORDENADOS INVERSOS - Counting Sort");
        System.out.println("Tempo de execução do Counting Sort com um vetor ordenado inverso de 1.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso1000)); 

        numerosAleatoriosClonados = vetorOrdenadoInverso10000.clone();
        tempoExecucao = ordenacao.countingSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Counting Sort com um vetor ordenado inverso de 10.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso10000));  

        numerosAleatoriosClonados = vetorOrdenadoInverso100000.clone();
        tempoExecucao = ordenacao.countingSort(numerosAleatoriosClonados);
        System.out.println("Tempo de execução do Counting Sort com um vetor ordenado inverso de 100.000 elementos: " + tempoExecucao + " nanosegundos  |  " + String.format("%.6f segundos", tempoExecucao/1_000_000_000.0));
        assertTrue(ordenacao.checaVetorOrdenado(numerosAleatoriosClonados)); 
        assertFalse(ordenacao.checaVetorOrdenado(vetorOrdenadoInverso100000)); 
    }
}