package ex04_Singer;

public class MainWrapper {
   
  public static void main(String[] args) {  
    
    
    Song song = new Song();
  
    
    song.setTitle("호랑나비");
    song.setGenre("댄스");
    song.setPlayTime(3.5);
    
    song.info(); // 제목 :   , 장르 :    , 재생기간 : 3.5분

    Singer singer = new Singer();
    
    singer.setName("김흥국"); // 이름 : 김흥국
    singer.setTitleSong(song); // 제목 : 호랑나비, 장르 : 댄스, 재생시간 : 3.5분
    
    singer.info(); 
}
}