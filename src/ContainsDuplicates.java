import java.util.HashSet;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        int lengthArray = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        int lengthSet = set.size();

        if (lengthSet == lengthArray) {
            return false;
        }
        else {
            return true;
        }

    }
    }

