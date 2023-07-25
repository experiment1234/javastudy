package ex09_Family;

public class Person {

  private String name;
  private int age;


  public Person() {
    
  }
  public Person(String name, int age) {
  this.name = name;
  this.age = age;
}
  
  //getter
  public String getName() {
    return name;
  }
  
  //setter
  public void setName(String name) {
    this.name = name;
  }
  
  //getter
  public int getAge() {
    return age;
  }
  
  //setter
  public void setAge(int age) {
    this.age = age;
  }
}