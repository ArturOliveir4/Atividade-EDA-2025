import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception {
        int[] vetor = { 64, 34, 25, 12, 22, 11, 90, 5, 77, 18 };
        System.out.println(Arrays.toString(vetor)); 

        Ordenacao.bubbleSort(vetor);
        System.out.println(Arrays.toString(vetor)); 
    }
}
