package dev.camila;

import java.time.LocalDate;

/*
Crie uma classe que modele uma avaliação física de academia:
Atributos: id, matricula do aluno, nome do avaliador, data da avaliação, peso, altura, status e imc.
Métodos: status da avaliação e incluir a avaliação a matricula do aluno.
*/
public class Assessment {
  //attributes
  private Long id;
  private Enrollment enrollment;
  private String personalName;
  private LocalDate assessmentDate = LocalDate.now();
  private Double weight;
  private Double height;
  private String status;
  private Double imc;

  //methods
  public Double calculateImc() {
    //imc = peso / altura x altura;
    double imc = this.weight / Math.pow(this.height, 2);
    return imc;
  }

  public void getStatusAssessment(){
    if(this.imc < 18.5) {
      this.status = "UNDER WEIGHT";
    } else if(this.imc >= 18.5 && this.imc <= 24.9) {
      this.status = "NORMAL WEIGHT";
    } else {
      this.status = "OVERWEIGHT";
    }
  }

  public void includeAssessmentEnrollment(){
    this.enrollment.getAssessments().add(this);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Enrollment getEnrollment() {
    return enrollment;
  }

  public void setEnrollment(Enrollment enrollment) {
    this.enrollment = enrollment;
  }

  public String getPersonalName() {
    return personalName;
  }

  public void setPersonalName(String personalName) {
    this.personalName = personalName;
  }

  public LocalDate getAssessmentDate() {
    return assessmentDate;
  }

  public void setAssessmentDate(LocalDate assessmentDate) {
    this.assessmentDate = assessmentDate;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Double getImc() {
    return imc;
  }

  public void setImc(Double imc) {
    this.imc = imc;
  }
}
