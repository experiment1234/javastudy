package ex02_has_a;

public class Remocon {
  
    private int ch; // 0~MAX_CH
    private int vol;// 0~MAX_VOL
    private final int MAX_CH = 99;
    private final int MAX_VOL = 10;
    
    public void upCh() { 
      if(ch == MAX_CH){
        ch = 0;
        return;
      }
      ch++;
    }
    
    
      
    public void downCh() {  
      if(ch==0) {
        ch = MAX_CH;
        return;
      }
      ch--;
    }
    public void upVol() {
      if(vol == MAX_VOL) {
        return;
      }
      vol++;
    }
    public void downVol() {
      if(vol == 0) {
        return;
      }
      vol--;
}
    //getter
    public int getCh() {
      return ch;
    }
    
    //setter
    public void setCh() {
      this.ch = ch;
    }
    
    //getter
    public int getVol() {
      return vol;
      
    }
    
    //setter 
    public void setVol(int vol) {
      this.vol = vol;
    }
}