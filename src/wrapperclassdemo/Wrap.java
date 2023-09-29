package wrapperclassdemo;

import java.util.ArrayList;

public class Wrap {
  public static void main(String[] args) {
    String s = "17";
    int c = s.charAt(0);
    int i = Integer.parseInt(s); // Integer example
    System.out.println(i);

    double d = Double.parseDouble("24"); // Double example

    ArrayList<Integer> numbers = new ArrayList(); // Not int, but Integer
  }
}
