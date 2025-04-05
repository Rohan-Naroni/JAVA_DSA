package Arrays.SecondLargest;

public class SecondLargest {

    public static void main(String[] args) {


        /*

//        worst complexity

        int arr[] = {5,4,3,2,1};

        Arrays.sort(arr);
//if we sort an arry the worst complexity is  worst complexity is 0(n log n)

        for (int res: arr){
//            System.out.println(res);
        }

        System.out.println("Largest is "+arr.length);
        System.out.println("Second Largest is "+(arr.length-1));

*/

        int arr[] = {5,5,5,5,5};


        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;



        for (int i = 0; i<arr.length;i++){
            if (arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondlargest && arr[i]<largest){
                secondlargest = arr[i];
            }
        }


        if (secondlargest == Integer.MIN_VALUE){
            System.out.println("no second largest");
        }else {
            System.out.println(secondlargest);
        }





    }
}
