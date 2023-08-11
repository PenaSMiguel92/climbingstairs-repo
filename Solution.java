import java.util.*;

public class Solution {
    Map<Integer, Integer> prevValues = new HashMap<>();
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        if (prevValues.containsKey(n))
            return prevValues.get(n);

        prevValues.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return prevValues.get(n);
    }
}