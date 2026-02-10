package package1;

public class Browser {

	//created method with return type
	public String launchBrowser(String browserName)
	{
		
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	//created method with void

	public void loadUrl()
	{
		System.out.println("Application url loaded successfully ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Created object
		Browser object1=new Browser();
		object1.launchBrowser("Edge");
		object1.loadUrl();
	}
		
				
	}


