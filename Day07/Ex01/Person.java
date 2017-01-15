public class Person {
  
  private String name = null;
  private Person nextPerson = null;
  
  public Person(String name) {
    this.name = name;
  }
  
  public void setNextPerson(Person nextPerson) {
    this.nextPerson = nextPerson;
  }
  
  public String getName() {
    return name;
  }
  
  public Person getNextPerson() {
    return nextPerson;
  }
}