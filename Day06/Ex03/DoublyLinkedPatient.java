public class DoublyLinkedPatient {
  
  private String name;
  private int age;
  private String illness;
  private DoublyLinkedPatient nextPatient;
  private DoublyLinkedPatient previousPatient;
  
  public DoublyLinkedPatient(String name, int age, String illness) {
    this.name = name;
    this.age = age;
    this.illness = illness;
    this.nextPatient = null; // Pointer to another patient!
    this.previousPatient = null;
  }
  
  //Sets the patient's name.
  public void setName(String name) {
    this.name = name;
  }
  
  //Sets the patient's age.
  public void setAge(int age) {
    this.age = age;
  }
  
  //Sets the patient's illness.
  public void setIllness(String illness) {
    this.illness = illness;
  }
	
	//Sets the next patient.
  public void setNextPatient(DoublyLinkedPatient nextPatient) {
    this.nextPatient = nextPatient;
  }
  
  //Sets the previous patient.
  public void setPreviousPatient(DoublyLinkedPatient previousPatient) {
    this.previousPatient = previousPatient;
  }
  
  //Returns the patient's name.
	public String getName() {
		return this.name;
	}
  
  //Returns the patient's age.
	public int getAge() {		
		return this.age;
	}
	
	//Returns the patient's illness.
	public String getIllness() {
		return  this.illness;
	}
	
	//Returns the next patient in the list.
  public DoublyLinkedPatient getNextPatient() {
		return this.nextPatient;
	}
  
  //Returns the previous patient in the list.
  public DoublyLinkedPatient getPreviousPatient() {
    return this.previousPatient;
  }
}