package ac.za.cput;

import org.junit.Assert;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap extends AbstractTestCollection{

    private Map<String, Integer> map;

    @Override
    public void initialize() {
        map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
    }


    @Override
    public void test() {

            for (String i : map.keySet()) {
                System.out.println(map.get(i));
            }
            Assert.assertTrue("contain letter a", map.containsKey("c"));

    }

    @Override
    public void end() {

    map = null;
    }
}
