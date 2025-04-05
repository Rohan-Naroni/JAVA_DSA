package Linear_Search;

public class Min_in_Array {
    public static void main(String[] args) {

        int[] a = {-10, 1, 5, 7, 10, -75, -100, -6, -1};
        System.out.println("Smallest element in array is: "+min(a));

    }

    static int min(int a[]){

        if(a.length ==0){
            System.out.println("Array is empty");
        }
        int ans = a[0];
        for (int index = 0; index < a.length; index++) {
            if (a[index] < ans){
                ans = a[index];
            }
        }
        return ans;

    }
}
