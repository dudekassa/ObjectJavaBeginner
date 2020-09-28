class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Human dziecko = new Child("Janek", "Nowak");
    Human dorosly = new Adult("Piotr", "Kowalski");

    dziecko.sayHello();

    dorosly.sayHello();



  }
}