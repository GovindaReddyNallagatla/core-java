package sorting;

public class Merge {

    static void merge(int[] a, int p, int q, int r) {

        // l[n1] => A[p,q]
        // m[n2] => A[q+1,r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] l = new int[n1];
        int[] m = new int[n2];

        for (int i = 0; i < n1; i++) {
            l[i] = a[p + i];
        }
        for (int i = 0; i < n2; i++) {
            m[i] = a[q + 1 + i];
        }

        // Maintain current index of sub-arrays and main array
        int i = 0, j = 0, k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (l[i] <= m[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = m[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            a[k] = l[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = m[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] a, int l, int r) {

        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void display(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
        mergeSort(arr1, 0, arr1.length - 1);
        display(arr1);

    }
}
