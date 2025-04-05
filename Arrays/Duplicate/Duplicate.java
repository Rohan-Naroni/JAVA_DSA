package Arrays.Duplicate;


//        O(n^2)
//        for adding elements to a HashSet is O(1) and loop running from 0 to n
//        O(1) * O(n) = O(N);
//        Time Complexity = O(N);

        /*
        Set <Integer> s = new HashSet<>();

        int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6};

        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }

        System.out.println(s);
        System.out.println(s.size());

         */


public class Duplicate {

//        Two Pointer approch(slow fast pointer)
//    time complexity is O(N)

    public static int duplicate(int a[]) {



        int i = 0; // slow pointer

        for (int j = 0; j < a.length; j++) {
            if (a[i] != a[j]) {
                a[i + 1] = a[j];
                i++;
            }

        }

        return i + 1;
    }

    public static void main(String[] args) {

        int a[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        int res = duplicate(a);

        for (int i =0; i<res; i++){
            System.out.println(a[i]);
        }



    }
}
