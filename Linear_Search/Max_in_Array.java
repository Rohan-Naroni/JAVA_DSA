package Linear_Search;

public class Max_in_Array {
    public static void main(String[] args) {
        int [] a = {10,20,50,-300,700,40,75};
        System.out.println("Largest element in array is: "+max(a));

    }

    static int max(int a[]){

        if(a.length ==0){
            System.out.println("Array is empty");
        }
        int ans = a[0];
        for (int index = 0; index < a.length; index++) {
            if (a[index] > ans){
                ans = a[index];
            }
        }
        return ans;
    }
}
