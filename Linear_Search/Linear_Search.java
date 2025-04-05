package Linear_Search;

public class Linear_Search {
    public static String linearSearch(int []a ,int target){

        if (a == null){
            return "array is null";
        }
        if(a.length == 0){
            return "Array length is zero";
        }



        for (int index = 0; index < a.length; index++) {
            if(a[index] == target){
                return "Element Found at index: "+index;
            }
        }

        return "Element Not Found";
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
//        int [] a= null;
        int target = 20;
        String ans = linearSearch(a,target);
        System.out.println(ans);

    }
}
