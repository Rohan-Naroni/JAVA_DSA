package Linear_Search;

import java.util.Arrays;

public class maxIn2DArray {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4, 5},
                {6, 7, 8},
                {11, 12, 13,75,89}};

        int res[]  = search2darray(a);
        System.out.println("MAX VALUE IN ARRAY IS: "+res[0]);
        System.out.println("INDEX: "+"["+res[1]+","+res[2]+"]");

    }


    public static int[] search2darray(int[][] a) {
        if (a.length == 0 || a == null){
            return null;
        }
        int ans = a[0][0];
        int row =0;
        int column =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j<a[i].length; j++) {  // we can use j<a[i].length
                if (a[i][j] > ans){
                    ans = a[i][j];
                    row = i;
                    column = j;

                }
            }
        }
        return new int[]{ans,row,column};
    }
}
