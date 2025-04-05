package Linear_Search.Leet_Code;
/*
Question Link--> Richest Customer Wealth:
https://leetcode.com/problems/richest-customer-wealth/submissions/1491458814/
*/
public class Richest_Customers_Wealth {

    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{1,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;  // edge case used in algo use to get least ans value
        // ans value is -2147483648


        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;  // every time reset he loops the sum get updated with 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];  // sum of row and column
            }
            if (sum > ans) {   // 1st ans is -2147483648  and sum is 6
                // 6 > 2147483648  (True)
                ans = sum;
                //ans get updated ans = 6

                // 2. sum is 4 and ans is 6
                // 4>6  (false)
//                return ans...........ie 6

            }

        }
        return ans;
    }
}
