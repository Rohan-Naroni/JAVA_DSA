package Arrays.Rotate_an_Array;

public class Rotate_Array_by_Single_Place {

    public static void main(String[] args) {

        int a[] = {1,3,5,7,9};
        int temp = a[0];

        for (int i = 1; i < a.length; i++) {

            a[i-1]  = a[i];
            
        }

        a[a.length-1] = temp;


        for (int arr : a) {
            System.out.println(arr);
        }

    }

}
