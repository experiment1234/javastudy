package exam;

public class MainWrapper {

	// 문제1. int number의 첫 번째 글자가 1,3,5이면 "남자", 2,4,6이면 "여자"를 출력하시오.
	// int number의 첫 번째 글자는 항상 1 ~ 6 사이의 정수라고 가정한다.
	// 예시
	// 남자입니다.
	public static void q1() {
		int number = 1234567;
		if(number / 1000000 % 2 == 1) {
		  System.out.println("남자입니다.");
		} else {
		  System.out.println("여자입니다.");
		}
	}
	
	// 문제2. int a와 int b에 저장된 결과를 이용해서 사칙연산 결과를 출력하시오.
	// 예시
	// 7 + 2 = 9
	// 7 - 2 = 5
	// 7 * 2 = 14
	// 7 / 2 = 3.5
	public static void q2() {
		int a = 7;
		int b = 2;
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		double mok = (double)a / b;
		
		System.out.println(a + " + " + b + " = " + add);
		System.out.println(a + " - " + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + mok);
	}
	
	// 문제3. 구구단을 모두 출력하지 말고 5 x 5 = 25까지만 출력하시오.
	// 예시
	// 2 x 1 = 2
	// 2 x 2 = 4
	// ...
	// 5 x 5 = 25
	public static void q3() {
		for(int dan = 2; dan<=5; dan++) {
		  for(int n = 1; n <= 9; n++) {
		    System.out.println(dan + " x " + n + " = " + (dan * n));
		    if(dan == 5 && n ==5) {
		      break;
		    }
		  }
		}
	}
	
	// 문제4. begin부터 end 사이의 모든 정수들의 평균을 출력하시오.
	// 단, 항상 begin은 end보다 작거나 같은 상태이다.
	// 예시
	// 1부터 6사이 모든 정수의 평균은 3.5입니다.
	public static void q4() {
		int begin = 1;
		int end = 6;
		int total = 0;
		for(int n = begin; n <= end; n++) {
		  total = total + n;
		}
		System.out.println(begin + "부터 " + end + "사이 모든 정수의 평균은 " + (total/(end - begin + 1.0)) + "입니다.");
	}
	
	// 문제5. 1부터 100 사이의 모든 3의 배수를 더한 결과를 출력하시오.
	// 예시
	// 모든 3의 배수 합은 1683입니다.
	public static void q5() {
		int total = 0;
		int target = 3;
		for(int n = 1; n <= 100; n++) {
		  if(n % target == 0) {
		    total = total + n;
		  }
		  
		}
		System.out.println("모든 " + target + "의 배수의 합은 " + total +"입니다.");
	}
	
	// 문제6. 배열에 저장된 모든 정수를 모두 더하시오.
	// 단, 0보다 작은 값은 더하지 마시오.
	// 예시
	// 합계는 6입니다.
	public static void q6() {
		int total = 0;
		int[] a = {1, -1, -2, 2, 3, -3};
		for(int i = 0; i<a.length; i++) {
		  if(a[i] < 0) {
		    continue;
		  }
		  total = total + a[i];
		}
		System.out.println("합계는 " + total + "입니다.");
		
	}
	
	// 문제7. 제시된 배열 a에 상수 TARGET과 동일한 문자가 몇 개 포함되어 있는지 갯수를 구해서 출력하시오.
	// 예시
	// 배열에 포함된 h는 2개입니다.
	public static void q7() {
		final char TARGET = 'h';
		char[] a = {'a', 'h', 'e', 'h', 'p'};
		int count = 0;
		for(int i = 0; i < a.length; i++) {
		  if(a[i] == TARGET) {
		    count++;
		  }
		}
		System.out.println("배열에 포함된 " + TARGET + "는 "+ count + "개입니다.");
		
	}
	
	// 문제8. 점수에 따라 가져갈 수 있는 모든 사은품을 출력하시오.
	// 점수가 60점 이상인 경우 : "행주"
	// 점수가 70점 이상인 경우 : "행주도마"
	// 점수가 80점 이상인 경우 : "행주도마식칼"
	// 점수가 90점 이상인 경우 : "행주도마식칼냄비"
	// 예시
	// 행주도마
	public static void q8() {
		String strScore = "75";
		int score = Integer.parseInt(strScore);
		String gift = "";
		if(score >= 60) {
		  gift = gift + "행주";
		}
		if(score >= 70) {
		  gift += "도마";
		}
		if(score >= 80) {
		  gift += "식칼";
		}
		if(score >= 90) {
		  gift += "냄비";
		}
		System.out.println(gift);
		
	}
	
	// 문제9. 1 ~ 100 사이의 정수를 대상으로 369 게임 결과를 아래와 같이 출력하시오.
	// 예시
	// 1   2   짝   4   5   짝   7   8   짝   10
	// 11  12  짝   14  15  짝   17  18  짝   20
	// 21  22  짝   24  25  짝   27  28  짝   짝
	// 짝  짝  짝짝 짝  짝  짝짝 짝  짝  짝짝 40
	// ...
	// 81  82  짝   84  85  짝   87  88  짝   짝
	// 짝  짝  짝짝 짝  짝  짝짝 짝  짝  짝짝 100
	public static void q9() {
		boolean condition1 = false;  // 일의 자리가 3의 배수인가?
		boolean condition2 = false;  // 십의 자리가 3의 배수인가?
		
		for(int i = 1; i <= 100; i++) {
		  
		  int units = i%10;
		  int tens = i/10;
		  
		  condition1 = units == 3 || units == 6 || units == 9;
		  condition2 = tens == 3 || tens == 6 || tens == 9;
		  
		  if (condition1 && condition2) {
        System.out.print("짝짝\t");
      }else if (condition1 || condition2) {
        System.out.print("짝\t");      
      }else {
        System.out.print(i + "\t");
      }
  
      if (i % 10 ==0) {
        System.out.println();
      }
      
		}
	} 

	
	// 문제10. 5명의 이름과 점수를 각각의 배열에 저장하였다.
	// 가장 높은 점수를 받은 사람의 이름을 출력하시오.
	// 예시
	// 가장 높은 점수를 받은 사람은 정숙입니다.
	public static void q10() {
		String[] name = {"철수", "영희", "정숙", "상철", "미희"};
		int[] score = {50, 60, 90, 80, 70};
		int max = score[0];
		int top = 0;
		for(int i =0; i< score.length; i++) {
		if(max < score[i]) {
		  max = score[i];
		  top = i;
		}
	}
	  System.out.println("가장 높은 점수를 받은 사람은 " + name[top] + "입니다.");	
}
	
	
	// main 메소드는 그대로 사용합니다.
	public static void main(String[] args) {
		System.out.println("=====문제1=====");
		q1();
		System.out.println("=====문제2=====");
		q2();
		System.out.println("=====문제3=====");
		q3();
		System.out.println("=====문제4=====");
		q4();
		System.out.println("=====문제5=====");
		q5();
		System.out.println("=====문제6=====");
		q6();
		System.out.println("=====문제7=====");
		q7();
		System.out.println("=====문제8=====");
		q8();
		System.out.println("=====문제9=====");
		q9();
		System.out.println("=====문제10=====");
		q10();
	}

}
