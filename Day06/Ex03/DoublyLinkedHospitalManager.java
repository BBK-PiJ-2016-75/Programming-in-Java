public class HospitalManager {
	private Patient firstPatient = null;
  private int listCount = 0;
  
  public Patient getFirstPatient() {
    return this.firstPatient;
  }
  
  public int getListCount() {
    return this.listCount;
  }
	
  // this is a member method of class HospitalManager
	public void addPatient(Patient newPatient) {
    listCount++;
    if (firstPatient == null) {
      firstPatient = newPatient;
      return;
    }
    Patient current = firstPatient;
    while (current.getNextPatient() != null) {
      // this means we are not yet at the end of the list
      current = current.getNextPatient();
    }
    // at this point, current points to the last patient
    current.setNextPatient(newPatient);
  }

  // this is a member method of class HospitalManager
	// returns true if the patient was found and removed, false otherwise
  public boolean deletePatient(String name) {
    if (firstPatient == null) {
      // list is empty, nothing to remove
      return false;
    }
    if (firstPatient.getName().equals(name)) {
      // first patient in the list must be removed
      firstPatient = firstPatient.getNextPatient();
      listCount--;
      return true;
    }
    Patient current = firstPatient;
    while (current.getNextPatient() != null) {
      if (current.getNextPatient().getName().equals(name)) {
        // We found it! It is the next one!
        // Now link this patient to the one after the next
        current.setNextPatient(current.getNextPatient().getNextPatient());
        listCount--;
        return true;
      }
      current = current.getNextPatient();
    }
    return false;
  }
  
  public void printPatientList() {
    if (firstPatient == null) {
      return;
    }
    Patient current = firstPatient;
    while (current.getNextPatient() != null) {
      System.out.println(current.getName());
      current = current.getNextPatient();
    }
    System.out.println(current.getName());
  }
}