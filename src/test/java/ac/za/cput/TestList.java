package ac.za.cput;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestList extends                 AbstractTestCollection
{
    private List<String> subjects;

    public void initialize()
    {
        subjects = new ArrayList<>();

        subjects.add("Application Development Practice");
        subjects.add("Project presentation");
        subjects.add("Information Systems");


    }

    public void test()
    {
        Assert.assertEquals("3", subjects.size());


    }

    public void end()
    {

        subjects = null;
    }

}
