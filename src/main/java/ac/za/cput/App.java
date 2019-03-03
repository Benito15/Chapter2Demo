package ac.za.cput;

import javax.swing.*;
import java.util.*;


public class App 
{
    Person personObject= new Person("Lorenzo", 50);
    Person personObject1= new Person("Connie", 1200);
    Person personObject2= new Person("Robyn", 200);

    /*
    public static void main( String[] args )

    {


        Person personObject= new Person("Lorenzo", 50);
        Person personObject1= new Person("Connie", 1200);
        Person personObject2= new Person("Robyn", 200);

        //List
        List<Person> person = new ArrayList<>();
        person.add(new Person("Zuma", 15000));
        person.add(new Person("Julius", 5000));
        person.add(new Person("Cyril", 600000));

        System.out.println("--------------------------------------");
        //map
        Map <Person, Integer> map = new LinkedHashMap<Person, Integer>();
        map.put(personObject,1);
        map.put(personObject1,2);
        map.put(personObject2,3);

        for (Person key: map.keySet())
        {
            System.out.println(key + ": " + map.get(key));

        }
        System.out.println("--------------------------------------");
        //set
        Set<Person> set = new LinkedHashSet<>();
        set.add(personObject);
        set.add(personObject1);
        set.add(personObject2);

        System.out.println(set);
        System.out.println("--------------------------------------");

        System.out.println("Coding to interface>>>>>>>");
        personObject.showInfo();
        personObject.greet();
*/

   public Collection<String> collectionStyle()
   {
       Collection<String> subjects = new ArrayList<>();
       ((ArrayList<String>) subjects).add("Application Development Practice");
       ((ArrayList<String>) subjects).add("Project presentation");
       ((ArrayList<String>) subjects).add("Information Systems");

       return subjects;

   }

    public Set<String> setStyle()
    {
        Set<String> setSubjects = new LinkedHashSet<>();

        setSubjects.add("Application Development Practice");
        setSubjects.add("Project presentation");
        setSubjects.add("Information Systems");
        return setSubjects;
    }

  /*  Map <Person, Integer> map = new LinkedHashMap<Person, Integer>();
        map.put(personObject,1);
        map.put(personObject1,2);
        map.put(personObject2,3);*/

  public Map<Person, Integer> mapStyle()
  {

      Map map = new LinkedHashMap<Person, Integer>();
      map.put(personObject,1);
      map.put(personObject1,2);
      map.put(personObject2,3);

      return map;


  }


}
