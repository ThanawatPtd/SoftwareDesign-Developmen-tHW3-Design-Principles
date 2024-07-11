package src;

public class User {
  private String name;
  private final String id;
  private String email;
  private int age;

  User(String name, String id, String email, int age) {
    this.name = name;
    this.id = id;
    this.email = email;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }
  public int getAge() {
    return age;
  }
}
