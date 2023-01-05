package Amazon1;
import java.util.Scanner;
abstract  class Amazon
{
	 abstract public void login();
	 abstract public void home();
	 abstract public void profile();
	 abstract public void Cart();
	 abstract public void settings(); 
	}
	class Amazon_App extends Amazon
	{
	 public void login()
	   {
	     System.out.println("Welcome to Amazon");
	        Scanner sc=new Scanner(System.in);
	     System.out.println("Enter your Mail_ID or PhoneNumber");
	        String name=sc.next();
	     System.out.println(name); 
	     System.out.println("Enter your password"); 
	     int password=sc.nextInt();
	     System.out.println(password); 
	   }
	  public void home() 
	  {
		System.out.println("Search");
		Scanner sc=new Scanner(System.in);
		String productname=sc.next();
		System.out.println("Join Prime      Electronics       Mobiles         Fashion");
		System.out.println("Under $499");
		System.out.println("Clothing          Footwear");
		System.out.println("Watches           Grooming");
		System.out.println("See all offers");
	  }
	  public void profile() 
	 {
		  System.out.println("Hello Suresh");
		  System.out.println("Your Orders                       Buy Again ");
		  System.out.println("Your Account                      Your Wish List ");
		  System.out.println("Return to Home page ");
	 }

	
	public void Cart() {
		System.out.println("Your Orders");
		System.out.println("Payments");
		System.out.println("Contact");
	}

	
	public void settings()
	{
		System.out.println("Country & Language");
		System.out.println("Notifications");
		System.out.println("Alexa");
		System.out.println("Permissons");
		System.out.println("Legal & About");
		System.out.println("Sign Out");
	}
	public static void main(String[] args) {
		Amazon_App a=new Amazon_App();
		a.login();
		a.home();
		a.Cart();
		a.settings();
	}
	 
	}
	