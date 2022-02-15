package dev.camila;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
Crie uma classe que modele a matrícula de um aluno de academia:
Atributos: Id matricula, data da matrícula, aluno e avaliações físicas.
Métodos: Informações da última avaliação e informações de uma avaliação pela data.
*/
public class Enrollment {
  //attributes
  private Long id;
  private LocalDate enrollmentDate = LocalDate.now();
  private Customer customer;
  private List<Assessment> assessments = new ArrayList<Assessment>();

  //methods
  public Assessment getLastAssessment() {
    int indexLastAssessment = this.assessments.size() - 1;
    Assessment lastAssessment = this.assessments.get(indexLastAssessment);
    return lastAssessment;
  }

  public Assessment getAssessmentByDate(LocalDate dateAssessmet) {
    Assessment assessment = this.assessments.stream()
        .filter(a -> a.getAssessmentDate().equals(dateAssessmet))
        .findFirst()
        .orElseThrow(() -> {
          throw new RuntimeException("Assessment not found.");
        });
    return assessment;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getEnrollmentDate() {
    return enrollmentDate;
  }

  public void setEnrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public List<Assessment> getAssessments() {
    return assessments;
  }

  public void setAssessments(List<Assessment> assessments) {
    this.assessments = assessments;
  }
}
