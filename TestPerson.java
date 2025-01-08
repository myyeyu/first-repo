import person.Person;
import person.PersonFactory;

public class TestPerson {
  public static void main(String[] args) {
    Person person = PersonFactory.getPerson();
    System.out.println(person);
  }
}
