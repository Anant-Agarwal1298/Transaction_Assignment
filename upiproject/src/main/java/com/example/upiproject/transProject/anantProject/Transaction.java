package com.example.upiproject.transProject.anantProject;

import java.util.Date;

public class Transaction {
  private String userId;
  private String recipientId;
  private String transactionId;
  private Date transactionDate;
  private Date expiryDate;
  private float amount;
  private String description;
  private TransactionStatus status;
  private TransactionType type;
  private TransactionDirection direction;
  private CustomerUPI customerUpi; // user UPI id
  private int customerVpayId;
  private String customerVpay;
  private CustomerUPI partnerUpi; // recipient UPI id
  private int partnerVpayId;
  private String partnerVpay;

  public Transaction(String userId, String recipientId, String transactionId, Date transactionDate, Date expiryDate,
      float amount, String description, TransactionStatus status, TransactionType type, TransactionDirection direction,
      CustomerUPI customerUpi, CustomerUPI partnerUpi) {
    this.userId = userId;
    this.recipientId = recipientId;
    this.transactionId = transactionId;
    this.transactionDate = transactionDate;
    this.expiryDate = expiryDate;
    this.amount = amount;
    this.description = description;
    this.status = status;
    this.type = type;
    this.direction = direction;
    this.customerUpi = customerUpi;
    this.partnerUpi = partnerUpi;

  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Date getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
  }

  public float getAmount() {
    return amount;
  }

  public void setAmount(float amount) {
    this.amount = amount;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransactionStatus getStatus() {
    return status;
  }

  public void setStatus(TransactionStatus status) {
    this.status = status;
  }

  public TransactionType getType() {
    return type;
  }

  public void setType(TransactionType type) {
    this.type = type;
  }

  public TransactionDirection getDirection() {
    return direction;
  }

  public void setDirection(TransactionDirection direction) {
    this.direction = direction;
  }

  public CustomerUPI getCustomerUpi() {
    return customerUpi;
  }

  public void setCustomerUpi(CustomerUPI customerUpi) {
    this.customerUpi = customerUpi;
  }

  public int getCustomerVpayId() {
    return customerVpayId;
  }

  public void setCustomerVpayId(int customerVpayId) {
    this.customerVpayId = customerVpayId;
  }

  public String getCustomerVpay() {
    return customerVpay;
  }

  public void setCustomerVpay(String customerVpay) {
    this.customerVpay = customerVpay;
  }

  public CustomerUPI getPartnerUpi() {
    return partnerUpi;
  }

  public void setPartnerUpi(CustomerUPI partnerUpi) {
    this.partnerUpi = partnerUpi;
  }

  public int getPartnerVpayId() {
    return partnerVpayId;
  }

  public void setPartnerVpayId(int partnerVpayId) {
    this.partnerVpayId = partnerVpayId;
  }

  public String getPartnerVpay() {
    return partnerVpay;
  }

  public void setPartnerVpay(String partnerVpay) {
    this.partnerVpay = partnerVpay;
  }
}
