package wrapperclassdemo;

import java.util.ArrayList;

public class Wrap {
  public static void main(String[] args) {
    String s = "17";
    int c = s.charAt(0);
    int i = Integer.parseInt(s);
    System.out.println(i);

    double d = Double.parseDouble("24");

    ArrayList<Integer> numbers = new ArrayList(); // Not int, but Integer
  }
}
