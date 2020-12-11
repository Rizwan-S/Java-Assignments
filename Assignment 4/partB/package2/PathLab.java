package package2;
import package1.*;
import lab4.*;

public class PathLab extends Lab {
	
	static private int key = 1;
	static private int result = 1;

	public void addTest(PathLabTest test) {   //Add test
		// generates testId, the report, 
		// and then sends it to Dispatch using processReport
		test.setresult(getreport());
		super.addtest(test);
		Lab4B.getdispatch().processReport(test);	
	}

	public void newtest(PathLabTest test)	//Assign testid
	{
		test.settestid(gettestid());
	}

	static private String gettestid()	//Get testid for the test
	{
		String testid = "P" + Integer.toString(key);
		key = key + 1;
		return testid;
	}

	static private String getreport()	//Get report for the test
	{
		String report = " ";
		if(result == 1 || result == 2)
		{
			report = "benign";
		}
		else
		{
			report = "malignant";
			result = 0;
		}
		result = result + 1;
		return report;
	}
}
