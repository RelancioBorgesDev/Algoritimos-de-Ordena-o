package org.example.sort;

public class SortAlgos {

    public int[] SelectionSort(int [] vetor){
        int small = 0;
        int nextValue = 0;
        int pos = 0;

        for (int i = 0; i < vetor.length-1; i++){
            small = vetor[i];
            pos = i;
            for (int j = i+1; j < vetor.length; j++){
                nextValue = vetor[j];
                if(nextValue < small){
                    small = vetor[j];
                    pos = j;
                }
            }
                vetor[pos] = vetor[i];
                vetor[i] = small;
        }

        return vetor;
    }
}
