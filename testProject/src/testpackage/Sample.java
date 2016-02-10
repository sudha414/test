package testpackage;

public class Sample {
	int id;
	String firstName;
	double height;
	
	public void printDetails(int id, String firstName, double height){
		/*id = this.id;
		firstName = this.firstName;
		height = this.height;*/
		System.out.println(id+","+firstName+","+height);
		
	}
	
	public void printDetails(int id, String firstName){
		/*id = this.id;
		firstName = this.firstName;*/
		System.out.println(id+","+firstName);
		
		//return id+","+firstName;
		
	}

}
