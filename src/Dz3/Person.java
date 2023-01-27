package Dz3;



public class Person implements Comparable<Person>{
  private final String firstName;
  private final String surName;
  private final Integer age;
  private final Gender gender;

  public Person(String firstName, String surName, Integer birthDate, Gender gender) {
    this.firstName = firstName;
    this.surName = surName;
    this.age = birthDate;
    this.gender = gender;
  }

  public String getFirstname() {
    return this.firstName;
  }

  public String getSurname() {
    return this.surName;
  }

  public Integer getAge() {
    return this.age;
  }

  public Gender getGender() {
    return this.gender;
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s", firstName, surName, age, gender);
  }


  @Override
  public int compareTo(Person o) {
    return this.getAge() - o.getAge();
  }
}
