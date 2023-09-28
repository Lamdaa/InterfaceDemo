package Banking_Design;

public interface RBI {
  public int checkBalance();

  public String addMoney(String password,int money);
  public String withdrawMoney(String password,int money);
  public void changePassword(String password);
  public double simpleInterest(int years);

}
