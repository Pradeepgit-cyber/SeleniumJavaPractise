
public class methodsDemo {

	public static void main(String[] args)
	{
		methodsDemo p = new methodsDemo();
		String name = p.getData();
		System.out.println(name);
		methodDemo2 a = new methodDemo2();
		a.getuserData();

	}
	
	public String getData()
	{
		System.out.println("Hello World");
		System.out.println("Hello");
		return "Pradeep";
	}

}
