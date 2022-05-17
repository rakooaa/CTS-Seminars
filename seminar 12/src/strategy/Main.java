package strategy;

public class Main {
	
	//aplicam una dintre strategii pentru a iindeplini un scop
	public static void main (String args[]) {
		int[] values=new int[10];
		for (int i=0; i<10; i++)
			if(i%2==0)
				values[i]=-i*2+3;
			else
				values[i]=i*3+1;
		for(int i=0; i<values.length; i++)
			System.out.print(values[i]+ " ");
		DataContext context=new DataContext(values, new StrategyDetMax());
		int val=context.processValue();
		System.out.println("\nValue: "+val);
}
}