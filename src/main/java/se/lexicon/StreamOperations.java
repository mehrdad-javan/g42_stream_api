package se.lexicon;

import se.lexicon.model.Gender;
import se.lexicon.model.Person;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
  public static void main(String[] args) {
    ex6();
  }

  // Terminal Operation
  // count
  public static void ex1() {
    List<String> skills = new ArrayList<>();
    skills.add("Java SE");
    skills.add("Java EE");
    skills.add("Spring");
    skills.add("DB");
    skills.add("React");

    long result = skills.stream().count();
    System.out.println(result);

    Stream<String> names = Stream.of("Mehrdad", "Ulf", " Simon", "Marcus");
    System.out.println(names.count());

  }


  public static void ex2() {
    List<Integer> numbers = Arrays.asList(2, 100, 12, 10000, 20000);
    Comparator<Integer> comparatorLambda = (p1, p2) -> p1.compareTo(p2);

    Optional<Integer> optionalInteger = numbers.stream().min(Integer::compareTo);
    optionalInteger.ifPresent(s -> System.out.println(s));

    Optional<Integer> optionalMaxInteger = numbers.stream().max(Integer::compareTo);
    optionalMaxInteger.ifPresent(integer -> System.out.println(integer));

  }


  public static void ex3() {
    Stream<String> names = Stream.of("Mehrdad", "Ulf", " Simon", "Ulf", "Marcus");
    Optional<String> optional = names.filter(v -> v.equalsIgnoreCase("Ulf")).findFirst();
    if (optional.isPresent()) {
      System.out.println(optional.get());
    } else {
      System.out.println(" Data not found");
    }

  }

  public static void ex4() {
    Stream<String> names = Stream.of("Mehrdad", "Ulf", "Simon", "Ulf", "Marcus");
    names.forEach(s -> System.out.println(s.charAt(0)));
  }

  public static void ex5() {
    Stream<String> names = Stream.of("Mehrdad", "Ulf", "Simon", "Ulf", "Marcus");
    List<String> result = names.filter(p -> p.equalsIgnoreCase("Ulf")).collect(Collectors.toList());
    result.forEach(System.out::println);
  }


  public static void ex6(){
    List<Person> personList = new ArrayList<>();
    personList.add(new Person("Mehrdad", "Javan", Gender.MALE, LocalDate.parse("1989-02-27"), true));
    personList.add(new Person("Simon", "Elbrink", Gender.MALE, LocalDate.parse("1979-02-01"), true));
    personList.add(new Person("MTest", "MTest", Gender.MALE, LocalDate.now(), false));

  List<String> extractPersonNamesStartWithM =  personList.stream()
            .filter(person -> person.getFirstName().startsWith("M"))
            .map(person -> person.getFirstName() + " " + person.getLastName())
            .collect(Collectors.toList());

    extractPersonNamesStartWithM.forEach(System.out::println);


  }


}
