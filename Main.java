import java.util.ArrayList;
import java.util.List;

class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Human dziecko = new Child("Janek", "Nowak");
    Human dorosly = new Adult("Piotr", "Kowalski");

    //dziecko.sayHello();
    //dorosly.sayHello();

    // int[] arrayInt = new int[3];
    // for (int i = 0; i < arrayInt.length; i++) {
    //   arrayInt[i] = i;
    // }
    // for (int i = 0; i < arrayInt.length; i++) {
    //   System.out.println(arrayInt[i]);
    // }

    List<Human> humanList = new ArrayList<>();

    humanList.add(dorosly);
    humanList.add(dziecko);

    for (Human human : humanList) {
      System.out.println();
      human.introduceYourself();
      human.sayHello();
      System.out.println();
    }

  }
}