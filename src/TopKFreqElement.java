import java.util.*;

public class TopKFreqElement {

    // Using BucketSort
        public int[] topKFrequent(int[] nums, int k) {
            HashMap <Integer, Integer> hashMap = new HashMap<>();
            List<Integer> [] freqSorted = new ArrayList[nums.length+1];
            int[] res = new int[k];

            // Add frequency of each value to hashmap
            for (int n : nums) {
                hashMap.put(n, hashMap.getOrDefault(n, 0)+1);
            }

            for (int key: hashMap.keySet()) {
                int freq = hashMap.get(key);
                if (freqSorted[freq] == null) {
                    freqSorted[freq] = new ArrayList<>();
                }
                freqSorted[freq].add(key);
            }

            int index = 0;
            // iterate through the back
            for (int i = freqSorted.length-1; i >= 0 && index < k; i--) {
                if (freqSorted[i] != null) {
                    // add element
                    for (Integer val : freqSorted[i]) {
                        res[index] = val;
                        index ++;
                    }

                }
            }

            return res;
        }
    }

