package leetcode.hash.twosum;

public class main {
    public static void main(String[] args) {
        int[] nums = {
                2, 7, 11, 15
        };

        int target = 9;

        Solution solution = new Solution();

        var result = solution.twoSum(nums, target);

        for ( var value: result) {
            System.out.println(value);
      }
    }

}
