package ex02_Computer;

public class Notebook extends Computer{

  private int battery;
  
  //new Notebook("gram",70)에 의해서 호출되는 생성자
  public Notebook(String model, int battery) {
    super(model);
    this.battery = battery;
  }
  
  //getter만들기
  public int getBattery() {
    return battery;
  }
  
  //setter만들기
  public void setBattery(int battery) {
    this.battery = battery;
  }
}
