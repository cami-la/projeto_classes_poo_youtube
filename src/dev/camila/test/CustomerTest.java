package dev.camila.test;

import dev.camila.Customer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static java.time.Month.JANUARY;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

  @Test
  void givenCalculateAge_whenReturnCustomerAge_thenSucceed() {
    Customer customer = new Customer();
    customer.setBirthday(LocalDate.of(1994, JANUARY, 13));

    Integer actual = customer.calculateAge();

    assertEquals(28, actual);
  }
}