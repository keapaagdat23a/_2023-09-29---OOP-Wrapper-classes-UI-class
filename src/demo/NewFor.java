package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NewFor {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(7);
    numbers.add(26);

    // for (int i = 1; i <= numbers.size(); i++)
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println((i + 1) + ": " + numbers.get(i));
    }

    int count = 0;
    for (Integer myNumber : numbers) {
      count++;
      System.out.println(myNumber.intValue());
    }

    ArrayList<Person> persons = new ArrayList<>();
    for (Person p : persons) {
      p.getIt();
    }
  }
}

class Person {
  public void getIt() {
  }
}