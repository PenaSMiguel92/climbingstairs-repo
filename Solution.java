import java.util.*;

public class Solution {
    List<Integer> prevValues = new ArrayList<>();

    public int climbStairs(int n) {
        if (prevValues.get(n) != null)
            return prevValues.get(n);
        
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int value = climbStairs(n - 1) + climbStairs(n - 2);
        prevValues.add(n, value);
        return value;
        
    }
}