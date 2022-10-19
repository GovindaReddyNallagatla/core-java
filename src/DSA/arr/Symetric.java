package DSA.arr;

public class Symetric {

    public static boolean checkSymmetric(){
        int rows=0,cols=0;
        int[][] matrix=new int[rows][cols];
        if ( rows != cols )
        {
            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
        }
        else
        {
            boolean symmetric = true;
            for ( int i = 0; i < rows; i++ )
            {
                for ( int j = 0; j < cols; j++ )
                {
                    if ( matrix[i][j] != matrix[j][i] )
                    {
                        symmetric = false;
                        break;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
