package Development.Assignment3;

public class CalcImplementation {

	CalcInterface calc;
	
	public void setCalc(CalcInterface calc) {
		this.calc = calc;
	}
	
	public int addTwoNums(int a, int b) {
		return calc.add(a, b);
	}
}
