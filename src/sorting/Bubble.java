package sorting;

public class Bubble {

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    public static void optimizedBubbleSort(int[] a) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };

        bubbleSort(arr1);
        for (int a : arr1) {
            System.out.print(a + " ");
        }
        System.out.println();
        optimizedBubbleSort(arr1);
        for (int a : arr1) {
            System.out.print(a + " ");
        }
    }

}
