package person;

public class PersonFactory {
  private static Person person;

  public static Person getPerson() {
    if (person == null) {
      person = new Person("1001", "leaf", 25);
    }

    return person;
  }
}
