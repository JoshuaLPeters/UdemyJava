//package TestingExercises;
//
//import TestingExercises.TestingBankAccount;
//import static org.junit.Assert.*;
//
//public class TestingBankAccountTest {
//
//   private TestingBankAccount account;
//   private static int count;
//
//    @org.junit.BeforeClass
//    public static void beforeClass(){
//        System.out.println("This executes before any test cases. Count = " + count++);
//    }
//
//   @org.junit.Before
//    public void setup(){
//        account = new TestingBankAccount("Joshua", "Peters", 1000.00, TestingBankAccount.CHECKING);
//        System.out.println("Running a test...");
//    }
//
//    @org.junit.Test
//    public void deposit() throws Exception {
//        double balance = account.deposit(200.00, true);
//        assertEquals(1200.00, balance, 0);
//    }
//
//    @org.junit.Test
//    public void withdrawal_branch() throws Exception {
//        double balance = account.withdrawal(600, true);
//        assertEquals(400.00, balance, 0);
//    }
//
//    @org.junit.Test(expected = IllegalArgumentException.class)
//    public void withdrawal_notBranch() throws Exception {
//        account.withdrawal(600, false);
//        fail("Should have thrown an IllegalArgumentException");
//    }
//
//    @org.junit.Test
//    public void getBalance_deposit() throws Exception  {
//        account.deposit(200.00, true);
//        assertEquals(1200.00, account.getBalance(),0);
//    }
//
//    @org.junit.Test
//    public void getBalance_withdrawal() throws Exception  {
//        account.withdrawal(200.00, true);
//        assertEquals(800, account.getBalance(),0);
//    }
//
//    @org.junit.Test
//    public void isChecking_true(){
//        assertTrue("The account is NOT a checking account", account.isChecking());
//    }
//
//    @org.junit.AfterClass
//    public static void afterClass(){
//        System.out.println("This executes after any test cases. Count = " + count++);
//    }
//
//    @org.junit.After
//    public void teardown(){
//        System.out.println("Count = " + count++);
//    }
//
//}