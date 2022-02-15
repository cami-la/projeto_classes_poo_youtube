package dev.camila.test;

import dev.camila.CurrentAccount;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CurrentAccountTest {

  @Test
  void givenConstructor_whenBalanceIsZero_thenSucceed() {
    CurrentAccount currentAccount = new CurrentAccount(1234, "Camila");

    BigDecimal actual = currentAccount.getBalance();

    assertEquals(BigDecimal.ZERO, actual);
  }

  @Test
  void givenConstructor_whenBalanceIsBiggerThanZero_thenSucceed() {
    CurrentAccount currentAccount =
        new CurrentAccount(1234, "Camila", BigDecimal.valueOf(100d));

    BigDecimal actual = currentAccount.getBalance();

    assertEquals(BigDecimal.valueOf(100d), actual);
  }

  @Test
  void givenDeposit_whenValueDepositEquals0ThrowsIllegalArgumentException_thenSucceed() {
    CurrentAccount currentAccount = new CurrentAccount(1234, "Camila");

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> currentAccount.deposit(BigDecimal.ZERO));

    assertEquals("The deposit value is invalid!", exception.getMessage());
  }

  @Test
  void givenDeposit_whenValueDepositLessThan0ThrowsIllegalArgumentException_thenSucceed() {
    CurrentAccount currentAccount = new CurrentAccount(1234, "Camila");

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> currentAccount.deposit(BigDecimal.valueOf(-100d)));

    assertEquals("The deposit value is invalid!", exception.getMessage());
  }

  @Test
  void givenDeposit_whenValueDepositBiggerThan0_thenSucceed() {
    CurrentAccount currentAccount = new CurrentAccount(1234, "Camila");

    currentAccount.deposit(BigDecimal.valueOf(100d));
    BigDecimal actual = currentAccount.getBalance();

    assertEquals(BigDecimal.valueOf(100d), actual);
  }

  @Test
  void givenWithdraw_whenValueWithdrawEquals0ThrowsIllegalArgumentException_thenSucceed() {
    CurrentAccount currentAccount = new CurrentAccount(1234, "Camila");

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> currentAccount.withdraw(BigDecimal.ZERO));

    assertEquals("The withdraw value is invalid!", exception.getMessage());
  }

  @Test
  void givenWithdraw_whenValueWithdrawLessThan0ThrowsIllegalArgumentException_thenSucceed() {
    CurrentAccount currentAccount = new CurrentAccount(1234, "Camila");

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> currentAccount.withdraw(BigDecimal.valueOf(-10d)));

    assertEquals("The withdraw value is invalid!", exception.getMessage());
  }

  @Test
  void givenWithdraw_whenValueWithdrawBiggerThanBalanceThrowsIllegalArgumentException_thenSucceed() {
    CurrentAccount currentAccount = new CurrentAccount(1234, "Camila");
    currentAccount.deposit(BigDecimal.valueOf(100d));

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> currentAccount.withdraw(BigDecimal.valueOf(110d)));

    assertEquals("The withdraw value is invalid!", exception.getMessage());
  }

  @Test
  void givenWithdraw_whenValueWithdrawIsLessThanBalance_thenSucceed() {
    CurrentAccount currentAccount = new CurrentAccount(1234, "Camila");
    currentAccount.deposit(BigDecimal.valueOf(100d));

    currentAccount.withdraw(BigDecimal.valueOf(10d));
    BigDecimal actual = currentAccount.getBalance();

    assertEquals(BigDecimal.valueOf(90d), actual);
  }





}