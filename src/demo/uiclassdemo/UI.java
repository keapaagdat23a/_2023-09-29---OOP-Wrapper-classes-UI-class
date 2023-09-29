package demo.uiclassdemo;

import java.util.Scanner;

public class UI {
  private Scanner keyboard;

  public UI() {
    keyboard = new Scanner(System.in);
  }

  public void println(String msg) {
    System.out.println(msg);
  }

  public int promptInt(String msg) {
    System.out.print(msg);
    int i = keyboard.nextInt();
    return i;
  }
}
