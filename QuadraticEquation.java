<<<<<<< HEAD
public class QuadraticEquation{
	private int coefficientOfXSquared;
	private int coefficientOfX;
	private int constant;
	private double x1;
	private double x2;

	public void setCoefficientOfXSquared(int number){
		coefficientOfXSquared = number;
	}
	public int getCoefficientOfXSquared(){
		return coefficientOfXSquared;
	}
	public void setCoefficientOfX(int number){
		coefficientOfX = number;
	}
	public int getCoefficientOfX(){
		return coefficientOfX;
	}
	public void setConstant(int constant){
		this.constant = constant;
	}
	public int getConstant(){
		return constant;
	}
	public void calculateX1(){
		double squareRootValue = Math.sqrt((coefficientOfX * coefficientOfX) - (4 * coefficientOfXSquared * constant));
		x1 =(-coefficientOfX + squareRootValue) / (2 * coefficientOfXSquared);
	}
	public double getX1(){
		return x1;
	}
	public void calculateX2(){
		double squareRootValue = Math.sqrt((coefficientOfX * coefficientOfX) - (4 * coefficientOfXSquared * constant));
		x2 =(-coefficientOfX - squareRootValue) / (2 * coefficientOfXSquared);
	}
	public double getX2(){
		return x2;
	}
	

=======
public class QuadraticEquation{
	private int coefficientOfXSquared;
	private int coefficientOfX;
	private int constant;
	private double x1;
	private double x2;

	public void setCoefficientOfXSquared(int number){
		coefficientOfXSquared = number;
	}
	public int getCoefficientOfXSquared(){
		return coefficientOfXSquared;
	}
	public void setCoefficientOfX(int number){
		coefficientOfX = number;
	}
	public int getCoefficientOfX(){
		return coefficientOfX;
	}
	public void setConstant(int constant){
		this.constant = constant;
	}
	public int getConstant(){
		return constant;
	}
	public void calculateX1(){
		double squareRootValue = Math.sqrt((coefficientOfX * coefficientOfX) - (4 * coefficientOfXSquared * constant));
		x1 =(-coefficientOfX + squareRootValue) / (2 * coefficientOfXSquared);
	}
	public double getX1(){
		return x1;
	}
	public void calculateX2(){
		double squareRootValue = Math.sqrt((coefficientOfX * coefficientOfX) - (4 * coefficientOfXSquared * constant));
		x2 =(-coefficientOfX - squareRootValue) / (2 * coefficientOfXSquared);
	}
	public double getX2(){
		return x2;
	}
	

>>>>>>> 8f6eae29619dad069f09852aad400bfce16808ee
}