public class BankClient{
  public static void main(String[] args){
    Bank acc = new Bank(96024, "Nick", "emailmama@hotmail.com", "joferplat3", 6.20);
    acc.getAcc();
    acc.deposit(5.89);
    acc.getAcc();
  }
}
