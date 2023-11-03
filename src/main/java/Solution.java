import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int j = 1;
        for (int i = 0; i < target.length; i++) {
            int popCount = 0;
            while (target[i] != j) {
                j++;
                popCount++;
                result.add("Push");
            }
            while (popCount != 0) {
                result.add("Pop");
                popCount--;
            }
            result.add("Push");
            j++;

        }
        return result;
    }
}
