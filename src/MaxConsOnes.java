public class MaxConsOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Max 1s is :" + findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int foundOne = 0;
        int max = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]==1){
                foundOne++;
                //could put max=Math.max(found1, max) here too, but would make the program run longer when all we really want to do is check against the last row of 1s in the array
            }else{
                max = Math.max(foundOne, max);
                foundOne=0;
            }
        }
        return Math.max(foundOne, max);
    }
}