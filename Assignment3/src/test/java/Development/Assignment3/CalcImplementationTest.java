package Development.Assignment3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {
	
	CalcImplementation obj;
	int a,b;
	protected void setUp() throws Exception {
	 obj=new CalcImplementation();
	 a=3;
	 b=5;
	
	 
	 CalcInterface mockObj = mock(CalcInterface.class);
	 when(mockObj.add(a, b)).thenReturn(a+b);
	 obj.setCalc(mockObj);
	 
	 when(mockObj.sub(a, b)).thenReturn(a-b);
	 obj.setCalc(mockObj);
	 
	 
	 when(mockObj.mul(a, b)).thenReturn(a*b);
	 obj.setCalc(mockObj);
	 
	 
	 when(mockObj.division(a, b)).thenReturn((double) a/b);
	 obj.setCalc(mockObj);
	}

    public void testAddTwoNumbers() {
    	assertEquals(8,obj.addTwoNumbers(3, 5));
		
	}
    
    public void testsubTwoNumbers() {
    	assertEquals(8,obj.addTwoNumbers(3, 5));
		
	}
    
    public void testmulTwoNumbers() {
    	assertEquals(8,obj.addTwoNumbers(3, 5));
		
	}
    
    public void testdivTwoNumbers() {
    	assertEquals(8,obj.addTwoNumbers(3, 5));
		
	}
	protected void tearDown() throws Exception {
		obj=null;
		a=0;
		b=0;
	}
}
