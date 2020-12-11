package package1;

import java.util.*;

public class Dispatch {
	
	private static ArrayList<String>reports = new ArrayList<String>();	//Lists of test

	public void processReport(LabTest test) {
		String report = test.getPatientId() + " " + test.gettestid() + " " + test.getResult();	//Process and add reports
		reports.add(report);
	}   // called by individual labs 

	public ArrayList<String> getAllResults() { return reports; }	//Getter for reports

}