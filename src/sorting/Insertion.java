package sorting;

public class Insertion {

    static void insertionSort(int[] a) {

        for (int unSorIndex = 1; unSorIndex < a.length; unSorIndex++) {
            int newElement = a[unSorIndex];
            int i;
            for (i = unSorIndex; i>0 && a[i - 1] > newElement; i--) {
                a[i] = a[i - 1];
            }
            a[i] = newElement;
        }
    }

    static void shellSort(int[] a) {
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int newElement = a[i];
                int j = i;
                while (j >= gap && a[j - gap] > newElement) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = newElement;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
        insertionSort(arr1);
        //shellSort(arr1);
        for (int a : arr1) {
            System.out.println(a);
        }
    }

}
