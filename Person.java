public class Person {
  private String id;
  private String name;
  private int age;

  public Person(String id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
  }

  public String toString() {
    return "{id=" + id + ", name=" + name + ", age=" + age + "}";
  }
}
