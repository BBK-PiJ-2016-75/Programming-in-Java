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
    if (firstPatient.getName().equals(name)) {
      // first patient in the list must be removed
      firstPatient = firstPatient.getNextPatient();
      listCount--;
      return true;
    }
    CircularPatient current = firstPatient;
    while (current.getNextPatient() != firstPatient) {
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
    CircularPatient current = firstPatient;
    while (current.getNextPatient() != firstPatient) {
      System.out.println(current.getName());
      current = current.getNextPatient();
    }
    System.out.println(current.getName());
  }
}