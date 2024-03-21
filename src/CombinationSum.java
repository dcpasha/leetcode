import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 5},8));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < candidates.length; i++) {
            hash.put(candidates[i], i);
        }

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (target % key == 0) {
                System.out.println("key " + key);
                int rep = target/key;


            }

        }

        return lists;
    }
}
