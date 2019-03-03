package ac.za.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public abstract class AbstractTestCollection
{

    @Before
    public abstract void initialize();

    @Test
    public abstract void test();

    @After
    public abstract void end();
}
