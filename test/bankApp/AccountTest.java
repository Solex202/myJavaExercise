package bankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

   @Test
   public void accountCanBeCreatedTest(){
    myAccount mijuAccount = new myAccount("Ademiju Adam", "4736");
    String myAccount = mijuAccount.getAccountName();
    assertEquals("Ademiju Adam",myAccount);

    }

    @Test
    public void accountHas50kWhenCreated(){
        myAccount mijuAccount = new myAccount("Ademiju Adam", "4736");
        int balance = mijuAccount.getBalance("4736");
        assertEquals(50_000,balance);
    }

     @Test
    public void depositCash(){
     myAccount mijuAccount = new myAccount("Ademiju Adam","4736");
       mijuAccount.depositCash(8000);
//       mijuAccount.getBalance("4736");
       int balance = mijuAccount.getBalance("4736");
       assertEquals(58git_000,balance);
    }








}
