/**
 * Created by Keith Bentham
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int oneStepBefore = 2, twoStepsBefore = 1, allWays = 0;
        for (int i = 2; i < n; i++) {
            allWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }
        return allWays;
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println("In how many distinct ways can you climb to the top?: " + cs.climbStairs(1));
    }
}