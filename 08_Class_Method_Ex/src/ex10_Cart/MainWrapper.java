package ex10_Cart;

public class MainWrapper {

  public static void main(String[] args) {
   //100_000원 + 1_000포인트를 가진 고객 
    Customer c = new Customer(100_000, 1_000);
    //카트
    Cart cart =  new Cart();
    //고객이 카트를 가짐
    c.setCart(cart);
    // 고객이 카트에 물건을 넣음
    c.addProductToCart(new Product("1","양파링",1000));
    
    
    

  }

}
