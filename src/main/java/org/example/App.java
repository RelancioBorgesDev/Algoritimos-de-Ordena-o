package org.example;

import org.example.sort.SortAlgos;
import org.example.structs.Graph;

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
        //sa.InsertionSort(vetor3);
        System.out.println(Arrays.toString(sa.QuickSort(vetor, 0, vetor.length-1)));
       //System.out.println(Arrays.toString(sa.SelectionSort(vetor2)));

        Graph gr = new Graph(4);
        gr.addEdge(1,2);
        gr.addEdge(0,1);
        gr.addEdge(2,1);
        gr.addEdge(1,0);
        gr.addEdge(3,2);
        gr.addEdge(2,3);

        System.out.println(gr);

    }
}
