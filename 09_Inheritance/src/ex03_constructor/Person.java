package ex03_constructor;

public class Person {
  
  private String name;
  
  //new Person()에서 호출되는 생성자(constructor)
  
  public Person() {
    System.out.println("Person() 호출");
  }
  
  // new Person("홍길동")에서 호출되는 생성자(constructor)
  public Person(String name) {
    this.name = name;
    System.out.println("Person(String name) 호출");
    
  }
  
  //getter만들기 name 밖으로 빼기
  public String getName(){
    return name;
  }
  //setter만들기
  public void setName(String name) {
    this.name =  name;
  }

}
