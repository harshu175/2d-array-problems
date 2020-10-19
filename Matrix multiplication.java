import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int arr1[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int arr2[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }
        //matrix multiplication is possible if both c1 and r2 are equal.
        if (c1 != r2) {
            System.out.println("Invalid input");
            return;
        }
        int[][] prd=new int[r1][c2];
        
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                for(int k=0;k<c1;k++){
                    prd[i][j]+=arr1[i][k] * arr2[k][j];
                }

            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(prd[i][j] + " ");

            }
            System.out.println();
        }



    }

}
