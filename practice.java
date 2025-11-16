import java.util.Scanner;





public class practice {

    static void printMatrix(int[][] matrix){
        for(int i=0 ; i< matrix.length;i++){
            for(int j=0; j< matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] transpose (int[][] matrix ,int r, int c){
        int[][] ans = new int[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];

            }

        }
        return ans;

    }

    static void reverse(int[] arr){
        int i =0, j = arr.length - 1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][] matrix,int n){
        transpose(matrix,n,n);
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);

        }


    }

    static int[][] pascaltri(int n){
        int[][] ans =new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i -1][j]+ans[i-1][j-1];

            }


        }
        return ans;
    }

    public static void main(String[] args){


        System.out.println("enter number of rows and coloumn of matrix");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n ");
        int n = sc.nextInt();
        int[][] ans =pascaltri(n);
        printMatrix(ans);

    }
}
