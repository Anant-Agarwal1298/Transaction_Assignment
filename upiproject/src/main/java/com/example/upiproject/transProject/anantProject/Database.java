package com.example.upiproject.transProject.anantProject;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// import java.util.Map.Entry;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class Database {
  Map<String, List<Transaction>> userIdToTransactions;

  public Database() {
    try {
      userIdToTransactions = new HashMap<>();
      List<Transaction> anantTrans = new ArrayList<>();
      List<Transaction> anantTrans1 = new ArrayList<>();
      List<Transaction> anantTrans2 = new ArrayList<>();
      anantTrans.add(new Transaction("abc", "xyz", "4533332", new Date(), new Date(), 654.50f, "Rent",
          TransactionStatus.Confirmed, TransactionType.PAY, TransactionDirection.Sent,
          new CustomerUPI(6554322, "anant@ybl"), new CustomerUPI(76443733, "akash@abc")));
      anantTrans1.add(new Transaction("gfh", "amay", "4533332", new Date(), new Date(), 3854.50f, "Rent",
          TransactionStatus.Confirmed, TransactionType.PAY, TransactionDirection.Sent,
          new CustomerUPI(6554322, "aman@ybl"), new CustomerUPI(76443733, "kuldeep@abc")));
      anantTrans2.add(new Transaction("jhd", "chirag", "4533332", new Date(), new Date(), 76654.50f, "Rent",
          TransactionStatus.Confirmed, TransactionType.PAY, TransactionDirection.Sent,
          new CustomerUPI(6554322, "alokik@ybl"), new CustomerUPI(76443733, "anchal@abc")));
      userIdToTransactions.put("abc", anantTrans);
      userIdToTransactions.put("gfh", anantTrans1);
      userIdToTransactions.put("jhd", anantTrans2);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
