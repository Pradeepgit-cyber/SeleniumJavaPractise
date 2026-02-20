package JavaTest;

public class FirstClass
{
	public static void main1(String[] args) 
	{
}

//	    Method
	    public void getData()
	    {
	        System.out.println("I am in First method");
	    }

	    public static void main(String[] args){
	        FirstClass fn = new FirstClass();
	        fn.getData();
	        SecondClass sn = new SecondClass();
	        sn.setData();
	        System.out.println("Hello World");
	}

}
