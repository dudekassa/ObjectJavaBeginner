public class Human {

  private String name;

  private String surname;


  public void sayHello() {
    System.out.println("Hello");
  }
  
  
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