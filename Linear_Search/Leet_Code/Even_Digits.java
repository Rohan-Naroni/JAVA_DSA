package Linear_Search.Leet_Code;
/*
Question Link --> Find the Numbers With Even Number Digits:
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1491430316/
*/

public class Even_Digits {


    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896,8989};
        int result = find_number(nums);
        System.out.println(result);
    }

    static int find_number(int [] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int nod = count_num(num);
        if (nod %2 == 0){
            return true;
        }
        return false;
    }


    static int count_num(int num){

        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }
}
