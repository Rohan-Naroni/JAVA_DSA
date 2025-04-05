package Binary_Search;

public class Order_Egnostic {
    public static void main(String[] args) {
//        int a[] = {10,20,30,40,50,60,70,80,90};
        int a[] = {90,80,70,60,50,40,30,20,10};

        int target = 80;

        int ans  = O_E(a,target);
        System.out.println(ans);

    }




    static int O_E(int a[], int target){

        int start = 0;
        int end = a.length-1;

        // check weather the array is given in ASC or DESC
        // boolean isAsc = a[start] < a[end];


        boolean isAsc;
        if (a[start]<a[end]){   // check weather the given array is in ascending or decending
            isAsc = true;
        }else{
            isAsc = false;
        }



        while(start <= end){
            int mid = start + (end - start)/2;

            if (isAsc == true) {  // ascending order

                if (a[mid] == target) {
                    return mid;
                } else if (target > a[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }else {   // this else part for decending order

                if (a[mid] == target){
                    return mid;
                } else if (target>a[mid] ) {
                    end = mid -1;
                }else {
                    start = mid+1;
                }

            }

        }
        return -1;
    }
}
