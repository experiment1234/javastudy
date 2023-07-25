package ex02_Computer;

public class Computer {

  private String model;
  
  //Notebook 생성자의 super(model);에 의해서 호출되는 생성자
  
  public Computer(String model) {
  this.model = model;
  
  
  }
  //getter만들기
  public String getModel() {
    return model;
  }
  
  //setter만들기
  public void setModel(String model) {
    this.model = model;
  }
}
