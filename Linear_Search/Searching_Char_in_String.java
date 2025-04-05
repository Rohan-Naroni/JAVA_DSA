package Linear_Search;

import java.util.Arrays;

public class Searching_Char_in_String {

    static int  char_search(String name, char target){

        if (name == null){
            return -1;
        }
        if(name.length() == 0){
            return -1;
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target){    // charAt extract every chat from string and check with target
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

//        int num = 1234567890;
//        String num1 = Integer.toString(num);

        String name = "GHOST_141";
//        G H O S T _ 1 4 1  name
//        0 1 2 3 4 5 6 7 8  index
        char target = '1';

        int res = char_search(name,target);
        if (res!=-1){
            System.out.println("char found at index "+res);
        }else {
            System.out.println("char not found");
        }
//        ------------------------------------------------------------------------------
//      name.toCharArray() convert the string into an array of characters
//        System.out.println(Arrays.toString(name.toCharArray()));

//        int num = 1234567890;
//        String num1 = Integer.toString(num);
//        System.out.println(Arrays.toString(num1.toCharArray()));

    }
}
