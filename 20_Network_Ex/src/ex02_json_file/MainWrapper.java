package ex02_json_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainWrapper {
  
  public static void ex01() {
    // 문제. 아래 내용을 가지는 C:/storage/product.json 파일 생성하기
    /*
        [
          {
            "code": "0001",
            "name": "냉장고",
            "price": 100,
            "sales": [
              "하이마트",
              "전자랜드"
            ]
          },
          {
            "code": "0002",
            "name": "에어컨",
            "price": 200,
            "sales": [
              "하이마트"
            ]
          }
        ]
     */
    
    // Map
    Map<String, Object> map1 = new HashMap<String, Object>();
    map1.put("code", "0001");
    map1.put("name", "냉장고");
    map1.put("price", 100);
    map1.put("sales", Arrays.asList("하이마트", "전자랜드"));
    
    // Map
    Map<String, Object> map2 = new HashMap<String, Object>();
    map2.put("code", "0002");
    map2.put("name", "에어컨");
    map2.put("price", 200);
    map2.put("sales", Arrays.asList("하이마트"));
    
    // List
    List<Map<String, Object>> list = Arrays.asList(map1, map2);
    
    // JSONArray
    JSONArray array = new JSONArray(list);
    
    // JSONArray -> String
    String products = array.toString();
    
    // 디렉터리 File 객체
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    // 파일 File 객체
    File file = new File(dir, "product.json");
    
    // try - catch - resources (close를 생략할 수 있는 try 문)
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
      bw.write(products);
      System.out.println(file.getPath() + " 파일 생성 완료");
    } catch(IOException e) {
      e.printStackTrace();
    }
    
  }


    
  public static void ex02() {
    
    //문제. 아래 링크에 연결된 JSON 파일을 모두 읽은 뒤 아래 데이터를 가져와서 출력하시오.
    //가져올 데이터)
    // ○ (강수) 10일(목) 전국에, 11일(금) 오전 수도권과 강원도에 비가 오겠습니다.<br />
    String spec = "https://gdlms.cafe24.com/uflist/curri/10014/bbs/231_64d09afdc7c01.json";
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
   
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      StringBuilder sb = new StringBuilder();
      String line =  null;
      while(( line = reader.readLine()) != null) {
        sb.append(line);
        
      }
      
      //String -> JSONObject 변환
       JSONObject obj = new JSONObject(sb.toString());
      //원하는 정보 추출하기(Parsing)
      JSONObject rss = obj.getJSONObject("rss");
      JSONObject channel = rss.getJSONObject("Channel");
      JSONObject item = channel.getJSONObject("item");
      JSONObject description = item.getJSONObject("description");
      JSONObject header = description.getJSONObject("header");
      
      System.out.println(header.toString());
       
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
      if(reader != null) reader.close();
      if(con != null) con.disconnect();
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
   }
     
  }

   public static void main(String[] args) {
    ex01();
   }
   
}
   