package leetcode.hash.ransomnote;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        //buat array yang merepresentasikan jumlah character di alphabet english
        int[] arr = new int[26];
        /**
         * String ransomNote = "aa";
         *  String magazine = "aab";
         *
         *  magazine.length = 3
         * ransomNote.length = 2
         *
         *  i= 0; 0<3
         *  arr[a - 'a']++ = 0 (untuk char a)
         *
         *  i= 1; 1<3
         *  arr[a - 'a']++ = 1 (untuk char a yang menunjukkan char a ada 2)
         *
         *  i= 2; 2<3
         *  arr[b - 'a']++ = 0 (untuk char b)
         *
         */
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }

        /**
         * i = 0; 0<2
         * --arr['a' - 'a'] = 1 (char a di magazine diambil untuk a di ransomNote)
         *
         * i = 1; 1<2
         * --arr['a' - 'a'] = 0
         */
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
