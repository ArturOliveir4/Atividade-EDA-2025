package com.atividade.model.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Ordenacao_Test {

    private final Ordenacao_IF ordenacao = new Ordenacao();

    private int[] numerosDesordenados = {
        1,3,5,7,9,2,4,6,8,10,11,13,15,12,14
    };
    
    @Test
    public void testChecaVetorOrdenado() {
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original, para os testes, não deve estar ordenado
    }

    @Test
    public void testBubbleSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        long tempoExecucao = ordenacao.bubbleSort(numerosDesordenadosClonados);
        System.out.println("Tempo de execução do Bubble Sort: " + tempoExecucao + " nanosegundos");
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testSelectionSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        long tempoExecucao = ordenacao.selectionSort(numerosDesordenadosClonados);
        System.out.println("Tempo de execução do Selection Sort: " + tempoExecucao + " nanosegundos");
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
   }
    
    @Test
    public void testInsertionSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        long tempoExecucao = ordenacao.insertionSort(numerosDesordenadosClonados);
        System.out.println("Tempo de execução do Insertion Sort: " + tempoExecucao + " nanosegundos");
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testMergeSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        long tempoExecucao = ordenacao.mergeSort(numerosDesordenadosClonados);
        System.out.println("Tempo de execução do Merge Sort: " + tempoExecucao + " nanosegundos");
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testQuickSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        long tempoExecucao = ordenacao.quickSort(numerosDesordenadosClonados);
        System.out.println("Tempo de execução do Quick Sort dos slides: " + tempoExecucao + " nanosegundos");
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testRandomQuickSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        long tempoExecucao = ordenacao.random_quickSort(numerosDesordenadosClonados);
        System.out.println("Tempo de execução do Quick Sort com shuffle: " + tempoExecucao + " nanosegundos");
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testQuickSortJava() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        long tempoExecucao = ordenacao.quickSort_Java(numerosDesordenadosClonados);
        System.out.println("Tempo de execução do Quick Sort do Java: " + tempoExecucao + " nanosegundos");
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testCountingSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        long tempoExecucao = ordenacao.countingSort(numerosDesordenadosClonados);
        System.out.println("Tempo de execução do Counting Sort: " + tempoExecucao + " nanosegundos");
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
}
