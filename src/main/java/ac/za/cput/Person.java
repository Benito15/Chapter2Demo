package ac.za.cput;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person implements Info {

    private String name;
    private int amount;

    public Person() {
    }

    public Person(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void showInfo()
    {

        System.out.println(getName());
        System.out.println(getAmount());
    }

    public void greet()
    {

        System.out.println("Hello there!!");

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
