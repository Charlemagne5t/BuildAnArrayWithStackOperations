import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void buildArrayTest1(){
        int[] target = {1,3};
        int n = 3;
        List<String> expected =List.of("Push","Push","Pop","Push");
        List<String> actual = new Solution().buildArray(target, n);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildArrayTest2(){
        int[] target = {1,2,3};
        int n = 3;
        List<String> expected =List.of("Push","Push","Push");
        List<String> actual = new Solution().buildArray(target, n);

        Assert.assertEquals(expected, actual);
    }
}
