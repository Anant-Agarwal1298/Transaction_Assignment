package com.example.upiproject.transProject.anantProject;

public class CustomerUPI {
  private int customerVpayId;
  private String customerVpay;

  public CustomerUPI(int customerVpayId, String customerVpay) {
    this.customerVpayId = customerVpayId;
    this.customerVpay = customerVpay;
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

}
