package dev.camila.test;

import dev.camila.Rectangle;
import dev.camila.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

  private Square square;

  @BeforeEach
  void setup(){
    square = new Square(8d, 8d);
  }

  @Test
  void givenCalculateArea_whenMultiplySides_thenSucceed() {
    //Square square = new Square(8d, 8d);

    square.setSideA(2d);
    square.setSideB(2d);
    double actual = square.calculateArea();

    assertEquals(4d, actual);
  }

  @Test
  void givenCalculatePerimeter_whenSumSides_theSucceed(){
    //Square square = new Square(8d, 8d);

    //square.setSideA(5d);
    //square.setSideB(5d);
    double actual = square.calculatePerimeter();

    assertEquals(32d, actual);
  }

}