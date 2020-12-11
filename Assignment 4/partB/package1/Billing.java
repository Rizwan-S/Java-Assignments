package package1;

import package2.*;
import java.util.*;

public class Billing {
	
	static private ArrayList<String>bills = new ArrayList<String>();

	void billTest(LabTest test) {	//Bill the test

		if(test instanceof BioChemTest)	//If BioChemTest, charge 400
		{
			test.setprice(400);
		}
		else if(test instanceof PathLabTest)	//If PathLabTest, charge 1000
		{
			test.setprice(1000);
		}

		String bill = test.gettestid() + " " + test.getPrice();	//Add to bills
		bills.add(bill);
	}  // called by Reception
	
	public ArrayList<String> getBills() { return bills; } // one string for each test
			// each string has testId and billed amount, separated by a space
	
}