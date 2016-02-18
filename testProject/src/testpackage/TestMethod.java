package testpackage;

public class TestMethod {
	int height;
	int weight;
	double height1;
	double weight1;
	
	public int calBmi(int height,int weight){
		int bmiInt=0;
		bmiInt = height/weight;
		return bmiInt;
	}
	
	public double calBmi(double height1,double weight1){
		double bmiInt=0;
		bmiInt = height1/weight1;
		return bmiInt;
	}

}
