package dev.camila.test;

import dev.camila.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

  @Test
  void givenCalculateArea_whenMultiplySides_thenSucceed() {
    Rectangle rectangle = new Rectangle(5d, 2d);

    double actual = rectangle.calculateArea();

    assertEquals(10d, actual);
  }

  @Test
  void givenCalculatePerimeter_whenSumSides_theSucceed(){
    Rectangle rectangle = new Rectangle(5d, 2d);

    double actual = rectangle.calculatePerimeter();

    assertEquals(14d, actual);
  }

}