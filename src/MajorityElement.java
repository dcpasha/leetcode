
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
//        int n = nums.length;
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//
//        n = n / 2;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > n) {
//                return entry.getKey();
//            }
//        }
//
//        return 0;
        int res = -1;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int element = nums[i];
            if (map.containsKey(element)) {
                // increment
                count = map.get(element);
                count++;
                map.put(element, count);
            } else {
                // add it to the hashmap
                map.put(element, 1);
                count = 1;
            }

            if (count > nums.length/2) {
                res = element;
            }

        } // end for loop
        return res;

    }
    }

