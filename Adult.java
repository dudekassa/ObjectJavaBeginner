class Adult extends Human {

public Adult(String name, String surname) {
    super(name, surname);
  }

  //methods from interface HumanInterface
  public void sayHello() {
    System.out.println("Dzień dobry");
  }

  public void sayGoodbye() {
    System.out.println("Do widzenia");
  }

}