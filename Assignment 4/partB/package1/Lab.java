package package1;

import java.util.*;

public class Lab {
	
	private ArrayList<LabTest> tests = new ArrayList<LabTest>();	//Lists of tests performed

	protected void addtest(LabTest test)	//Method to add tests
	{
		tests.add(test);
	}

	public ArrayList<LabTest> getTests() { return tests; }	//Getter for all tests
	
}