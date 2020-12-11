
public class Lab42 {

	public static void main(String[] args) {
		File f = new File("test1");
		
		TextFile t1 = new TextFile("text1", "contents of the text file");
		
		File f1 = t1;
		
		f1.getName();
		t1.getText();
		f1.getSize();
		t1.getSize();
		
		System.out.println(f1);
		System.out.println(t1);
		
		t1 = (TextFile) f1;
		t1.getName();
		t1.getSize();
		
		System.out.println(t1);
	
		
		//ImageFile i1 = t1;
		//ImageFile i2 = f1;
		
		//i1.getSize();
		//i2.getSize();
		
	}

}

// Move these classes into different files
