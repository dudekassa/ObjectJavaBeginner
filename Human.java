public class Human {

  //fields
  private String name;

  private String surname;


  //methods
  public void sayHello() {
    System.out.println("Hello");
  }

  public void sayGoodbye() {
    System.out.println("Goodbye");
  }
  
  
  //setters and getters
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getSurname() {
    return this.surname;
  }

}