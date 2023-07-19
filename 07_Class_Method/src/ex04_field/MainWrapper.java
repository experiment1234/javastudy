package ex04_field;

public class MainWrapper {

  public static void main(String[] args) {
    
    // AccCalculator 객체의 선언 & 생성
    AccCalculator myAcc = new AccCalculator();
    
    //values 확인
    myAcc.showValue();

    // 사칙연산
    myAcc.addition(3);
    myAcc.substraction(2);
    myAcc.mutiplication(3);
    myAcc.division(2);
    
    //values 확인
    myAcc.showValue();
  }

}
