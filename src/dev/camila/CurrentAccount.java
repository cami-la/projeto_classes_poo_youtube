package dev.camila;

import java.math.BigDecimal;

/*
Crie uma classe que modele uma conta corrente.
Atributos: número da conta, nome do correntista e saldo.
Métodos: depósito e saque.
No construtor, o saldo é opcional, com o valor default zero e os demais atributos são obrigatórios.
*/
public class CurrentAccount {
  //attributes
  private int accountNumber;
  private String customerName;
  private BigDecimal balance;

  //methods
  public CurrentAccount(int accountNumber, String customerName) {
    this.accountNumber = accountNumber;
    this.customerName = customerName;
    this.balance = BigDecimal.ZERO;
  }

  public CurrentAccount(int accountNumber, String customerName, BigDecimal balance) {
    this.accountNumber = accountNumber;
    this.customerName = customerName;
    this.balance = balance;
  }

  public void deposit(BigDecimal depositValue){
    if(depositValue.compareTo(BigDecimal.ZERO) <= 0){
      throw new IllegalArgumentException("The deposit value is invalid!");
    }
    this.balance = this.balance.add(depositValue);
  }

  public void withdraw(BigDecimal withdrawValue) {
    if(withdrawValue.compareTo(BigDecimal.ZERO) <= 0 || withdrawValue.compareTo(this.balance) == 1){
      throw new IllegalArgumentException("The withdraw value is invalid!");
    }
    this.balance = this.balance.subtract(withdrawValue);
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public BigDecimal getBalance() {
    return balance;
  }

}
