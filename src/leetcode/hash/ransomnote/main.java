package leetcode.hash.ransomnote;

public class main {
    public static void main(String[] args) {
        String ransomNote = "aac";
        String magazine = "abc";
        int[] arr = new int[26];

//        System.out.println(magazine.charAt(2));

        System.out.println("=======MAGAZINE========");
        for (int i = 0; i<magazine.length(); i++){
            System.out.println(arr[magazine.charAt(i)-'a']++);
        }



        System.out.println("=======ransomNote=======");

        for (int i = 0; i<ransomNote.length();i++){
            System.out.println(--arr[ransomNote.charAt(i) - 'a']);
        }


        Solution solution = new Solution();

        System.out.println(solution.canConstruct(ransomNote, magazine));




    }
}
