package Arrays.Largest;

public class LargestElement {

    public static void main(String[] args) {




        int arr[] = {1,2,3,4,5,6,6,7};
        int largest = Integer.MIN_VALUE;


        for (int i = 0; i< arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }
}
