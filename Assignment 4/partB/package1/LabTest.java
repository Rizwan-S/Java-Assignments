package package1;


public class LabTest {

	String patientID;
	int price;
	String result;
	String testID;

	public LabTest(String patientId) 
	{ 
		this.patientID = patientId;
		price = 0;
		result = "Pending";
		testID = " ";
	}   // note that this should never get called explicitly
	

	public void setresult(String result){ this.result = result;}
	public void settestid(String id) {testID = id;}
	public void setprice(int pr){price = pr;}

	public String gettestid() {return testID;}
	public String getPatientId() { return patientID; }
	public int getPrice() { return price; }
	public String getResult() { return result; }
}