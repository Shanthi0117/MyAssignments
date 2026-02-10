package package1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//Declaring variables
		int n=5;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				System.out.println("Given number is prime number");
			}
			else
			{
				System.out.println("Given number is not prime number");
			}
		}

	}

}
