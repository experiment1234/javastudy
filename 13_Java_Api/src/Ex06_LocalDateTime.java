import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex06_LocalDateTime {

  /*
   * JDK 1.8 이후 
   * 1. 날짜 : java.time.LocalDate
   * 2. 시간 : java.time.LocalTime
   * 3. 둘다 : java.time.LocalDateTime
   */
  
  public static void ex01() {
    
    
    //현재 날짜
    LocalDate date1 = LocalDate.now();
    System.out.println(date1);
    
    
    //특정 날짜
    LocalDate date2 = LocalDate.of(2023, 7, 31);
  }
  
  public static void ex02() {
    //현재 시간
    LocalTime time1 = LocalTime.now();
    System.out.println(time1);
    
    //특정 시간
    LocalTime time2 = LocalTime.of(15, 25, 30); // 15시 25분 30초
    System.out.println(time2);
  }
  
  public static void ex03() {
    
    // 현재 날짜와 시간
    LocalDateTime dateTime1 = LocalDateTime.now();
    System.out.println(dateTime1);
    
    // 특정 날짜와 시간
    LocalDateTime dateTime2 = LocalDateTime.of(2023, 7,31,15,25,30);
   System.out.println(dateTime2);
   
   //문자열 형식의 날짜와 시간
   LocalDateTime dataTime3 = LocalDateTime.parse("2023-07-31T15:28:30");
     System.out.println(dataTime3);
    
    
  }
  
  public static void ex04() {
    
    //패턴 지정하기
    LocalDateTime dateTime = LocalDateTime.now();
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
    String strDataTime = dtf.format(dateTime);
    System.out.println(strDataTime);
    
  }
  
  public static void ex05() {
    
    //날짜/시간 구성요소 가져오기 
    LocalDateTime dateTime = LocalDateTime.now();
    
    int year = dateTime.getYear();
    int month = dateTime.getMonthValue(); // 월(1~12)
    int day = dateTime.getDayOfMonth();// 일
    int hour = dateTime.getHour(); // 시(0~23)
    int minute = dateTime.getMinute(); // 분 
    int second = dateTime.getSecond(); //초
    
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(hour);
    System.out.println(minute);
    System.out.println(second);
  }
  public static void main(String[] args) {
  ex05();

  }

}
