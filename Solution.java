import java.util.*;

public class Solution {
    Map<Integer, Integer> prevValues = new HashMap<>();
    public int climbStairs(int n) {
        if (prevValues.containsKey(n))
            return prevValues.get(n);

        if (n == 1 || n == 2) {
            prevValues.put(n, n);
            return n;
        } 
        prevValues.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return prevValues.get(n);
    }
}