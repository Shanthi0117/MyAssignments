package package1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable declaration
		
		int input=121;
		int temp=input;
		int output=0;
		int rem;
		
		for(int i=input;i>0;i=i/10)
		{
			rem=i%10;
			output=output*10+rem;
			System.out.println(output);
		}
		
		if(output==temp)
		{
			System.out.println("Number is palindrome" + " " +output);
	
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
	}

}
