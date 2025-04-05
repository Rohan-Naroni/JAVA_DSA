package Binary_Search;

public class CeilingNumber{

/*
   Ceiling means it returns the smallest element that is greater than or equal to the target.
   If the target is present, it returns the target itself.
   If the target is not present, it returns the next greater element.
   If no such element exists (target is greater than the largest element), it returns -1.

   Example:
   arr = [2, 4, 6, 8, 10, 14, 18, 20]
   target = 16 → output = 18
   target = 21 → output = -1
*/

    static int ceilingno(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        // If the target is greater than the largest element, return -1
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return arr[mid]; // Return the exact match
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Ensure start is within bounds before accessing arr[start]
        return (start < arr.length) ? arr[start] : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int result = ceilingno(arr, target);

        if (result == -1) {
            System.out.println("No ceiling number found.");
        } else {
            System.out.println("Ceiling number: " + result);
        }
    }
}
