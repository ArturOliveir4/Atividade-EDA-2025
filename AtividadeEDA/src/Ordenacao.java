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
        int n = vetor.length;
        for(int i=0; i < n-1; i++){
            for(int j=0; j < n-i-1; j++){
                if(vetor[j] > vetor[j+1]){
                    swap(vetor, j, j+1);
                }
            }
        }
        return 1;
    }

    public static void swap(int[] vetor, int i, int j){
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    @Override
    public long selectionSort(int[] numeros){
        return -1;
    }
	
    @Override
	public long insertionSort(int[] numeros){
        return -1;
    }
	
    @Override
    public long mergeSort(int[] vetor) {
        int n = vetor.length;
        
        if(n <= 1){
            return 1; 
        }
        
        int[] vetorExtra = new int[n];
        mergeSortRec(vetor, vetorExtra, 0, n-1);
        
        return 1;
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
        quickSort(vetor, 0, vetor.length - 1);
        return 1;
    }

    public void quickSort(int[] vetor, int esquerda, int direita){
        if(esquerda < direita){
            int pivo = partition(vetor, esquerda, direita);
            quickSort(vetor, direita, pivo-1);
            quickSort(vetor, pivo+1, direita);
        }
        
    }

    private int partition(int[] vetor, int esquerda, int direita) {
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
	public long random_quickSort(int[] numeros){
        return 1;
    }
	
    @Override
	public long quickSort_Java(int[] numeros){
        return 1;
    }
	
    @Override
	public long countingSort(int[] numeros){
        return 1;
    }

}