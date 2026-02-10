package package1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration of variables
		
		int num1=0;
		int num2=1;
		int nextNum;
		int range=8;
		
		//Using for loop for execution
		
		for(int i=0;i<range;i++)
		{
			System.out.print(num1 + " ");
			nextNum=num1+num2;
			
		//swapping values
			
			num1=num2;
			num2=nextNum;
			
		}

	}

}
