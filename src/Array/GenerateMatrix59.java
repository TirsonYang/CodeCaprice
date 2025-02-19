package Array;

import java.util.Arrays;

public class GenerateMatrix59 {
    public static int[][] generateMatrix(int n){
        int[][] matrix=new int[n][n];
        int startX=0,startY=0;
        int offset=1;
        int i=0;        //横坐标
        int j=0;        //纵坐标
        int count=1;
        int num=n/2;
        while (num>0){
            for (j = startY; j < n-offset; j++) {
                matrix[startX][j]=count;
                count++;
            }
            for (i = startX; i < n-offset; i++) {
                matrix[i][j]=count;
                count++;
            }
            for (; j >startY ; j--) {
                matrix[i][j]=count;
                count++;
            }
            for (;i>startX;i--){
                matrix[i][j]=count;
                count++;
            }
            startY++;
            startX++;
            offset++;
            num--;
        }
        if(n%2==1){
            matrix[n/2][n/2]=count;
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(4)));
    }
}
