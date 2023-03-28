package org.example;

import org.example.sort.SortAlgos;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        int [] vetor = {8,5,1,3};
        int [] vetor2 = {8,5,1,3};
        int [] vetor3 = {8,5,1,3};
        SortAlgos sa = new SortAlgos();
        //sa.BubbleSort(vetor);
        sa.InsertionSort(vetor3);
       //System.out.println(Arrays.toString(sa.SelectionSort(vetor2)));
    }
}
