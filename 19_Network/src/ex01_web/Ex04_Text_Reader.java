package ex01_web;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex04_Text_Reader {

  public static void main(String[] args) {
  // 웹 상의 텍스트 파일 읽기 (XML)
    
   String spec = "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";

    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    BufferedWriter writer = null;
    
    try {
      
      url = new URL(spec);
      
      con = (HttpURLConnection) url.openConnection();
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      writer = new BufferedWriter(new FileWriter("C:/storage/mid-term-rss3.jsp?stnId=108.xml"));
      
      String line = null;
      
      StringBuilder sb = new StringBuilder();
      
      while((line = reader.readLine()) != null) {
        writer.write(line);
        writer.newLine();
        
      }
      
      System.out.println("파일 생성 완료 ");
    } catch(MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(writer != null) writer.close();
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
        
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
      
      
      
    }
    
    

    
  }

}
