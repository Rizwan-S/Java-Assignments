package lab4;

import java.util.*;
import package1.*;
import package2.*;

public class Lab4B {

	static Reception recep = new Reception();
	static Billing billin = new Billing();
	static Dispatch disp = new Dispatch();
	static BioChemLab biolab = new BioChemLab();
	static PathLab path = new PathLab();

	static public Reception getreception() {return recep;}
	static public Billing getbilling() {return billin;}
	static public Dispatch getdispatch() {return disp;}
	static public BioChemLab getbiochemlab() {return biolab;}
	static public PathLab getpathlab() {return path;}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// create instance of Reception, Billing, Dispatch, BioChemLab, PathLab
		

		// read in the input for test requests, and send to Reception (addRequest)
		int n = scan.nextInt();
		for(int i = 0; i < n; i++)
		{
			String request = scan.next();
			boolean sent = recep.addRequest(request, Integer.toString(i));
		}
		
		// get all bills from Billing and print out the total for the day
		ArrayList<String> bills = billin.getBills();
		int total = 0;
		for(String bill: bills)
		{
			String data[] = bill.split(" ", -1);
			total = total + Integer.valueOf(data[1]);
		}
		System.out.println("Total billed: " + total);


		// get all reports from Dispatch and print out one line at a time
		// Each line will have: Patient ID, Test ID, result string
		ArrayList<String> reports = disp.getAllResults();
		System.out.println("Reports:");
		for(String report: reports)
		{
			System.out.println(report);
		}
		
		// get list of tests from each lab, and print out total tests per lab
		System.out.println("Total tests:");
		System.out.println("BioChem: " + biolab.getTests().size());
		System.out.println("Path: " + path.getTests().size());
		
	}

}

// Move to different packages and files
// Many return statements have default values (to allow them to be compiled. 
// Replace with the correct statements.

