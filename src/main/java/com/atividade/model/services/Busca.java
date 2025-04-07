package com.atividade.model.services;

public class Busca implements Busca_IF{

    @Override
    public int[] geraVetorNumericoOrdenado(int tamanho){
        if(tamanho <= 0){
            return new int[0];
        }
        
        int[] vetorOrdenado = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            vetorOrdenado[i] = i + 1; 
        }

        return vetorOrdenado;
    }
	
    @Override
	public boolean buscaLinear_iterativa(int[] vetor, int k){
        if (vetor == null || vetor.length == 0){
            return false;
        }

        for(int numero : vetor){
            if(numero == k){
                return true;
            }
        }

        return false;
    }

    @Override
	public boolean buscaLinear_recursiva(int[] vetor, int k){
        return buscaLinear_recursiva(vetor, k, 0);
    }

    private boolean buscaLinear_recursiva(int[] vetor, int k, int i){
        if(i >= vetor.length){
            return false;
        }

        if(vetor[i] == k){
            return true;
        }

        return buscaLinear_recursiva(vetor, k, i+1);
    }

    @Override
	public boolean buscaBinaria_iterativa(int[] vetor, int k){
        int inicio = 0;
        int fim = vetor.length-1;
        
        while(inicio <= fim){
            int meio = inicio + (fim - inicio)/2; 
            
            if(vetor[meio] == k){
                return true;
            }else if(vetor[meio] < k){
                inicio = meio + 1;
            }else{
                fim = meio - 1; 
            }
        }
        
        return false; 
    }

    @Override
	public boolean buscaBinaria_recursiva(int[] vetor, int k){
        return buscaBinaria_recursiva(vetor, k, 0, vetor.length-1);
    }

    public boolean buscaBinaria_recursiva(int[] vetor, int k, int inicio, int fim){
        if(inicio>fim){
            return false;
        }
        
        int meio = inicio + (fim - inicio)/2; 
        
        if(vetor[meio] == k){
            return true; 
        }else if(vetor[meio] < k){
            return buscaBinaria_recursiva(vetor, k, meio+1, fim);
        }else{
            return buscaBinaria_recursiva(vetor, k, inicio, meio-1);
        }
    }

    @Override
	public boolean buscaLinear_iterativa_duasPontas(int[] vetor, int k){
        int inicio = 0;
        int fim = vetor.length-1;
        
        while(inicio <= fim){
            if(vetor[inicio] == k){
                return true;
            }
            
            if(vetor[fim] == k && inicio != fim){
                return true;
            }
    
            fim--;
            inicio++;
        }
        
        return false;
    }
}
