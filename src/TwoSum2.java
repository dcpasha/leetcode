public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int low = 0;
        int high = numbers.length-1;
        int sum;

        while (low<high) {
            sum = numbers[low] + numbers[high];
            if (sum == target) {
                result = new int[]{++low, ++high};
                return result;
            }
            else if (sum > target) {
                high--;
            }
            else {
                low++;
            }
        }
        return result;
    }
}
