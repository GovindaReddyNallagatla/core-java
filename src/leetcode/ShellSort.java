package leetcode;

public class ShellSort {

    public static void main(String[] args) {

        int a[] = {20,35,-15,7,55,1,-22};
        for(int gap=a.length;gap>0;gap/=2){
            for (int i=gap;i<a.length;i++){
                int j=i,newEle=a[i];
                while (j>=gap && a[j-gap]>newEle){
                    a[j]=a[j-gap];
                    j-=gap;
                }
                a[j]=newEle;
            }
        }
    }
}
