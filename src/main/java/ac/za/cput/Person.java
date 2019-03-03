package ac.za.cput;

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

    public String greet()
    {

        System.out.println("Hello there!!");

        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
