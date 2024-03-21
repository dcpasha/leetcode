import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
//        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(threeSum(new int[]{0,0,0,0}));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();

        Arrays.sort(nums); // sorts the array

        for (int i = 0; i < nums.length; i++) {
            if ((i == 0) || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1; // set left pointer
                int high = nums.length - 1; // set right pointer

                // the same as in TwoSum2 - two pointer solution
                while (low < high) {
                    int sum = nums[i] + nums[low] + nums[high];
                    if (sum > 0) {
                        high--;
                    } else if (sum < 0) {
                        low++;
                    } else {
                        // sum is 0
                        lists.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        low++;
                        while (low<high && (nums[low] == nums[low-1]))
                        {
                            low++;
                        }
                    }
                } // end while
            }  // end if
        }  // end for
        return lists;
    }


    // Brute Force method with triple loops
    // Time Complexity O(n^3)
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> lists = new ArrayList<>();
//
//        List<Integer> list;
//
//        Set<String> combinations = new HashSet<>();
//
//        for (int i=0; i<nums.length; i++) {
//            for (int j=i+1; j<nums.length; j++){
//                for (int k=j+1; k<nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        list = new ArrayList<>(); // create a new arrayList. How does it work in memory
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
////                        System.out.println(Arrays.toString(list.toArray())); // Important method
//
//                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
//                        // Sort the numbers
//                        int[] sortedNumbers = {nums[i], nums[j], nums[k]};
//                        Arrays.sort(sortedNumbers);
//
//                        // Convert sorted combination to a string representation
//                        String combinationString = sortedNumbers[0] + "," + sortedNumbers[1] + "," + sortedNumbers[2];
//
//                        // Add the combination to the set
//                        boolean isNewCombination = combinations.add(combinationString);
//
//                        // Check if the combination is unique
//                        if (isNewCombination) {
//                            lists.add(list);
//                        }
//                    }
//                }
//            }
//        }
//        return lists;
//    }  // end threeSum
}
