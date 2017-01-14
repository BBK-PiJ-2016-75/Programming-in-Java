public class Patient {
  
  private String name = null;
  private int age = 0;
  private String illness = null;
  private Patient nextPatient = null;
  
  public Patient(String name, int age, String illness) {
    this.name = name;
    this.age = age;
    this.illness = illness;
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
  public void setNextPatient(Patient nextPatient) {
    this.nextPatient = nextPatient;
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
  public Patient getNextPatient() {
		return this.nextPatient;
	}
}