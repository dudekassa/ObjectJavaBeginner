import java.util.ArrayList;
import java.util.List;

class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Human dziecko = new Child("Janek", "Nowak");
    Human dziecko2 = new Child("Antuś", "Bułka");
    Human dziecko3 = new Child("Zosia", "Samosia");
    Human dorosly = new Adult("Piotr", "Kowalski");
    //w tym miejscu trzeba stworzyć osoby


    List<Human> humanList = new ArrayList<>();

    humanList.add(dorosly);
    humanList.add(dziecko);
    humanList.add(dziecko2);
    humanList.add(dziecko3);
    //w tym miejscu trzeba dodać kolejen osoby do listy

    for (Human human : humanList) {
      System.out.println();
      human.introduceYourself();
      human.sayHello();
      System.out.println();
    }

  }
}