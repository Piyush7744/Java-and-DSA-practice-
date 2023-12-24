public class zeroes2DArray{

    public static int[][] changeMatrix(int [][]matrix,int row,int col){
        
        int a[][] = new int[matrix.length][matrix[0].length];
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                a[i][j] = matrix[i][j];
            }
         }

        int n=matrix[0].length;
        for(int i=0;i<n;i++){
            a[row][i]=0;
        }
        for(int i=0;i<matrix.length;i++){
            a[i][col]=0;
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
         }
        return a;
    }

    public static void setZeroes(int[][] matrix) {

        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++){
                if(matrix[i][j] == 0){
                    changeMatrix(matrix,i,j);
                }else{
                    continue;
            }
        }
    }
}

public static void main(String args[]){
    int matrix[][] = {
                        {0,1,2,0},
                        {3,4,5,2},
                        {1,3,1,5}
                        };
                        setZeroes(matrix);
}

}