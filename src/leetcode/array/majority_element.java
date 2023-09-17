package leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class majority_element {
    public static void main(String[] args) {
        int[] nums1 = {
                2, 2, 1, 1, 1, 2, 2
        };

        int[] nums2 = {
                1 ,3, 2, 3
        };

        /**
         * Mari kita urutkan array tersebut dan kembalikan elemen pada posisi [n/2] karena itu pasti akan menjadi bagian dari
         * jawaban jika elemen tersebut ada di sisi kiri atau kanan dari array yang telah diurutkan.
         * Hal ini dikarenakan elemen mayoritas adalah elemen yang muncul lebih dari ⌊n / 2⌋ kali.
         *
         * Artinya, kita akan menyusun array dalam urutan terurut dan mengembalikan elemen yang terletak
         * di tengah array (pada posisi [n/2]). Hal ini dapat dilakukan karena jika ada elemen mayoritas,
         * maka elemen tersebut pasti akan menduduki posisi tengah setelah array diurutkan.
         */

        int n = nums2.length; //n = 4
//        System.out.println(n);

        //lakukan sorting pada nums2
        Arrays.sort(nums2);
//        for(int num : nums2){
//            System.out.println(num);
//        }

        System.out.println(nums2[n/2]); //nums2[4/2] -> //nums2[2]
    }
}
