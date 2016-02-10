package testpackage;

enum Month{
	Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
}

public class TestEnum {

	public static void main(String[] args) {
		/*enum day{
			
		}*/
		Month mon = Month.Apr;
		switch(mon){
		case Jan:
			System.out.println("This is January month");
			break;
		case Apr:
			System.out.println("This is April month");
			break;
		case Aug:
			System.out.println("This is August month");
			break;
		case Dec:
			System.out.println("This is December month");
			break;
		case Feb:
			System.out.println("This is February month");
			break;
		
		case Jul:
			System.out.println("This is July month");
			break;
		case Jun:
			System.out.println("This is June month");
			break;
		case Mar:
			System.out.println("This is March month");
			break;
		case May:
			System.out.println("This is May month");
			break;
		case Nov:
			System.out.println("This is November month");
			break;
		case Oct:
			System.out.println("This is October month");
			break;
		case Sep:
			System.out.println("This is September month");
			break;
		default:
			System.out.println("Plese enter a valid month");
			break;
		
		}
	}

}
