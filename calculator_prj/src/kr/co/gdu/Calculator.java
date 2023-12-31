package kr.co.gdu;

/**
 * 
 * 덧셈, 뺄셈, 곱셈, 나눗셈 기능을 제공하는 계산기 클래스 
 * 
 * @author 나예솜
 * @since 2023.07.19
 * @version 1.0.0
 *
 */
public class Calculator {

/**
 * 
 * 실수 2개를 전달받아서 그 합을 반환하는 메소드
 * 
 * @param a 실수
 * @param b 실수
 * @return 파라미터 2개를 더한 결과
 */
  
  public double addition(double a, double b) {
    return a + b;
  }
  
  
  
  public double subtraction(double a, double b) {
    return a - b;
  }
  
  public double multiplicatoin(double a, double b) {
    return a * b;
  }
  
  public double division(double a, double b) {
    return a / b;
  }
}
