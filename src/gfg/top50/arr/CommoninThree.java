package gfg.top50.arr;

import java.util.ArrayList;
import java.util.Arrays;

public class CommoninThree {

    private static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> al=new ArrayList<>();

        return al;
    }
    public static void main(String[] args) {
        int[] A= Arrays.stream("-69 -68 -39 -25 -6 18 33 39 42 46 52 55 55 64 71".split(" ")).mapToInt(Integer::new).toArray();
        int[] B=Arrays.stream(("-97 -92 -90 -90 -87 -85 -82 -77 -77 -77 -75 -71 -67 -64 -60 -59 -58 -52 -49 -48 -48 -47 -47 -46 -41" +
                " -36 -35 -29 -28 -26 -25 -20 -19 -14 -13" +
                " -13 -11 -10 -6 -4 2 3 9 12 15 17 20 22 23 24 27 29 36 36 37 38 39 42 45 47 48 48 50 52 52 53 57 59 60 63 63" +
                " 64 64 65 68 70 71 76 76 77 83 83 84 85 86 89 97 97").split(" ")).mapToInt(Integer::new).toArray();
        int[] C=Arrays.stream(("-95 -95 -86 -83 -70 -67 -57 -53 -52 -35 -33 -32 -30 -20 -16 -15 -15 -11 -10 -10 -4 0 4 15" +
                " 18 34 36 37 39 41 43 43 48 49 50 51 58 63 64 67 69 77 79 84 84 94 95 97").split(" ")).mapToInt(Integer::new).toArray();
        System.out.println(commonElements(A,B,C,15,88,48));
    }
}
