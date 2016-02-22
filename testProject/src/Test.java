
public class Test {
	static int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age = age+1;
		System.out.println("age"+age);
		new Test();

	}
	public Test(){
		System.out.println(this);
		int temp = this.age;
		System.out.println(temp);
	}

}
