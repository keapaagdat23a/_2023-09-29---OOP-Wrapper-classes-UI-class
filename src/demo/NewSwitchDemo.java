package demo;

public class NewSwitchDemo {
  public static void main(String[] args) {
    int i = 34;

    // Old switch:
    switch (i) {
      case 0:
        System.out.println("zero");
        break;
      case 1:
        System.out.println("one");
        break;
      default:
        System.out.println("other");
        break;
    }

    // New switch:
    switch (i) {
      case 0 -> System.out.println("zero");
      case 1 -> System.out.println("one");
      default -> System.out.println("other");
    }
  }
}
