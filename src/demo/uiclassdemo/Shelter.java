package demo.uiclassdemo;

public class Shelter {
  public static void main(String[] args) {
    UI ui = new UI();
    Cat c = new Cat();
    int age = ui.promptInt("How old is your cat? ");
    String name = ui.promptString("What is the cat's name? ");
    c.setAge(age);
    c.setName(name);
  }
}
