package Binary_Search;

public class Binary_Search01 {

    public static void main(String[] args) {
        int [] arr ={1,5,6,8,9,13,24,57,78,90,99};
        int target = 78;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
//        Avoid integer overflow
//        int mid = start+end/2;
//        use this
            int mid = start +(end - start) / 2;


            if(arr[mid] == target){
                return mid;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
