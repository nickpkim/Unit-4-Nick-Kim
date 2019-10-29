//creates instances of the Coin class and tests their attirbutes and behaviors
public class CoinTester{
  public static void main(String[] args){
    Coin myCoin = new Coin();
    System.out.println("My coin = "+myCoin);
    Coin yourCoin = new Coin();
    System.out.println("Your coin = "+yourCoin);
    int headCount = 0;
    for (int i=1; i<=10; i++){
      Coin countCoin = new Coin();
      System.out.println("flip"+i+" = "+countCoin);
      if (countCoin.toString().equals("Heads")){
        headCount++;
      }
    }
    System.out.println("number of heads = "+headCount);
  }
}
