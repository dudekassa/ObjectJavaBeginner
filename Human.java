abstract class Human implements HumanInterface {

  //fields
  private String name;

  private String surname;

  private int age = 0;

  //contructors
  public Human(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  //methods

  public void introduceYourself() {
    System.out.println(this.name + " " + this.surname);
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

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}