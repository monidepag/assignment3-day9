import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {

    private String name;
    private Integer age;
    
    
    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }



}

public class testerPerson {
    public static int compareByName(Person p1, Person p2)
	{
		return p1.getName().compareTo(p2.getName());
	}
	
	public static int compareByAge(Person p1, Person p2)
	{
		return p1.getAge().compareTo(p2.getAge());
	}
	
	public static void main(String[] args) {
		
		List<Person> plist = new ArrayList<>();
		plist.add(new Person("Isha", 25));
		plist.add(new Person("Zoya", 26));
		plist.add(new Person("Manish", 27));
		plist.add(new Person("Tanisha", 28));
		
		Collections.sort(plist, testerPerson::compareByName); // method ref to static method
		
		System.out.println("Sorted by name : ");
		
		plist.stream().map(x->x.getName()).forEach(System.out::println);

        System.out.println();
		
		Collections.sort(plist, testerPerson::compareByAge); // method ref to static method
		
		System.out.println("Sorted by age : ");
		
		plist.stream().map(x->x.getName()).forEach(System.out::println);
		
	}
}
