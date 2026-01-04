public class StoreMain{
  public static void main(String[] args) {    
    Store cookieShop = new Store("cookies",12,3.75);

    System.out.println(cookieShop.productType);
    System.out.println(cookieShop.inventoryCount);
    System.out.println(cookieShop.inventoryPrice);


  }
}