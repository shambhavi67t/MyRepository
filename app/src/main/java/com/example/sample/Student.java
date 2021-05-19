package com.example.sample;

import android.util.Log;

public class Student {
  String name;
  String lastName;
  int age;
  boolean status;
  public Student(String name,String lastName,int age,boolean status )
  {
    this.name=name;
    this.age=age;
    this.status=status;
    this.lastName=lastName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public void handleClick()
  {
    Log.d("button","from user");
  }
}
