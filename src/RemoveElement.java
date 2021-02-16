import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 2, 2};
        int m = 2;
        System.out.println(Arrays.toString(nums1));
        System.out.println("Number to remove from array: " + m);
        System.out.println("Array length after N removed: " + removeElement(nums1, m));
    }


    public static int removeElement(int[] nums, int val) {
        int num = 0;
        for (int value : nums) {
            if (value != val) {
                nums[num] = value;
                num++;
            }
        }
        return num;
    }
}

/**
 * create new method removeElement with arguments of array and value to remove
 * <p>
 * declare new int value set to 0
 * enhanced for loop to loop through nums array and append value to int value
 * declare if statement( if the value is Not equals to the passed in paramter val do the following
 * append current array value to value
 * increment the num counter
 * now return the array length once the array has finished.
 * <p>
 * <p>
 * This works by only adding numbers that are Not our passed in parameter
 */