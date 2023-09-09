package leetcode.twopointers;

public class main {
    public static void main(String[] args) {

        String text = "A man, a plan, a canal: Panama";

        /**
         * =====Approach====== (dia dapaet penjelasan dari chat gpt, jadi kalau sulit kamu bisa pakek itu)
         *
         * This code is an implementation of a solution to determine if a given string is a palindrome.
         * A string is considered a palindrome if it reads the same forwards and backwards,
         * ignoring spaces, punctuation, and letter casing.
         *
         * The approach used in this solution is a two-pointer technique, where two pointers are maintained,
         * one at the start of the string and the other at the end of the string. The two pointers move towards
         * each other until they meet in the middle of the string.
         *
         * At each iteration of the while loop, the characters pointed to by the start and last pointers are checked.
         * If either of the characters is not a letter or digit (e.g., a space or punctuation),
         * the pointer is moved one step to the right (for start) or one step to the left (for last) until a letter or digit is found.
         *
         * If both characters are letters or digits, they are converted to lowercase and compared.
         * If they are not equal, the function returns false, as the string is not a palindrome.
         * If they are equal, both pointers are moved one step to the right and left, respectively.
         *
         * The while loop continues until the start pointer is greater than the last pointer,
         * indicating that all the characters have been checked and that the string is a palindrome. The function then returns true.
         */

        int start = 0;
        int last = text.length() - 1;

//        System.out.println(start);
//        System.out.println(last);
//        System.out.println(text.charAt(1));
//
//        System.out.println(Character.isLetterOrDigit(text.charAt(1)));

        while (start <= last){
            char currFirst = text.charAt(start);
            char currLast = text.charAt(last);

            if (!Character.isLetterOrDigit(currFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(currLast)){
                last--;
            }else {
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    System.out.println(false);
                }
                start++;
                last--;
            }
        }
        System.out.println(true);
    }
}
