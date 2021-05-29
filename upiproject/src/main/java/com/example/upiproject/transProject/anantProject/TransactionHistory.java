package com.example.upiproject.transProject.anantProject;

import java.util.List;

public class TransactionHistory {
  List<Transaction> transactions; // sorted order on Date

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }
}
