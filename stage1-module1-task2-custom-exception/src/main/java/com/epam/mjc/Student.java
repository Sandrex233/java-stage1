package com.epam.mjc;


import java.util.Arrays;

public enum Student {

  MAX(1, "Max", 15),
  KOLYA(2, "Kolya", 18),
  SHAIL(3, "Shail", 30),
  USHIR(4, "Ushir", 21),
  OLEG(5, "Oleg", 33),
  MIKITA(6, "Mikita", 20),
  YULIA(7, "Yulia", 18),
  STAS(8, "Stas", 25),
  PETR(9, "Petr", 58),
  ARTUR(10, "Artur", 26);

  private long id;
  private String name;
  private int age;

  Student(long id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public static Student getValueOf(long id) {
    return Arrays.stream(Student.values())
        .filter(student -> id == student.getId())
        .findFirst()
        .orElse(null);
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
