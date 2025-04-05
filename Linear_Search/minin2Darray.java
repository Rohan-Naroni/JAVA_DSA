package Linear_Search;

public class minin2Darray {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},
                     {-8,-9,1,0},
                     {-6,-4,-1}};

        int res[] = min(a);
        System.out.println("MIN VALUE IN ARRAY IS: "+res[0]);
        System.out.println("INDEX: "+"["+res[1]+","+res[2]+"]");
    }
    public static int [] min(int a[][]){
        if (a == null || a.length == 0) {
            return null;
        }

        int ans = a[0][0];
        int row = 0;
        int column =0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] < ans){
                    ans = a[i][j];
                    row = i;
                    column = j;
                }

            }
        }
        return new int[]{ans,row,column};
    }
}
