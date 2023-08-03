package ex02_OutputStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 직렬화(Serializable : 직렬화 할 수 있는 ) 처리하기
 * 1. java.io.Serializable 인터페이스를 구현(implements)한다.
 * 2. long serialVersionUID 필드 값을 생성한다. (serialVersion Unique ID 줄임말)
 */

public class Student implements Serializable {
  
  private static final long serialVersionUID = -988261495718805568L;
  private String name;
  private int age;
  private double height;
  private String school;

  public Student() {
  }

  public Student(String name, int age, double height, String school) {
    super();
    this.name = name;
    this.age = age;
    this.height = height;
    this.school = school;
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

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", height=" + height + ", school=" + school + "]";
  }
}
