import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }

    // Time complexity is O(n) and space complexity is O(1).
    // The output array does not count as extra space for space complexity analysis.
    public static int[] productExceptSelf(int[] nums) {
            int[] output = new int[nums.length];
            int prefix = 1;
            int postfix = 1;

            // getting prefix
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    output[i] = prefix;
                }
                else {
                    output[i] = output[i-1] * nums[i-1];
                }
            } // end for prefix

            for (int i = nums.length-1; i >= 0; i--) {
                if (i == nums.length-1) {
                    output[i] = output[i] * postfix;
                } else {
                    postfix = nums[i+1] * postfix;
                    output[i] = output[i] * postfix;
                }
            }  // end for postfix

        return output;




        // Brute force O(n^2)
//        int [] ans = new int[nums.length];
//        Arrays.fill(ans, 1);
//
//        for (int j = 0; j < nums.length; j++) {
//            int c = nums[j];
//            for (int i = 0; i < ans.length; i++) {
//                if (i != j) {
//                    ans[i] *= c;
//                }
//            }
//        }
//        return ans;

    }
}
