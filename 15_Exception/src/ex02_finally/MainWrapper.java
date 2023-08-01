package ex02_finally;

import java.util.Scanner;

public class MainWrapper {
  
  //finally 블록
  // 1. try-catch문의 마지막 블록으로 추가할 수 있다.(생략가능) 
  // 2. 예외발생 여부와 상관없이 "항상 마지막"에 실행된다. 

  public static void main(String[] args) {
    

    //나이를 입력받아서 "주류 구매 가능","주류 구매 불가능" 출력하기
    // 예외 처리 
    
    //try 블록과 finally 블록에서 모두 사용할 수 있도록 scope조정 
    Scanner sc = null; //선언
    
    try {
    sc = new Scanner(System.in); // 생성
    System.out.println("몇 살이세요?");
    int age = sc.nextInt();
    System.out.println(age >= 20? "주류 구매 가능" : "주류 구매 불가능");
  
  
    } catch (Exception e) {
      System.out.println("잘 모르겠어요.");
    } finally {
     sc.close();  //finally는 주로 자원반납 용으로 사용한다. 
    }
  }

}
