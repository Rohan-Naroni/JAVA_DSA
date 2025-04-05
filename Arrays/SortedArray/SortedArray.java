package Arrays.SortedArray;

public class SortedArray {


    public static void sorted(){
        int [] arr= {10,20,60,50,50,60};
        boolean sorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }


        if(sorted){
            System.out.println("Sorted");
        }else{
            System.out.println("not sorted");
        }

    }


    public static void main(String[] args) {

sorted();



    }
}
