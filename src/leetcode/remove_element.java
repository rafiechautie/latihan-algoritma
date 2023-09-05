package leetcode;

public class remove_element {
    public static void main(String[] args) {
        int[] nums = {
                0, 1, 2, 2, 3, 0, 4, 2
        };

        int val = 2;

        /**
         * https://leetcode.com/problems/remove-element/discuss/3670940/Best-100-oror-C%2B%2B-oror-JAVA-oror-PYTHON-oror-Beginner-Friendly
         *
         * Intuition
         * The intuition behind this solution is to iterate through the array and keep track of two pointers: index and i. The index pointer represents the position where the next non-target element should be placed, while the i pointer iterates through the array elements. By overwriting the target elements with non-target elements, the solution effectively removes all occurrences of the target value from the array.
         *
         * Approach
         * 1. Initialize index to 0, which represents the current position for the next non-target element.
         * 2. Iterate through each element of the input array using the i pointer.
         * 3. For each element nums[i], check if it is equal to the target value.
         *      If nums[i] is not equal to val, it means it is a non-target element.
         *      Set nums[index] to nums[i] to store the non-target element at the current index position.
         *      Increment index by 1 to move to the next position for the next non-target element.
         * 4. Continue this process until all elements in the array have been processed.
         * 5. Finally, return the value of index, which represents the length of the modified array.
         */

        /**
         * nums = [3,2,2,3]
         * val = 2
         * length = 4
         *
         * index = 0, i = 0
         * nums[0] != 2 -> 3 != 2 -> true
         * nums[index] = nums[i] -> nums[0] = nums[0]
         *
         * index = 1, i = 1
         * nums[1] != 2 -> 2 != 2 -> false
         *
         * index = 1, i = 2
         * nums[2] = 2 -> 2 != 2 -> false
         *
         * index = 1, i = 3
         * nums[3] != 2 -> 3 != 2 -> true
         * nums[1] = nums[3] -> nums[1] = 3
         *
         *
         */

        int index = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }

        System.out.println(index);

//        for ( var array: nums) {
//            System.out.println(array);
//        }
    }
}
