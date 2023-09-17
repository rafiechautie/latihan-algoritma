package leetcode.array;

public class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int[] nums= {
                1, 10, 9, 8
        };

//        int[] nums = {
//                1, 1, 2
//        };

        int j = 0;
        for(int i = 1; i<nums.length; i++){

            if (nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];

            }
//            System.out.println(nums[j]);
        }
        System.out.println(j+1);
    }
}
