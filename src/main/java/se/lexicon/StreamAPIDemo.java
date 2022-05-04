package se.lexicon;

import se.lexicon.model.Gender;
import se.lexicon.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPIDemo {

  public static void main(String[] args) {

    List<Person> personList = new ArrayList<>();
    personList.add(new Person("Mehrdad", "Javan", Gender.MALE, LocalDate.parse("1989-02-27"), true));
    personList.add(new Person("Simon", "Elbrink", Gender.MALE, LocalDate.parse("1979-02-01"), true));
    personList.add(new Person("MTest", "MTest", Gender.MALE, LocalDate.now(), false));


    personList.stream() // source
            .filter(person -> person.getFirstName().startsWith("M")) // intermediate operations
            .forEach(person -> System.out.println(person)); // terminal operations


  }

}
