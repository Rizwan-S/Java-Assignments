package package2;
import package1.*;
import lab4.*;

public class BioChemLab extends Lab {

	static private int key = 1;
	static private int result = 99;
	
	public void addTest(BioChemTest test) {   	//Add test
		// generates testId, the report, 
		// and then sends it to Dispatch using processReport
		test.setresult(getreport());
		super.addtest(test);
		Lab4B.getdispatch().processReport(test);
	}

	public void newtest(BioChemTest test)	//Assign testid to the test
	{
		test.settestid(gettestid());
	}

	static private String gettestid()		//Method to get test id
	{
		String testid = "B" + Integer.toString(key);
		key = key + 1;
		return testid;
	}

	static private String getreport()		//Get report of the test
	{
		result = result + 1;
		return Integer.toString(result);
	}

}