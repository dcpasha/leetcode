import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (hashMap.containsKey(complement)) { // check if it exists in HashMap
                res = new int[]{i, hashMap.get(complement)};
                return res;
            }
            // otherwise, return it
            hashMap.put(nums[i], i); // store values in hashMap -> constant time lookup
        }

        return res;
    }

    // brute force O(n^2) b/c of nested for loops
//    public int[] twoSum(int[] nums, int target) {
//        int [] res = new int[2];
//        for (int i = 0; i <= nums.length-1; i++ ) {
//            for (int j=i+1; j <= nums.length-1; j++) {
//                if (nums[i] + nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                    break;
//                }
//
//
//            }
//        }
//
//        return res;
//    }
}
