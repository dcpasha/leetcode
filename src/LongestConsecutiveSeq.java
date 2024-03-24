import java.util.*;

public class LongestConsecutiveSeq {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    public static int longestConsecutive(int[] nums) {
        int longest = 0;
        int seq_length;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        Set<Integer> visitedKeys = new HashSet<>(); // stores values that we visited

        for (Integer value : set) {
            seq_length = 1;

            // if we did not check this value before, continue
            if (!visitedKeys.contains(value)) {
                int valplus1 = value +1;
                int valminus1 = value-1;

                while (set.contains(valplus1)){
                    seq_length += 1;
                    visitedKeys.add(valplus1);
                    valplus1 += 1; // increment
                }

                while (set.contains(valminus1)) {
                    seq_length += 1;
                    visitedKeys.add(valminus1);
                    valminus1 -= 1; // decrement
                }

                if (seq_length > longest) {
                    longest = seq_length;
                }
                visitedKeys.add(value);
            } // end iff
        } // end for

        return longest;
    }
}
