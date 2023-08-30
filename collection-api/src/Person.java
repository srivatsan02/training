public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;

    }
    public Person() {
        super();

    }
    @Override
    public String toString() {
        return "Person [name=" +name+ ", age="+age+"]";

    }
    public String getName() {
        return name;

    }
    public int getAge() {
        return age;

    } 
    @Override
    public int compareTo(Person p) {
        return this.age-p.age;

    }

}