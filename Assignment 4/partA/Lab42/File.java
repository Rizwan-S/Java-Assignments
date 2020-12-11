
class File {
	private String name;
	File(String n) {
		name = n;
	}
	String getName() {
		return name;
		
	}
	int getSize() { return 32; } // size of the file in bytes
	                              // Assume this is a fixed overhead for all types of files
	
	
	// override the toString method to print out the name and size of the file
    @Override
    public String toString(){
        return name + " "+ getSize();
    }

	
}

