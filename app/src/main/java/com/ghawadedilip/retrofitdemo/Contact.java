package com.ghawadedilip.retrofitdemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dilip on 21-Nov-17.
 */

public class Contact {

  @SerializedName("emp_name")
  @Expose
  private String empName;
  @SerializedName("emp_email")
  @Expose
  private String empEmail;

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmpEmail() {
    return empEmail;
  }

  public void setEmpEmail(String empEmail) {
    this.empEmail = empEmail;
  }
}
