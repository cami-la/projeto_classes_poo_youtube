package dev.camila.test;

import dev.camila.Monkey;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MonkeyTest {
  private Monkey monkey;

  @BeforeEach
  void setup(){
    monkey = new Monkey();
  }

  @Test
  void givenEat_whenMonkeyToTryToEatFruit_thenSucceed(){
    Monkey monkey2 = new Monkey();
    List<Object> actual = monkey.eat("banana");
    monkey.eat(monkey2);

    List<Object> expected = List.of("banana", monkey2);

    assertIterableEquals(expected, actual);
    assertEquals(2, monkey.getStomach().size());
  }

  @Test
  void givenEat_whenMonkeyToTryToEatOtherMonkey_thenSucceed(){
    Monkey monkey2 = new Monkey();
    List<Object> actual = monkey.eat(monkey2);
    monkey.eat("orange");

    List<Object> expected = List.of(monkey2, "orange");

    assertIterableEquals(expected, actual);
    assertEquals(2, monkey.getStomach().size());
  }

  @Test
  void givenEat_whenMonkeyToTryToEatSomeDifferentFruitOrMonkeyThrowsIllegalArgumentException_thenSucceed(){
    IllegalArgumentException illegalArgumentException =
        assertThrows(IllegalArgumentException.class, () -> monkey.eat(1d));

    assertEquals("Food not allowed", illegalArgumentException.getMessage());
    assertEquals(0, monkey.getStomach().size());
  }

  @Test
  void givenDigest_whenMonkeyToDigestFood_thenSucceed(){
    Monkey monkey2 = new Monkey();
    monkey.eat("banana");
    monkey.eat("grape");
    monkey.eat(monkey2);

    monkey.digest();
    monkey.digest();
    List<Object> actual = monkey.digest();

    assertEquals(0, actual.size());
  }

  @Test
  void givenDigest_whenMonkeyToTryToDigestWithEmptyStomachThrowsRuntimeException_whenSucceed(){
    Monkey monkey2 = new Monkey();
    monkey.eat("banana");
    monkey.eat("grape");
    monkey.eat(monkey2);

    monkey.digest();
    monkey.digest();
    monkey.digest();

    RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> monkey.digest());

    assertEquals("Empty Stomach!", runtimeException.getMessage());
  }

}