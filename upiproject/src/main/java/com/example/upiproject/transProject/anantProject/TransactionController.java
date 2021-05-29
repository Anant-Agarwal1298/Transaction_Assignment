package com.example.upiproject.transProject.anantProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TransactionController {

  @Autowired
  private Database database;

  //http://localhost:8080/dev.onebanc.ai/assignment.asmx/getTransactionHistory/abc
  @GetMapping("/dev.onebanc.ai/assignment.asmx/getTransactionHistory/{userId}")
  public ResponseEntity<List<Transaction>> getTransactionHistory(@PathVariable("userId") String userId) {

    List<Transaction> transactions = database.userIdToTransactions.get(userId);
    if (transactions.size() <= 0) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    return ResponseEntity.of(Optional.of(transactions));
  }
}
