package ac.za.cput;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {

        Person personObject= new Person("Lorenzo", 50);
        Person personObject1= new Person("Connie", 1200);
        Person personObject2= new Person("Robyn", 200);

        List<Person> person = new ArrayList<>();
        person.add(new Person("Zuma", 15000));
        person.add(new Person("Julius", 5000));
        person.add(new Person("Cyril", 600000));

        Set<Person> set = new LinkedHashSet<>();
        set.add(personObject);
        set.add(personObject1);
        set.add(personObject2);

        System.out.println(set);

    }
}