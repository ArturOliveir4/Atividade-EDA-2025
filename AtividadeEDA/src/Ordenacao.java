public class Ordenacao {

    public static void bubbleSort(int[] vetor){
        int n = vetor.length;
        for(int i=0; i < n-1; i++){
            for(int j=0; j < n-i-1; j++){
                if(vetor[j] > vetor[j+1]){
                    swap(vetor, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] vetor, int i, int j){
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

}