package naver.api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class NaverApiSearchBook {
  
private void generateImage(String spec) {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      bin = new BufferedInputStream(con.getInputStream());

      File dir = new File("C:/download");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      String fileName = spec.substring(spec.lastIndexOf("/") + 1);
      File file = new File(dir, fileName);
      
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      byte[] b = new byte[1024];
      int readByte = 0;
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }
      
      System.out.println(file.getPath() + " 파일 다운로드 완료");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) bout.close();
        if(bin != null) bin.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public void getSearchList() {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    
    try {
      
      String clientId = "dteUoZxabIKjJ8XhKGY0";
      String clientSecret = "hzj3TKHiSm";
      
      Scanner sc = new Scanner(System.in);
      System.out.print("책 관련 검색어를 입력하세요 >>> ");
      String query = sc.nextLine();
      query = URLEncoder.encode(query, "UTF-8");
      sc.close();
      
      String spec = "https://openapi.naver.com/v1/search/book.json?query=" + query;
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while ((line = reader.readLine()) != null) {
        sb.append(line);
      }
      
      JSONObject obj = new JSONObject(sb.toString());
      JSONArray items = obj.getJSONArray("items");
      for (int i = 0, length = items.length(); i < length; i++) {
        JSONObject item = items.getJSONObject(i);
        String image = item.getString("image");
        generateImage(image);
      }
      
    } catch (Exception e) {
      
      File dir = new File("C:/download/log");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      
      File file = new File(dir, "log.txt");
      
      try (PrintWriter out = new PrintWriter(new FileWriter(file, true))) {
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a h:mm:ss");
        String time = dtf.format(now);
        
        String message = e.getMessage();
        
        out.println(time + ", " + message);
        
        System.out.println(file.getPath() + " 파일에 로그가 작성되었습니다.");
        
      } catch (Exception e2) {
        e2.printStackTrace();
      }
      
    } finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
}