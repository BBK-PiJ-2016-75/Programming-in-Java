public class TestHospitalManager {
	
  public static void main(String[] args) {
    TestHospitalManager tester = new TestHospitalManager();
    tester.run();
  }
  
  public void run() {
		
    //Patient fPatient = hm.getFirstPatient();
		//System.out.println("Patient name: " + fPatient.getName());
		
		boolean running = true;
    while (running) {
      System.out.println ("What would you like to do?");
      System.out.println ("1 - Add a new patient file");
      System.out.println ("2 - Delete an existing patient file");
      System.out.println ("0 - Exit");
      System.out.println("\n >");
		  
		  //Scanner reader = new Sca(System.in);
		  //int imput = reader.nextInt();
		  try {
        String userInput = System.console().readLine();
			  
			  int userSelection = Integer.parseInt(userInput);

			  switch (userSelection) {
          case 0:
          running = false;
				  break;
          
          case 1: 
				  System.out.println("Please enter patient details.");
					System.out.println("You selected option 1 : Enter first name:");
					String name = System.console().readLine();
          System.out.println("Please Enter age:");
					int age = Integer.parseInt(System.console().readLine());
          System.out.println("Please Enter illness:");
          String illness = System.console().readLine();
          HospitalManager hm = new HospitalManager(name, age, illness);
          Patient fPatient =  hm.getFirstPatient();
          hm.addPatient(fPatient);
          System.out.println("\n");
          System.out.println("Name: " + fPatient.getName() + " Age: " + fPatient.getPatAge() + " illness :" + fPatient.getPatientIllness());
          System.out.println("\n");
          break;
          
          case 2:
          break;
          
          default:
          System.out.println ("Invalid option selected. Please try again.");
        }
			}
			catch(NumberFormatException e) {
        running = false;
				System.out.println("Please enter a valid integer. Error processing imput.");
      }
    }
  }
}