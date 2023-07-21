package ex05_BankAccount;

public class Bank {

    private String name;
    private String tel;
    
    public Bank() {
      
      
    }
    
    public Bank(String name, String tel) {
      this.name = name;
      this.tel = tel;
    }
    
   
    
    //setter 만들기
    public void setName(String name){
    this.name = name;
    
    }
    public void setTel(String tel) {
      this.tel = tel;
    }
    
    //getter 만들기
    public String getName() {
      return name;
    }
    
    public String getTel() {
      return tel;
    }
    
    public void info() {
      System.out.println(name + "(" + tel + ")");
    }
    
}
