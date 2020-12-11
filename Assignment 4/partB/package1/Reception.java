package package1;
import package2.*;
import lab4.*;

public class Reception {
	
	static private int pid = 1;

	public boolean addRequest(String testType, String patientName) { 
		// should create the appropriate sub-type of LabTest, 
		// add that to Billing and 
		// then to the specific lab, after generating a patient ID
		
		if(testType.equals("Bio"))
		{
			BioChemTest biotest = new BioChemTest(Integer.toString(pid));
			Lab4B.getbiochemlab().newtest(biotest);	//Get testid for the test. 
			Lab4B.getbilling().billTest(biotest);	//Send to billing
			Lab4B.getbiochemlab().addTest(biotest);	//If bill accepted by patient, perform the test
			pid = pid + 1;
			return true;
		}
		else if(testType.equals("Path"))
		{
			PathLabTest pathtest = new PathLabTest(Integer.toString(pid));
			Lab4B.getpathlab().newtest(pathtest);	//Get testid for the test
			Lab4B.getbilling().billTest(pathtest);	//Send to billing
			Lab4B.getpathlab().addTest(pathtest);	//If bill accepted by patient, perform the test
			pid = pid + 1;
			return true;
		}
		
		return false; 	
	}
}