package Development.Assignment3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {
	
	CalcImplementation obj;	
	int a, b;
	protected void setUp() throws Exception {
		obj = new CalcImplementation();
		a = 3;
		b = 5;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(a, b)).thenReturn(a+b);
		obj.setCalc(mockObj);
		
	}

	public void testAddTwoNums() {
		
		assertEquals(8, obj.addTwoNums(a, b));
	}
	
	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}
}
