package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
  private String firstName;
  private String lastName;
  private Gender gender;
  private LocalDate birthDate;
  private boolean active;

  public Person() {
  }

  public Person(String firstName, String lastName, Gender gender, LocalDate birthDate, boolean active) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.birthDate = birthDate;
    this.active = active;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return active == person.active && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Objects.equals(birthDate, person.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, gender, birthDate, active);
  }

  @Override
  public String toString() {
    return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", gender=" + gender +
            ", birthDate=" + birthDate +
            ", active=" + active +
            '}';
  }
}
