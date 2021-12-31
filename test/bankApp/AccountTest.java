package bankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

   @Test
   public void accountCanBeCreatedTest(){
    myAccount lotaAccount = new myAccount("Onwuka Lotachukwu", "4736");
    String myAccount = lotaAccount.getAccountName();
    assertEquals("Onwuka Lotachukwu",myAccount);

    }

    @Test
    public void accountHas50kWhenCreated(){
        myAccount lotaAccount = new myAccount("Onwuka Lotachukwu", "4736");
        int balance = lotaAccount.getBalance("4736");
        assertEquals(50_000,balance);
    }

     @Test
    public void depositCash(){
     myAccount lotaAccount = new myAccount("Onwuka Lotachukwu","4736");
       lotaAccount.depositCash(8000);
       int balance = lotaAccount.getBalance("4736");
       assertEquals(58_000,balance);
    }

    @Test
    public void withdrawCash(){
      myAccount lotaAccount = new myAccount("Onwuka Lotachukwu","4736");
      lotaAccount.withdrawCash(6000, "4736");
      int balance = lotaAccount.getBalance("4736");
      assertEquals(44_000,balance);

    }
    @Test
    public void checkBalance(){
       myAccount lotaAccount = new myAccount("Onwuka Lotachukwu","4736");
       int balance = lotaAccount.getBalance("4736");
        assertEquals(50_000,balance);
    }

        @Test
    public void cannotWithdrawMoreThanBalance(){
       myAccount lotaAccount = new myAccount("Onwuka Lotachukwu","4736");
        lotaAccount.withdrawCash(60_000,"4736");
        int balance = lotaAccount.getBalance("4736");
        assertEquals(50_000,balance);
        }

        @Test
    public void cannotWithdrawWithIncorrectPin(){
       myAccount lotaAccount = new myAccount("Onwuka Lotachukwu","6754");
       lotaAccount.withdrawCash(45_000,"2315");
       int balance = lotaAccount.getBalance("4736");
       assertEquals(50_000,balance);
        }

        @Test
    public void cannotWithdrawNegativeAmount(){
       myAccount lotaAccount = new myAccount("Onwuka Lotachukwu","4736");
       lotaAccount.withdrawCash(-45_000,"4736");
       int balance = lotaAccount.getBalance("4736");
       assertEquals(50_000,balance);
        }

        @Test
    public void cannotDepositNegativeAmount(){
       myAccount lotaAccount = new myAccount("Onwuka Lotachukwu","4736");
               lotaAccount.depositCash(-7_500);
               int balance = lotaAccount.getBalance("4736");
               assertEquals(50_000,balance);

        }





}

