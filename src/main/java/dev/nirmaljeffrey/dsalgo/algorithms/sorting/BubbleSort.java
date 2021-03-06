package dev.nirmaljeffrey.dsalgo.algorithms.sorting;

public class BubbleSort implements Sorter {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int bubbleFlag = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Sorter.swap(array, j, j + 1);
                    bubbleFlag = 1;
                }
            }
            if (bubbleFlag == 0) {
                break;
            }
        }
    }
}
