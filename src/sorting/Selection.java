package sorting;

public class Selection {


    static void selSort(int[] a) {
    
        for (int i = 0; i < a.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            int small = a[index];
            a[index] = a[i];
            a[i] = small;
        }
}


    public static void main(String[] args) {
        int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
        selSort(arr1);
        for (int a : arr1) {
            System.out.println(a);
        }

    }
}
