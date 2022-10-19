package DSA.arr;

public class TrappingRainDrops {

    public static int trappedDrops(int[] heights){

        if(heights.length<3)
            return 0;
        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];

        leftMax[0]=0;
        for(int i=1;i<leftMax.length;i++)
            leftMax[i]=Math.max(leftMax[i-1],heights[i-1]);

        rightMax[rightMax.length-1]=0;
        for(int i=rightMax.length-2;i>=0;--i)
            rightMax[i]=Math.max(rightMax[i+1],heights[i+1]);

        int trapped=0;
        for(int i=1;i<heights.length-1;i++){
            if(Math.min(leftMax[i],rightMax[i])>heights[i])
                trapped+=Math.min(leftMax[i],rightMax[i])-heights[i];
        }
        return trapped;
    }

    public static void main(String[] args) {
        // O(N) time complexity
        // But with O(N) extra memory
        // we can achieve O(N) with two pointer Algorithm with without extra memory
        System.out.println(trappedDrops(new int[]{1,0,2,1,3,1,2,0,3}));
        System.out.println(trappedDrops(new int[]{4,1,3,1,5}));
    }

}
