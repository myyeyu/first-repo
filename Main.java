import person.Person;
import person.PersonFactory;

public class Main {
  public static void main(String[] args) {
    // Person p1 = new Person("1001", "Leaf", 25);
    Person p1 = PersonFactory.getPerson();
    System.out.println("这是输出信息：" + p1);
  }
}