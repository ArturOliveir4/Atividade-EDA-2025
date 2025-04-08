package com.atividade.model.services;

import java.util.Arrays;
import java.util.Random;

public class Ordenacao implements Ordenacao_IF{

    @Override
    public boolean checaVetorOrdenado(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n-1; i++) {
            if(vetor[i] > vetor[i+1]){
                return false; 
            }
        }
        return true; 
    }

    @Override
    public long bubbleSort(int[] vetor){
        long inicio = System.nanoTime();

        int n = vetor.length;
        for(int i=0; i < n-1; i++){
            for(int j=0; j < n-i-1; j++){
                if(vetor[j] > vetor[j+1]){
                    swap(vetor, j, j+1);
                }
            }
        }

        long fim = System.nanoTime();

        return fim - inicio;
    }

    public static void swap(int[] vetor, int i, int j){
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
	
    @Override
    public long mergeSort(int[] vetor){
        long inicio = System.nanoTime();

        int n = vetor.length;
        
        if(n <= 1){
            return 1; 
        }
        
        int[] vetorExtra = new int[n];
        mergeSortRec(vetor, vetorExtra, 0, n-1);
        
        long fim = System.nanoTime();

        return fim - inicio;
    }

    public void mergeSortRec(int[] vetor, int[] vetorExtra, int inicio, int fim){
        if(inicio < fim){
            int meio = inicio + (fim - inicio)/2;
            mergeSortRec(vetor, vetorExtra, inicio, meio);      
            mergeSortRec(vetor, vetorExtra, meio+1, fim);   
            merge(vetor, vetorExtra, inicio, meio, fim);            
        }
    }

    private void merge(int[] vetor, int[] vetorExtra, int inicio, int meio, int fim) {

        for(int i=inicio; i <= fim; i++){
            vetorExtra[i] = vetor[i];
        }
        
        int k = inicio;   
        int i = inicio;      
        int j = meio + 1;     
        while(i <= meio && j <= fim){
            if(vetorExtra[i] <= vetorExtra[j]){
                vetor[k] = vetorExtra[i];
                i++;
            }else{
                vetor[k] = vetorExtra[j];
                j++;
            }
            k++;
        }
        
        while(i <= meio){
            vetor[k] = vetorExtra[i];
            i++;
            k++;
        }
    }

    @Override
	public long quickSort(int[] vetor){
        long inicio = System.nanoTime();

        quickSort(vetor, 0, vetor.length - 1);

        long fim = System.nanoTime();

        return fim - inicio;
    }

    public void quickSort(int[] vetor, int esquerda, int direita){
        if(esquerda < direita){
            int pivo = partition(vetor, esquerda, direita);
            quickSort(vetor, esquerda, pivo-1);
            quickSort(vetor, pivo+1, direita);
        }
        
    }

    public int partition(int[] vetor, int esquerda, int direita){
        int j = direita;
        int p = vetor[esquerda];
        int i = esquerda+1;
        
        while(i <= j){
            if(vetor[i] <= p){
                i++;
            }else if (vetor[j] > p){
                j--;
            }else{
                swap(vetor, i, j);
            }
        }

        swap(vetor, esquerda, j);

        return j;
    }
	
    @Override
	public long random_quickSort(int[] vetor){
        long inicio = System.nanoTime();
    
        shuffle(vetor);
        quickSort(vetor, 0, vetor.length - 1);
        
        long fim = System.nanoTime();

        return fim - inicio;
    }

    public void shuffle(int[] vetor){
        Random rnd = new Random();

        for(int i = vetor.length - 1; i > 0; i--){
            int j = rnd.nextInt(i+1); // i+1 por causa do funcionamento do método nextInt que vai até o elemento do parâmetro-1
            swap(vetor, i, j);
        }
    }
	
    @Override
	public long quickSort_Java(int[] vetor){
        long inicio = System.nanoTime();
    
        Arrays.sort(vetor);
        
        long fim = System.nanoTime();
        
        return fim - inicio;
    }
	
    @Override
	public long countingSort(int[] vetor){
        long inicio = System.nanoTime();

        int n = vetor.length;

        int maximo = vetor[0];
        for(int numero : vetor){
            if(numero > maximo){
                maximo = numero;
            }
        }

        int[] vetorOrdenado = new int[n];
        int[] vetorContagem = new int[maximo + 1];

        for(int numero : vetor){
            vetorContagem[numero]++;
        }

        for(int i = 1; i <= maximo; i++){
            vetorContagem[i] += vetorContagem[i-1];
        }

        for(int i = n - 1; i >= 0; i--){
            vetorOrdenado[vetorContagem[vetor[i]]-1] = vetor[i];
            vetorContagem[vetor[i]]--;
        }

        // Cópia do array ordenado para o original/inicial
        System.arraycopy(vetorOrdenado, 0, vetor, 0, n);

        long fim = System.nanoTime();

        return fim - inicio;
    }

    @Override
    public long selectionSort(int[] numeros) {
        return -1;
    }
    
    @Override
    public long insertionSort(int[] numeros) {
        return -1;
    }    

}