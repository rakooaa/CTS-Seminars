package solid;

public class Calculator {
	public enum Operation {ADD, SUBSTRACT, DEVIDE, MULTIPLY};
	
	public static void calculate(double a, double b, int op){
		double result = 0;
		switch(op) {
		case 1:
			result = a+b;
			break;
		case 2:
			result = a -b;
			break;
		case 3:
			result = a/b;}
		
		System.out.println(result);
	};
	
	

}
