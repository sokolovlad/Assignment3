package Development.Assignment3;

public class CalcImplementation {

	CalcInterface calc;
	
	public void setCalc(CalcInterface calc) {
		this.calc = calc;
	}

	public int addTwoNumbers(int a , int b) {
		
		return calc.add(a, b);
	}
    
	public int  subTwonumbers(int a, int b) {
		return calc.sub(a, b);
	}
	
	public int mulTwonumbers(int a, int b) {
		return calc.mul(a, b);
	}
	
	public double divTwonumbers(int a, int b) {
		return calc.division(a, b);
	}
}
