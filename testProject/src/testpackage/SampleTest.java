package testpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void testEvenOdd() {
		MyEvenOdd meo = new MyEvenOdd();
		assertEquals("11 is not an even number", true, meo.isEvenOdd(11));
		
	}

}
