public class StaticDemo {

  // Objektdatametode:
  public void doStuffOnObject() {
  }

  // Klassemetode:
  public static void doStuffOnClass() {
  }
}

class MainClass {
  public static void main(String[] args) {
    StaticDemo prg = new StaticDemo();
    prg.doStuffOnObject(); // Objektdatametode - kaldes på instansen ("objektet")
    StaticDemo.doStuffOnClass(); // Klassemetode - kaldes direkte på klassen
  }
}