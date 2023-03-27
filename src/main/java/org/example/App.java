package org.example;

import org.example.sort.SortAlgos;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        int [] vetor = {20,3,5,9,1};
        SortAlgos sa = new SortAlgos();
        sa.SelectionSort(vetor);
    }
}
