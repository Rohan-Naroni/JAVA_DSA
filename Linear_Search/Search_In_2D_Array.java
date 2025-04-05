package Linear_Search;

public class Search_In_2D_Array {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4, 5},
                     {6, 7, 8},
                     {11, 12, 13,75,89}};

        System.out.println(a.length);


        int target = 3;
      int res [] = search2darray(a, target);
      if (res!=null){
          System.out.println("element found at ["+res[0]+", "+res[1]+"]");
      }else {
          System.out.println("Element Not Found");
      }
    }

    public static int[] search2darray(int[][] a, int target) {

        if (a.length == 0 || a == null){
            return null;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j<a[i].length; j++) {  // we can use j<a[i].length
                if (a[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
