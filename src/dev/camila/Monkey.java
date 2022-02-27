package dev.camila;

import java.util.ArrayList;
import java.util.List;

/*
Crie uma classe que modele um macaco.
Atributos: Nome e bucho (estômago).
Métodos: Comer, verBucho e digerir.
Experimente fazer com que um macaco coma o outro. É possível criar um macaco canibal?
*/
public class Monkey {
  //attributes
  private String name;
  private List<Object> stomach = new ArrayList<>();

  //methods
  public List<Object> eat(Object food) {
    if(food instanceof String || food instanceof Monkey) {
      this.stomach.add(food);
    } else {
      throw new IllegalArgumentException("Food not allowed");
    }
    return this.stomach;
  }

  public List<Object> digest(){
    if(this.stomach.isEmpty()) {
      throw new RuntimeException("Empty Stomach!");
    }
    this.stomach.remove(0);
    return this.stomach;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Object> getStomach() {
    return stomach;
  }

}
