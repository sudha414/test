package testpackage;
import testpackage.TestMethod;


public class MainMethod {

	public static void main(String[] args) {
		TestMethod tm = new TestMethod();
		double bmid = tm.calBmi(155.9, 145.3);
		System.out.println("bmi double is "+bmid);
		int bmii = tm.calBmi(162, 130);
		System.out.println("bmi int is "+bmii);

	}

}
