class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Human przemek = new Human("Przemek", "Dudek");

    Child dziecko = new Child("Janek", "Nowak");

    przemek.introduceYourself();

    przemek.sayHello();

    przemek.sayGoodbye();

    dziecko.introduceYourself();

    dziecko.sayHello();

    dziecko.sayGoodbye();

  }
}