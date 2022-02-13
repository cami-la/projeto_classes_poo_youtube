package dev.camila;

/*
Crie uma classe que modele um retangulo:
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher).
Métodos: Mudar valor dos lados, retornar valor dos lados, calcular área e calcular perímetro.
*/
public class Rectangle {
  //attributes
  private double sideA;
  private double sideB;

  //methods
  public Rectangle(double sideA, double sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  public double calculateArea(){
    return this.sideA * this.sideB;
  }

  public double calculatePerimeter(){
    return 2 * (this.sideA + this.sideB);
  }

  public double getSideA() {
    return sideA;
  }

  public void setSideA(double sideA) {
    this.sideA = sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public void setSideB(double sideB) {
    this.sideB = sideB;
  }
}
