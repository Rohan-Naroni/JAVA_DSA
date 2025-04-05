package Linear_Search;

public class Search_in_range {

    public static int searchInRange(int a[], int target, int start, int end){
        if (a.length == 0 || a == null){
            return -1;
        }

        for (int index = start; index <=end ; index++) {
            if (a[index] == target){
                return index;
            }
        }
//        it return -1 if value not present between range
        return -1;
    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int start = 3;
        int end = 5;
        int res = searchInRange(a,target,start,end);
        if(res!=-1){
            System.out.println("element Found at index "+res);
        }else {
            System.out.println("element not found");
        }
    }
}
