package JavaTest;

public class stringClassDemo {
//	public class stringclassDemo {

	    public static void main(String[] args){

	        String a = " PradeepLearning";
	        System.out.println(a.charAt(2));
	        System.out.println(a.indexOf("z"));
	        System.out.println(a.substring(3, 6));
	        System.out.println(a.substring(3));
	        System.out.println(a.concat("is in progress"));
	        System.out.println(a.length());
	        System.out.println(a.trim());
	        System.out.println(a.toUpperCase());
	        System.out.println(a.toLowerCase());
	        String[] arr = a.split("L");
	        System.out.println(arr[0]);
	        System.out.println(arr[1]);
	        System.out.println(a.replace("P", "p"));


	    }
	}

