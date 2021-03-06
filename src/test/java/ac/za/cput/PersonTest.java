package ac.za.cput;
import org.junit.Assert;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class PersonTest extends AbstractTestCollection
{
    private Person person;
    private String name = "Bennie Benasi";
    private int amount = 1000;

    @Override
    public void initialize() {
        person = (Person) new AnnotationConfigApplicationContext(AppConfig.class).getBean("person");
        person.setName(name);
        person.setAmount(amount);

    }

    @Override
    public void test() {
        Assert.assertEquals(person, person.showInfo());
    }

    @Override
    public void end() {
        person = null;

    }
}
