package com.test.practice;

public class Test {

	public static void main(String[] args) {
		/*Float f = new Float("12"); 
		switch (f) 
		{
		    case 12: System.out.println("Twelve"); 
		    case 0: System.out.println("Zero"); 
		    default: System.out.println("Default"); 
		}*/
		
		Object obj = new Object() 
	    {
	        public int hashCode() 
	        {
	            return 42;
	        }
	    }; 
	    System.out.println(obj.hashCode()); 
		Vehicle v;
		Car c;
		v=new Vehicle();
		//c=new Car();
		v.drive();
		//c.drive();
		//v=c;
		v.drive();
		boolean flag=false;
		if(flag=true){
			System.out.println("true");
			}
		else
			System.out.println("false");
		
		
		
		final Foo f = new Foo();
        Thread t = new Thread(new Runnable() 
        {
            public void run() 
            {
                f.doStuff();
            }
        });
        Thread g = new Thread() 
        {
            public void run() 
            {
                f.doStuff();
            }
        };
        t.start();
        g.start();
	}
	

}
class Foo 
{
    int x = 5;
    public void doStuff() 
    {
        if (x < 10) 
        {
            // nothing to do
            try 
            {
                wait();
                } catch(InterruptedException ex) { }
        } 
        else 
        {
            System.out.println("x is " + x++);
            if (x >= 10) 
            {
                notify();
            }
        }
    }
}