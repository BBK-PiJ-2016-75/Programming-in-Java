package ex04;

public class CircularHospitalManager {
	
  private CircularPatient firstPatient = null;
  private int listCount = 0;
  
  public CircularPatient getFirstPatient() {
    return this.firstPatient;
  }
  
  public int getListCount() {
    return this.listCount;
  }
	
  // this is a member method of class HospitalManager
	public void addPatient(CircularPatient newPatient) {
    listCount++;
    if (firstPatient == null) {
      firstPatient = newPatient;
      firstPatient.setNextPatient(firstPatient);
      return;
    }
    CircularPatient current = firstPatient;
    while (current.getNextPatient() != firstPatient) {
      // this means we are not yet at the end of the list
      current = current.getNextPatient();
    }
    // at this point, current points to the last patient
    current.setNextPatient(newPatient);
    newPatient.setNextPatient(firstPatient);
  }

  // this is a member method of class HospitalManager
	// returns true if the patient was found and removed, false otherwise
  public boolean deletePatient(String name) {
    if (firstPatient == null) {
      // list is empty, nothing to remove
      return false;
    }
    CircularPatient current = firstPatient;
    while (!current.getNextPatient().getName().equals(name) 
        && current.getNextPatient() != firstPatient) {
      current = current.getNextPatient();
    }
    if (current.getNextPatient().getName().equals(name)) {
      if (current.getNextPatient() == firstPatient) {
        firstPatient = current.getNextPatient().getNextPatient();
      }
      current.setNextPatient(current.getNextPatient().getNextPatient());
      listCount--;
      return true;
    }
    return false;
  }
  
  public void printPatientList() {
    if (firstPatient == null) {
      return;
    }
    CircularPatient current = firstPatient;
    while (current.getNextPatient() != firstPatient) {
      System.out.println(current.getName());
      current = current.getNextPatient();
    }
    System.out.println(current.getName());
  }
}