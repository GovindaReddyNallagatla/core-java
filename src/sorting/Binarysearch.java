package sorting;

public class Binarysearch {

    // static void binarySer(int[] a, int key) {
    // int first = 0;
    // int last = a.length - 1;
    // int mid = (first + last) / 2;
    // while (first <= last) {
    // if (a[mid] < key) {
    // first = mid + 1;
    // } else if (a[mid] == key) {
    // System.out.println("element " + key + " is found at index : " + mid);
    // break;
    // } else {
    // last = mid - 1;
    // }
    // mid = (first + last) / 2;
    // }
    // if (first > last) {
    // System.out.println("ELement not found");
    // }
    // }

    static int recursiveBin(int[] a, int f, int l, int k) {
        if (l >= f) {
            int m = f + (l - f) / 2;
            if (a[m] == k) {
                return m;
            }
            if (a[m] > k) {
                return recursiveBin(a, f, m - 1, k);
            } else {
                return recursiveBin(a, m + 1, l, k);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        int key = 10;
        int last = arr.length - 1;
        int result = recursiveBin(arr, 0, last, key);
        if (result == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element " + key + " is found at index: " + result);

        binarySer(arr, 30);
    }

    static void binarySer(int[] a, int key) {
        int f = 0;
        int l = a.length - 1;
        int m = (f + l) / 2;
        while (f <= l) {
            if (a[m] < key) {
                f = m + 1;
            } else if (a[m] == key) {
                System.out.println("Element " + key + " is found at index " + m);
                break;
            } else {
                l = m - 1;
            }
            m = (f + l) / 2;
        }
        if (f > l) {
            System.out.println("Element Not Found");
        }
    }

}
