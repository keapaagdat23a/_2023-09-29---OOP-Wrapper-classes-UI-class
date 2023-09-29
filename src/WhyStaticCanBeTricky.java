public class WhyStaticCanBeTricky {
  // WHAT NOT TO DO
  static int playerField = 10; // Could also be private - some problem!

  public static void main(String[] args) {
    WhyStaticCanBeTricky.movePlayer();
  }

  // WHAT NOT TO DO
  private static void movePlayer() {
    playerField++;
  }
}
