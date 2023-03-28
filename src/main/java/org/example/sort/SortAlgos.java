package org.example.sort;

public class SortAlgos {

    public int[] SelectionSort(int [] vetor){
        int small = 0;
        int nextValue = 0;
        int pos = 0;
        int count = 0;

        for (int i = 0; i < vetor.length-1; i++){
            small = vetor[i];
            pos = i;
            for (int j = i+1; j < vetor.length; j++){
                nextValue = vetor[j];
                if(nextValue < small){
                    count++;
                    small = vetor[j];
                    pos = j;
                }
            }
                vetor[pos] = vetor[i];
                vetor[i] = small;
        }
        System.out.println("O If foi utilizado: " + count + " vezes.");
        return vetor;
    }

    public int [] BubbleSort(int [] vetor){
        int num1 = 0;
        int num2 = 0;
        int count = 0;

        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length-i-1; j++){
                num1 = vetor[j];
                num2 = vetor[j+1];
                if(num1 > num2){
                    count++;
                    vetor[j] = num2;
                    vetor[j+1] = num1;
                }
            }
        }

        System.out.println("O If foi utilizado: " + count + " vezes.");
        return vetor;
    }

    public int[] InsertionSort(int [] vetor){
        for(int i = 1; i < vetor.length; i++) {
            int temp = vetor[i];
            int count = 0;
            for (int j = i - 1; j >= 0 && vetor[j] > temp; j--) {
                vetor[j + 1] = vetor[j];
                count++;
            }
             vetor[i - count] = temp;
        }

        return vetor;
    }


    public int[] QuickSort(int[] vetor, int low, int high ){
        int pivot = vetor.length-1;
        int lp = low;
        int rp = high;

        if(low >= high){
            return vetor;
        }

        while(lp < rp){
            while(vetor[lp] <= vetor[pivot] && lp < rp) {
                lp++;
            }
            while(vetor[rp] >= vetor[pivot] && lp < rp){
                rp--;
            }
            trocar(vetor, lp, rp);
        }
        trocar(vetor, lp, high);

        QuickSort(vetor, low, lp-1);
        QuickSort(vetor, lp+1, high);

        return vetor;
    }

    private void trocar (int[] vetor, int index1, int index2){
        int aux = vetor[index1];
        vetor[index1] = vetor[index2];
        vetor[index2] = aux;
    }

}
