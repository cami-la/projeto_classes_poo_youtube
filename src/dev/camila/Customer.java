package dev.camila;

import java.time.LocalDate;
import java.time.Period;

/*
Crie uma classe que modele um aluno de academia:
Atributos: Nome e data de nascimento.
Métodos: Calcula idade.
*/
public class Customer {
  //attributes
  private String name;
  private LocalDate birthday;

  //methods
  public Integer calculateAge(){
    LocalDate actualDate = LocalDate.now();
    int age = Period.between(this.birthday, actualDate).getYears();
    return age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }
}
