package leetcode.array;

public class merged_sorted_array {

    public static void main(String[] args) {
        int[] nums1 = {
                1, 2, 3, 0, 0, 0
        };
        int m = 3;
        int[] nums2 = {
                2, 5, 6
        };
        int n = 3;

        //ambil index terakhir dari nums 1
        int lastNums1 = m + n - 1;
        System.out.println("index terakhir di nums 1 : " + lastNums1);

        //ambil index terakhir dari nums 2
        int lastNums2 = n - 1;
        System.out.println("index terakhir dari nums 2: " + lastNums2);


        //ambil index terakhir di nums 1 yang nilainya ngak kosong
        int lastValueNums1 = m - 1;
        System.out.println("index terakhir dari nums1 yang nilainya ngak kosong: " + lastValueNums1);

        //lakukan perulangan dari index terakhir di nums 2
        while(lastNums2 >= 0){
            /**
             * jika index terakhir di nums 1 yang nilainya ngak kosong nilainya lebih besar dari 0
             * dan
             * nums1[2]  > nums2[2]
             *
             * i-- -> artinya gunakan i dulu baru di perulangan selanjutnya di kurang 1
             */
            if (lastValueNums1 >= 0 && nums1[lastValueNums1] > nums2[lastNums2]){
                /**
                 * nums1[5] = nusm1[2]
                 */
                nums1[lastNums1--] = nums1[lastValueNums1--];
            }else {
                /**
                 * nums1[5] = nums2[2]
                 */
                nums1[lastNums1--] = nums2[lastNums2--];
            }
        }

        System.out.println("============jawaban===========");

        for ( var array: nums1) {
            System.out.println(array);
        }
     }
}

